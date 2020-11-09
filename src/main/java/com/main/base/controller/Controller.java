package com.main.base.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.base.dto.MantenimientoDTO;
import com.main.base.dto.PersonaDTO;
import com.main.base.dto.QueryResponse;
import com.main.base.dto.RutasDTO;
import com.main.base.model.Ciudad;
import com.main.base.model.Mantenimiento;
import com.main.base.model.Persona;
import com.main.base.model.Ruta;
import com.main.base.model.Vehiculo;
import com.main.base.service.CiudadService;
import com.main.base.service.MantenimientoService;
import com.main.base.service.PersonaService;
import com.main.base.service.RutaService;
import com.main.base.service.VehiculoService;

@RestController
public class Controller {
	
	@Autowired
	private VehiculoService VehiculoService;
	@Autowired
	private MantenimientoService MantenimientoService;
	@Autowired
	private PersonaService PersonaService;
	@Autowired
	private CiudadService CiudadService;
	@Autowired
	private RutaService RutaService;
	@CrossOrigin
	@GetMapping("/api/vehiculos")
	public ResponseEntity<List<Vehiculo>> getVehiculos(){
		List<Vehiculo> list = VehiculoService.list();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/api/vehiculo/{id}")
	public ResponseEntity<Vehiculo> getVehiculo(@PathVariable long id){
		Vehiculo list = VehiculoService.get(id);
		return ResponseEntity.ok().body(list);
	}
	@DeleteMapping("/api/vehiculo/delete/{id}")
	public ResponseEntity<Object> deleteVehiculo(@PathVariable long id){
		VehiculoService.delete(id);
		return ResponseEntity.ok().body(null);
	}
	@CrossOrigin
	@PostMapping("/api/vehiculos")
	public ResponseEntity<QueryResponse> saveVehiculo(@RequestBody Vehiculo vehiculo){
		QueryResponse value = VehiculoService.save(vehiculo);
		return ResponseEntity.ok().body(value);
	}
	@PutMapping("/api/vehiculo/{id}")
	public ResponseEntity<String> updateVehiculo(@PathVariable long id,@RequestBody Vehiculo vehiculo){
		VehiculoService.update(id,vehiculo);
		return ResponseEntity.ok().body("Record updated successfully!");
	}
	@CrossOrigin
	@GetMapping("/api/mantenimientos")
	public ResponseEntity<List<Mantenimiento>> getMantenimientos(){
		List<Mantenimiento> list = MantenimientoService.list();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping("/api/mantenimiento/{id}")
	public ResponseEntity<Mantenimiento> getMantenimiento(@PathVariable long id){
		Mantenimiento m = MantenimientoService.get(id);
		return ResponseEntity.ok().body(m);
	}
	@PostMapping("/api/mantenimientos")
	public ResponseEntity<Long> saveMantenimiento(@RequestBody MantenimientoDTO mant){
		Vehiculo v = VehiculoService.get(mant.getVehiculoId());
		Mantenimiento m = new Mantenimiento(mant.getDetails(),mant.getFecha(),mant.getCosto(),v);
		long value = MantenimientoService.save(m);
		return ResponseEntity.ok().body(value);
	}
	@CrossOrigin
	@GetMapping("/api/personas")
	public ResponseEntity<List<PersonaDTO>> getPersonas(){
		List<Persona> list = PersonaService.list();
		return ResponseEntity.ok().body(list.stream().map(this::personToPersonDto).collect(Collectors.toList()));
	}
	@GetMapping("/api/persona/{id}")
	public ResponseEntity<Persona> getPersona(@PathVariable long id){
		Persona p = PersonaService.get(id);
		return ResponseEntity.ok().body(p);
	}
	@PostMapping("/api/personas")
	public ResponseEntity<QueryResponse> savePersona(@RequestBody Persona per){
		System.out.println(per.toString());
		QueryResponse value = PersonaService.save(per);
		return ResponseEntity.ok().body(value);
	}
	@PutMapping("/api/persona/{id}")
	public ResponseEntity<String> updatePersona(@PathVariable long id,@RequestBody Persona persona){
		PersonaService.update(id,persona);
		return ResponseEntity.ok().body("Record updated successfully!");
	}
	@DeleteMapping("/api/persona/delete/{id}")
	public ResponseEntity<Object> deletePersona(@PathVariable long id){
		PersonaService.delete(id);
		return ResponseEntity.ok().body(null);
	}
	@PostMapping("/api/rutas")
	public ResponseEntity<Long> saveRutas(@RequestBody RutasDTO ruta){
		Vehiculo v = VehiculoService.get(ruta.idVehiculo);
		Persona p = PersonaService.get(ruta.idConductor);
		Ciudad origen = CiudadService.get(ruta.idOrigen);
		Ciudad destino = CiudadService.get(ruta.idDestino);
		Ruta r = new Ruta(origen,destino,v,p);
		long value = RutaService.save(r);
		return ResponseEntity.ok().body(value);
	}
	@GetMapping("/api/rutas")
	public ResponseEntity<List<Ruta>> getRutas(){
		List<Ruta> list = RutaService.list();
		return ResponseEntity.ok().body(list);
	}
	private PersonaDTO personToPersonDto(Persona p) {
		PersonaDTO pdto = new PersonaDTO();
		pdto.setAge(p.getAge());
		pdto.setId(p.getId());
		pdto.setName(p.getName());
		pdto.setLastname(p.getLastname());
		pdto.setDocumentNumber(p.getDocumentNumber());
		pdto.setPersontype(p.getPersontype().getDescription());
		return pdto;
	}
}

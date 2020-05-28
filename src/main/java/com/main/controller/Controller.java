package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Mantenimiento;
import com.main.model.Vehiculo;
import com.main.service.MantenimientoService;
import com.main.service.VehiculoService;

@RestController
public class Controller {
	
	@Autowired
	private VehiculoService VehiculoService;
	@Autowired
	private MantenimientoService MantenimientoService;
	
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
	@GetMapping("/api/vehiculo/delete/{id}")
	public ResponseEntity<Object> deleteVehiculo(@PathVariable long id){
		VehiculoService.delete(id);
		return ResponseEntity.ok().body(null);
	}
	
	@PostMapping("/api/vehiculos")
	public ResponseEntity<Long> saveVehiculo(@RequestBody Vehiculo vehiculo){
		long value = VehiculoService.save(vehiculo);
		return ResponseEntity.ok().body(value);
	}
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
	public ResponseEntity<Long> saveMantenimiento(@RequestBody Mantenimiento mant){
		
		long value = MantenimientoService.save(mant);
		return ResponseEntity.ok().body(value);
	}
	
	@PutMapping("/api/vehiculo/{id}")
	public ResponseEntity<String> updateVehiculo(@PathVariable long id,@RequestBody Vehiculo vehiculo){
		VehiculoService.update(id,vehiculo);
		return ResponseEntity.ok().body("Record updated successfully!");
	}
	
}

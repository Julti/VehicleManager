package com.main.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.model.Ciudad;
import com.main.model.Mantenimiento;

@Repository
public interface CiudadDAO{
	Ciudad get(long id);
}

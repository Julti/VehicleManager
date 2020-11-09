package com.main.base.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.base.model.Ciudad;
import com.main.base.model.Mantenimiento;

@Repository
public interface CiudadDAO{
	Ciudad get(long id);
}

package com.provise.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.provise.model.EmployeeModel;

public interface EmployeeDao extends CrudRepository<EmployeeModel, Integer>{

	//Optional<EmployeeModel> findByDOB(String DOB);
	EmployeeModel findByDOB(String DOB);
}

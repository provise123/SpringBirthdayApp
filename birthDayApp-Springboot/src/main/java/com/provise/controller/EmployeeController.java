package com.provise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.provise.dao.EmployeeDao;
import com.provise.model.EmployeeModel;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao empRepo;
	
	@RequestMapping("/")
	public String home()
	{
	
		return "index.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(EmployeeModel model)
	{
		
		empRepo.save(model);
		return "index.jsp";
	}
	
	
	/*@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam String DOB)
	{
		
		ModelAndView mv = new ModelAndView("showEmployee.jsp");
		
		EmployeeModel model = empRepo.findByDOB(DOB).orElse(new EmployeeModel());
	
		mv.addObject(model);
		
		return mv;
	}*/
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam String DOB)
	{
		ModelAndView mv = new ModelAndView("showEmployee.jsp");
		
		EmployeeModel model = empRepo.findByDOB(DOB);
	
		mv.addObject(model);
		
		return mv;
	}
	
	
	

}

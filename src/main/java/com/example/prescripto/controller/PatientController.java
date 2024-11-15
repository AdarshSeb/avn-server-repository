package com.example.prescripto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prescripto.entity.Patient;
import com.example.prescripto.services.PatientService;

@RestController
@RequestMapping("/patient")
//@CrossOrigin(origins = "http://localhost:5173")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/userlogin")
	public Patient getUser(@Param("emailId") String emailId,@Param("patientPassword") String patientPassword) {
		return patientService.getUser(emailId,patientPassword);
		
	}
	
	@PostMapping
	public void addPatient(@RequestBody Patient patient) {
		patientService.savePatient(patient);
	}
	
	@PutMapping("/update")
	public void updateUser(@RequestBody Patient patient) {
		System.out.println("patient is " + patient.getEmailId());
		patientService.updatePatient(patient);
	}
	
	@GetMapping("/check")
	public Integer checkEmail(@Param("emailId") String emailId) {
		
		Integer result = patientService.getEmail(emailId);
	    return (result != null) ? result : -1;
		
	}

}

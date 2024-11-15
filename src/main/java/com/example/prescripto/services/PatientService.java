package com.example.prescripto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prescripto.entity.Patient;
import com.example.prescripto.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient getUser(String emailId, String patientPassword) {
		return patientRepository.findUser(emailId,patientPassword);
	}
	
	public void savePatient(Patient patient) {
		patientRepository.save(patient);
	}
	
	public void updatePatient(Patient patient) {
		patientRepository.updatePatient(patient.getId(),patient.getEmailId(),patient.getPatientDob(),patient.getPatientGender(),patient.getPatientPhone(),patient.getPatientName());
	}

	public Integer getEmail(String emailId) {
		return patientRepository.checkEmail(emailId);
	}
	
	

}

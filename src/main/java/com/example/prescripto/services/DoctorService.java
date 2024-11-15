package com.example.prescripto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prescripto.entity.Doctor;
import com.example.prescripto.repository.DoctorRepository;



@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;

	public void addDoctor(Doctor doctorDetails) {
		doctorRepository.save(doctorDetails);
	}
	
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}
	
	public Doctor findDoctorById(int id) {
        return doctorRepository.findById((long) id).orElse(null);
    }

	public boolean deleteDoctorById(int id) {
		if (doctorRepository.findById((long) id) != null) {
            doctorRepository.deleteById((long) id); 
            return true;
        }
        return false; 
    }

	public List<Doctor> getAllDoctorsUsingId(List<Long> doctorIds) {
		return doctorRepository.findByIdIn(doctorIds);
	}

	

	public Doctor getDoctor(String emailId, String Password) {
		
		return doctorRepository.getDoctor(emailId,Password);
	}

	
	

	public void updateDoctor(Doctor doctor) {
	    doctorRepository.updateDoctor(doctor.getId(),doctor.getAddressLineOne(),doctor.getAddressLineTwo(),doctor.getDoctorAbout(),doctor.getDoctorDegree(),doctor.getDoctorEmail(),
	    		doctor.getDoctorExperience(),doctor.getDoctorFees(),doctor.getDoctorImage(),doctor.getDoctorName(),doctor.getDoctorPassword(),doctor.getDoctorSpeciality());
	}

	


}

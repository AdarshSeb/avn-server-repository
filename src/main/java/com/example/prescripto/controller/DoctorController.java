package com.example.prescripto.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.prescripto.entity.Doctor;
import com.example.prescripto.entity.Patient;
import com.example.prescripto.services.DoctorService;

@RestController
@RequestMapping("/doctor")
//@CrossOrigin(origins = "http://localhost:5173")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

//	@PostMapping
//	public void addDoctor(@RequestBody Doctor doctor) {
//		System.out.println("name is" + doctor.getDoctorName());
//		doctorService.addDoctor(doctor);
//
//	}
	
	@PostMapping("/add")
    public void addDoctor(
            @RequestParam("doctorName") String doctorName,
            @RequestParam("doctorEmail") String doctorEmail,
            @RequestParam("doctorPassword") String doctorPassword,
            @RequestParam("doctorExperience") String doctorExperience,
            @RequestParam("doctorFees") Double doctorFees,
            @RequestParam("doctorSpeciality") String doctorSpeciality,
            @RequestParam("doctorDegree") String doctorDegree,
            @RequestParam("addressLineOne") String addressLineOne,
            @RequestParam("addressLineTwo") String addressLineTwo,
            @RequestParam("doctorAbout") String doctorAbout,
            @RequestParam("doctorImage") MultipartFile image) throws IOException {

        Doctor doctor = new Doctor();
        doctor.setDoctorName(doctorName);
        doctor.setDoctorEmail(doctorEmail);
        doctor.setDoctorPassword(doctorPassword);
        doctor.setDoctorExperience(doctorExperience);
        doctor.setDoctorFees(doctorFees);
        doctor.setDoctorSpeciality(doctorSpeciality);
        doctor.setDoctorDegree(doctorDegree);
        doctor.setAddressLineOne(addressLineOne);
        doctor.setAddressLineTwo(addressLineTwo);
        doctor.setDoctorAbout(doctorAbout);
        doctor.setDoctorImage(image.getBytes()); // Convert image to byte array

        doctorService.addDoctor(doctor);
    }




		
	@GetMapping("/alldoctors")
	public List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctors();
		
	}
	
	
	@GetMapping("/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable int id) {
        Doctor doctor = doctorService.findDoctorById(id);
        if (doctor != null) {
            return ResponseEntity.ok(doctor);
        } else {
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
	
	
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<String> deleteDoctorById(@PathVariable int id) {
	        boolean isDeleted = doctorService.deleteDoctorById(id);
	        if (isDeleted) {
	            return ResponseEntity.ok("Doctor deleted successfully.");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Doctor not found.");
	        }
	    }
	 
	 
	 
	 @PutMapping("/update")
	public void  updateDoctor(@RequestBody Doctor doctor) {
		 doctorService.updateDoctor(doctor);
	 }

	 
	 
	 @GetMapping("/check")
	 public Doctor getUser(@RequestParam("email") String emailId, @RequestParam("password") String password) {
	     return doctorService.getDoctor(emailId, password);
	 }

	
	
}

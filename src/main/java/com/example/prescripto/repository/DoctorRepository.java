package com.example.prescripto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.prescripto.entity.Doctor;

import jakarta.transaction.Transactional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

	List<Doctor> findByIdIn(List<Long> doctorIds);

	
	@Modifying
    @Transactional
	@Query(value = "UPDATE doctor SET address_lineone=:addressLineOne, address_linetwo=:addressLineTwo, doctor_about=:doctorAbout, doctor_degree=:doctorDegree, doctor_email=:doctorEmail, doctor_experience=:doctorExperience, doctor_fees=:doctorFees, doctor_image=:doctorImage, doctor_name=:doctorName, doctor_password=:doctorPassword, doctor_speciality=:doctorSpeciality  WHERE doctor_id = :id", nativeQuery = true)
    void updateDoctor(
    		Long id,
    		String addressLineOne, String addressLineTwo,String doctorAbout,
			String doctorDegree, String doctorEmail, String doctorExperience, 
			 Double doctorFees,  byte[] doctorImage, String doctorName,String doctorPassword,
			String doctorSpeciality );

	@Query(value = "SELECT * FROM doctor WHERE doctor_email =:emailId AND doctor_password =:password", nativeQuery = true)
	Doctor getDoctor(String emailId, String password);
	
	

}

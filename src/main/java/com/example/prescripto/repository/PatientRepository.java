package com.example.prescripto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.prescripto.entity.Patient;

import jakarta.transaction.Transactional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
	@Query(value = "SELECT * FROM patient_table WHERE patient_email =:emailId AND patient_password =:patientPassword", nativeQuery = true)
    Patient findUser(String emailId, String patientPassword);
	
	

	@Modifying
    @Transactional
    @Query(value = "UPDATE patient_table SET patient_email = :emailId, patient_dob = :patientDob, patient_gender = :patientGender, patient_name = :patientName, patient_phone = :patientPhone WHERE id = :id", nativeQuery = true)
    void updatePatient(Integer id, String emailId, String patientDob, String patientGender, Float patientPhone, String patientName);


	@Query(value = "SELECT id FROM patient_table WHERE patient_email =:emailId ", nativeQuery = true)
	Integer checkEmail(String emailId);
	
	

}

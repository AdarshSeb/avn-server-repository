package com.example.prescripto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "patient_table")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="patient_name")
	private String patientName;

	@Column(name="patient_email")
	private String emailId;
	
	@Column(name="patient_password")
	private String patientPassword;
	
	@Column(name="patient_phone")
	private Float patientPhone;
	
	@Column(name="patient_gender")
	private String patientGender;
	
	@Column(name="patient_dob")
	private String patientDob;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public Float getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(Float patientPhone) {
		this.patientPhone = patientPhone;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientDob() {
		return patientDob;
	}

	public void setPatientDob(String patientDob) {
		this.patientDob = patientDob;
	}
	
	

}

package com.example.prescripto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctor_id")
	private Long id;

	@Column(name = "doctor_name")
	private String doctorName;
	
	@Column(name = "doctor_email")
	private String doctorEmail;
	
	@Column(name = "doctor_password")
	private String doctorPassword;
	
	@Lob
    @Column(name = "doctor_image", columnDefinition = "longblob")
    private byte[] doctorImage; 

	@Column(name = "doctor_speciality")
	private String doctorSpeciality;

	@Column(name = "doctor_degree")
	private String doctorDegree;
	
	@Column(name = "doctor_experience")
	private String doctorExperience;
	
	@Column(name = "doctor_about", columnDefinition = "TEXT")
	private String doctorAbout;
	
	@Column(name = "doctor_fees")
	private Double doctorFees;

	@Column(name = "address_lineone")
	private String addressLineOne;

	@Column(name = "address_linetwo")
	private String addressLineTwo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	public String getDoctorDegree() {
		return doctorDegree;
	}

	public void setDoctorDegree(String doctorDegree) {
		this.doctorDegree = doctorDegree;
	}

	public String getDoctorExperience() {
		return doctorExperience;
	}

	public void setDoctorExperience(String doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	public String getDoctorAbout() {
		return doctorAbout;
	}

	public void setDoctorAbout(String doctorAbout) {
		this.doctorAbout = doctorAbout;
	}

	public Double getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(Double doctorFees) {
		this.doctorFees = doctorFees;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public String getDoctorPassword() {
		return doctorPassword;
	}

	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

	public byte[] getDoctorImage() {
		return doctorImage;
	}

	public void setDoctorImage(byte[] doctorImage) {
		this.doctorImage = doctorImage;
	}

}

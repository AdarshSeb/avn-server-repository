package com.example.prescripto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "cancelled_booking")
public class CancelledBooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cancelId;
	
	
	@Column(name="docId")
	private String docId;
	
	@Column(name="patientId")
	private Integer patientId;
	
	@Column(name="date")
	private String date;
	
	@Column(name="time")
	private String time;
	

	@Column(name = "doctor_name")
	private String doctorName;
	
	@Column(name = "doctor_email")
	private String doctorEmail;
	
	
	
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

	

	public Integer getCancelId() {
		return cancelId;
	}

	public void setCancelId(Integer cancelId) {
		this.cancelId = cancelId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	

	public byte[] getDoctorImage() {
		return doctorImage;
	}

	public void setDoctorImage(byte[] doctorImage) {
		this.doctorImage = doctorImage;
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

	


	
	
	
	
	

}

package com.example.prescripto.dto;

public class DoctorBookingDTO {

    private Long doctorId;
    private String doctorName;
    private String doctorEmail;
    private String doctorSpeciality;
    private String doctorDegree;
    private String doctorExperience;
    private String doctorAbout;
    private Double doctorFees;
    private byte[] doctorImage; 
    // Assuming image is stored as byte array
    private String date;
    private String status;
    private String time;
    private Integer bookingId; // New field for booking ID

    // Getters and setters for all the fields

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
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

    public byte[] getDoctorImage() {
        return doctorImage;
    }

    public void setDoctorImage(byte[] doctorImage) {
        this.doctorImage = doctorImage;
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

    // Getter and setter for the new bookingId field
    public Integer getBookingId() {
        return bookingId;
    }

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }
}

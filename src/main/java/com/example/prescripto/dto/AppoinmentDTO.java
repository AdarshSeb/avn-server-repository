package com.example.prescripto.dto;

public class AppoinmentDTO {
	
	// from booking repo
	
	private String date;
    private String time;
    private Integer bookingId;
    private String status;
    
    // from patient repo
    
    private String patientName;
    private String patientEmail;
    private String patientDob;
    private Float patientPhone;
    private Integer patientId;
    
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
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPatientDob() {
		return patientDob;
	}
	public void setPatientDob(String patientDob) {
		this.patientDob = patientDob;
	}
	public Float getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(Float patientPhone) {
		this.patientPhone = patientPhone;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
    
    
    

}

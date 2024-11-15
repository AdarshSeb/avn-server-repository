package com.example.prescripto.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prescripto.dto.AppoinmentDTO;
import com.example.prescripto.dto.DoctorBookingDTO;
import com.example.prescripto.entity.Booking;
import com.example.prescripto.entity.Doctor;
import com.example.prescripto.entity.Patient;
import com.example.prescripto.repository.BookingRepository;
import com.example.prescripto.repository.DoctorRepository;
import com.example.prescripto.repository.PatientRepository;
@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
    private DoctorRepository doctorRepository;
	
	@Autowired
    private PatientRepository patientRepository;
	
	public void bookDoctor(Booking bookingDetails) {
		bookingRepository.save(bookingDetails);
	}
	
	public Integer getCount(String docId, String date,String time) {
		return bookingRepository.findCount(docId,date,time);
		
	}

//	public List<Long> findDoctorIdsByPatientId(int patientId) {
//		return bookingRepository.findDoctorIdsByPatientId(patientId);
//	}
	
	
	 public List<DoctorBookingDTO> getDoctorBookingsByPatientId(int patientId) {
	        // Step 1: Retrieve all bookings for the specified patient ID
	        List<Booking> bookings = bookingRepository.findDoctorIdsByPatientId(patientId);

	        // Step 2: Initialize a list of DoctorBookingDTO to store the mapped results
	        List<DoctorBookingDTO> doctorBookingDTOs = new ArrayList<>();

	        // Step 3: For each booking, retrieve doctor details and map to DoctorBookingDTO
	        for (Booking booking : bookings) {
	            Optional<Doctor> doctorOpt = doctorRepository.findById(Long.parseLong(booking.getDocId()));

	            if (doctorOpt.isPresent()) {
	                Doctor doctor = doctorOpt.get();

	                // Step 4: Map data to DoctorBookingDTO
	                DoctorBookingDTO dto = new DoctorBookingDTO();
	                dto.setDoctorId(doctor.getId());
	                dto.setDoctorName(doctor.getDoctorName());
	                dto.setDoctorEmail(doctor.getDoctorEmail());
	                dto.setDoctorSpeciality(doctor.getDoctorSpeciality());
	                dto.setDoctorDegree(doctor.getDoctorDegree());
	                dto.setDoctorExperience(doctor.getDoctorExperience());
	                dto.setDoctorAbout(doctor.getDoctorAbout());
	                dto.setDoctorFees(doctor.getDoctorFees());
	                dto.setDoctorImage(doctor.getDoctorImage());
	                dto.setBookingId(booking.getBookingId());
	                dto.setStatus(booking.getStatus());
	                dto.setDate(booking.getDate());
	                dto.setTime(booking.getTime());

	                // Step 5: Add the DTO to the list
	                doctorBookingDTOs.add(dto);
	            }
	        }

	        return doctorBookingDTOs;
	    }

	 public void deleteBooking(int id) {
		      bookingRepository.deleteById(id);
		    
		}

	
	
	
	
	
	public List<AppoinmentDTO> getDoctorAppointments(int patientId) {
        // Step 1: Retrieve all bookings for the specified patient ID
        List<Booking> bookings = bookingRepository.findPatientsIdsByDoctorId(patientId);

        // Step 2: Initialize a list of DoctorBookingDTO to store the mapped results
        List<AppoinmentDTO> patientDTOs = new ArrayList<>();

        // Step 3: For each booking, retrieve doctor details and map to DoctorBookingDTO
        for (Booking booking : bookings) {
            Optional<Patient> patientOpt = patientRepository.findById(booking.getPatientId());

            if (patientOpt.isPresent()) {
            	Patient patient = patientOpt.get();

                // Step 4: Map data to DoctorBookingDTO
            	AppoinmentDTO dto = new AppoinmentDTO();
                dto.setPatientName(patient.getPatientName());
                dto.setPatientEmail(patient.getEmailId());
                dto.setPatientPhone(patient.getPatientPhone());
                dto.setPatientDob(patient.getPatientDob());
                dto.setStatus(booking.getStatus());
                dto.setPatientId(patient.getId());
                dto.setBookingId(booking.getBookingId());
                dto.setDate(booking.getDate());
                dto.setTime(booking.getTime());

                // Step 5: Add the DTO to the list
                patientDTOs.add(dto);
            }
        }

        return patientDTOs;
    }
	
	
	public void updateBookingStatus(Integer bookingId, String status) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        booking.setStatus(status);
         bookingRepository.updateStatus(bookingId,status);
    }


	

}

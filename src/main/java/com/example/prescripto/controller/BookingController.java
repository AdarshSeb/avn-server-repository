package com.example.prescripto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

import com.example.prescripto.dto.AppoinmentDTO;
import com.example.prescripto.dto.DoctorBookingDTO;
import com.example.prescripto.entity.Booking;
import com.example.prescripto.services.BookingService;
import com.example.prescripto.services.DoctorService;

@RestController
@RequestMapping("/book")
//@CrossOrigin(origins = "http://localhost:5173")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@Autowired
	private DoctorService doctorService;

	@PostMapping
	public void createBooking(@RequestBody Booking bookingDetails) {

		bookingService.bookDoctor(bookingDetails);
	}

	@GetMapping("/count")
	public Integer getBookingCount(@Param("docId") String docId, @Param("date") String date,
			@Param("time") String time) {
		return bookingService.getCount(docId, date, time);
	}

//	 @GetMapping("/appoinment/{patientId}")
//	 public ResponseEntity<List<Doctor>> getDoctorsByPatientId(@PathVariable int patientId) {
//	        // Step 1: Get the list of doctor IDs for the given patient ID
//	        List<Long> doctorIds = bookingService.findDoctorIdsByPatientId(patientId);
//
//	        // Step 2: Retrieve doctor details using these IDs
//	        List<Doctor> doctors = doctorService.getAllDoctorsUsingId(doctorIds);
//	        System.out.print("response is "+ doctors);
//
//	        return ResponseEntity.ok(doctors);
//	       
//	    }

	@GetMapping("/appoinment/{patientId}")
	public ResponseEntity<List<DoctorBookingDTO>> getDoctorBookingsByPatientId(@PathVariable int patientId) {
		List<DoctorBookingDTO> doctorBookingDTOs = bookingService.getDoctorBookingsByPatientId(patientId);
		return ResponseEntity.ok(doctorBookingDTOs);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBooking(@PathVariable int id) {

		
		bookingService.deleteBooking(id);

		
	}
	

	
    @GetMapping("/getappoinments/{docId}")
    public List<AppoinmentDTO> getDoctorAppointments(@PathVariable String docId) {
        return bookingService.getDoctorAppointments(Integer.parseInt(docId));
    }
    
    
    @PutMapping("/updatestatus/{bookingId}/status")
    public void updateBookingStatus(@PathVariable Integer bookingId, 
                                       @RequestParam String status) {
         bookingService.updateBookingStatus(bookingId, status);
    }

    


}

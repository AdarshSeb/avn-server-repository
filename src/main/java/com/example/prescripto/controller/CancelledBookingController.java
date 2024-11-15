package com.example.prescripto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prescripto.entity.CancelledBooking;
import com.example.prescripto.services.CancelledBookingService;


@RestController
@RequestMapping("/cancel")
//@CrossOrigin(origins = "http://localhost:5173")
public class CancelledBookingController {
	
	
	@Autowired
	private CancelledBookingService cancelledBookingService;
	
	
	@PostMapping
	public void createCancelledBooking(@RequestBody CancelledBooking cancelledBookingDetails) {
		cancelledBookingService.createCancelledBooking(cancelledBookingDetails);
	}
	
	@GetMapping("/booking/{patientId}")
	public List<CancelledBooking> getAllBookings(@PathVariable Integer patientId){
		return cancelledBookingService.getBooking(patientId);
		
	}

}

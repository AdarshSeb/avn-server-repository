package com.example.prescripto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prescripto.entity.CancelledBooking;
import com.example.prescripto.repository.CancelledBookingRepository;


@Service
public class CancelledBookingService {
	@Autowired
	private CancelledBookingRepository cancelledBookingRepository;

	public void createCancelledBooking(CancelledBooking cancelledBookingDetails) {
		cancelledBookingRepository.save(cancelledBookingDetails);
		
	}

	public List<CancelledBooking> getBooking(Integer patientId) {
		
		return cancelledBookingRepository.getCancelledBooking(patientId);
	}
	

}

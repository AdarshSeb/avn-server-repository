package com.example.prescripto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.prescripto.entity.CancelledBooking;


@Repository
public interface CancelledBookingRepository extends JpaRepository<CancelledBooking, Integer>{
	
	
	@Query(value = "SELECT * FROM cancelled_booking WHERE patient_id =:patientId" , nativeQuery = true)
	List<CancelledBooking> getCancelledBooking(Integer patientId);

}

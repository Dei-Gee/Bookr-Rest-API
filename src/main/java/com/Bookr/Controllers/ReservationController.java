package com.Bookr.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bookr.Entities.Reservation;
import com.Bookr.Entities.User;
import com.Bookr.Services.ReservationService;
import com.Bookr.Services.RoomService;
import com.Bookr.Services.UserService;

/**
 * 
 * @author Deji9000
 *
 */

@RestController
@RequestMapping("/api/reservations")
@CrossOrigin("http://localhost:8000")
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/create_reservation")
	public ResponseEntity<?> createNewReservation(@Valid @RequestBody Reservation reservation) 
	{
		Reservation new_reservation = reservationService.saveOrUpdateReservation(reservation);
		return new ResponseEntity<Reservation>(new_reservation, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public Iterable<Reservation> getAllReservations()
	{
		return reservationService.findAll();
	}
	
	@GetMapping("/{reservation_id}")
	public ResponseEntity<?> getReservationById(@PathVariable Integer reservation_id)
	{
		Reservation reservation = reservationService.getById(reservation_id);
		return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
	}
	
	@GetMapping("/get/{user_id}")
	public Iterable<Reservation> getAllReservations(@PathVariable Integer user_id)
	{
		
		return reservationService.findByUser(user_id);
	}
	
	@PostMapping("/update/{res_number}/{new_start}/{new_end}")
	public ResponseEntity<?> getReservationById(@PathVariable String res_number, @PathVariable String new_start, @PathVariable String new_end)
	{
		Reservation reservation = reservationService.updateReservation(res_number, new_start, new_end);
		return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
	}

}
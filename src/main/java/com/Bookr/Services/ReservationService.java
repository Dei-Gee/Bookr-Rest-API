/**
 * 
 */
package com.Bookr.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bookr.Repositories.ReservationRepository;
import com.Bookr.Entities.Reservation;

/**
 * 
 * @author Deji9000
 *
 */

@Service
public class ReservationService {
	@Autowired
	private ReservationRepository reservationRepository;
	
	public Reservation saveOrUpdateReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}
	
	public Iterable<Reservation> findAll() {
		return reservationRepository.findAll();
	}
	
	public Reservation getById(Integer id) {
		return reservationRepository.getById(id);
	}
	
	public Reservation updateReservation(String res_number, String new_start, String new_end) {
		Reservation target = reservationRepository.findByReservationNumber(res_number);
		target.set_start_date(new_start);
		target.set_end_date(new_end);
		
		return reservationRepository.save(target);
	}
	
	public void delete(Integer id) {
		Reservation reservation = getById(id);
		reservationRepository.delete(reservation);
	}
	
	public Iterable<Reservation> findByUser(Integer user_id)
	{
		return reservationRepository.findByUserId(user_id);
	}
}

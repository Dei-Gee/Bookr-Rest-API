/**
 * 
 */
package com.Bookr.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bookr.Entities.Reservation;
import com.Bookr.Entities.User;

/**
 * 
 * @author Deji9000
 *
 */

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
	@Query(value = "SELECT * FROM reservations WHERE user_id = ?1", nativeQuery = true)
	public Iterable<Reservation> findByUserId(Integer user_id);
	
	@Query(value="SELECT * FROM reservations WHERE reservation_number = ?1", nativeQuery = true)
	public Reservation findByReservationNumber(String reservation_number);
	
	public Reservation getById(Integer Id);
}

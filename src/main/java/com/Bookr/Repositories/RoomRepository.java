/**
 * 
 */
package com.Bookr.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bookr.Entities.Room;

/**
 * 
 * @author Deji9000
 *
 */

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> {
	public Room getById(Integer id);
	public void deleteById(Integer id);
}

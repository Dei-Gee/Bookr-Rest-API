/**
 * 
 */
package com.Bookr.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bookr.Repositories.RoomRepository;
import com.Bookr.Entities.Room;

/**
 * 
 * @author Deji9000
 *
 */

@Service
public class RoomService {
	@Autowired
	private RoomRepository roomRepository;
	
	public Room saveOrUpdateRoom(Room room)
	{
		return roomRepository.save(room);
	}
	
	public Iterable<Room> findAll(){
		return roomRepository.findAll();
	}
	
	public Room getById(Integer id) {
		return roomRepository.getById(id);
	}
	
	public void delete(Integer id)
	{
		Room selected_room = getById(id);
		roomRepository.delete(selected_room);
	}
}

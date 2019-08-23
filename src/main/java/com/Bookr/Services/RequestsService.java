/**
 * 
 */
package com.Bookr.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bookr.Repositories.RequestsRepository;
import com.Bookr.Entities.Request;
import com.Bookr.Entities.Reservation;

/**
 * 
 * @author Deji9000
 *
 */

@Service
public class RequestsService {
	@Autowired
	private RequestsRepository requestsRepository;
	
	public Iterable<Request> findAll(){
		return requestsRepository.findAll();
	}
	
	public Request saveOrUpdateRequest(Request new_request)
	{
		return requestsRepository.save(new_request);
	}
	
	public Request getById(Integer id) {
		return requestsRepository.getById(id);
	}
	
	public void delete(Integer id) {
		Request request = getById(id);
		requestsRepository.delete(request);
	}
}

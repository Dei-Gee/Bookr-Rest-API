/**
 * 
 */
package com.Bookr.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bookr.Entities.Request;

/**
 * 
 * @author Deji9000
 *
 */

@Repository
public interface RequestsRepository extends CrudRepository<Request, Integer> {
	
	public Request getById(Integer id);
}

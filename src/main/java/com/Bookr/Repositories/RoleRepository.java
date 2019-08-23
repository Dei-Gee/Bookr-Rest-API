/**
 * 
 */
package com.Bookr.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bookr.Entities.UserRole;

/**
 * 
 * @author Deji9000
 *
 */

@Repository
public interface RoleRepository extends CrudRepository<UserRole, Integer> {
	public UserRole getById(Integer id);
}

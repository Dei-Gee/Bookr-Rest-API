/**
 * 
 */
package com.Bookr.Services;

import org.springframework.stereotype.Service;

import com.Bookr.Repositories.RoleRepository;
import com.Bookr.Entities.UserRole;

/**
 * 
 * @author Deji9000
 *
 */

@Service
public class RoleService {
	
	private RoleRepository roleRepository;
	
	public UserRole getById(Integer id)
	{
		return roleRepository.getById(id);
	}
	
	public Iterable<UserRole> findAllRoles()
	{
		return roleRepository.findAll();
	}
}

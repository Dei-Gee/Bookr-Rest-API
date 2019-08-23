/**
 * 
 */
package com.Bookr.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bookr.Repositories.UserRepository;
import com.Bookr.Entities.User;

/**
 * 
 * @author Deji9000
 *
 */

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User saveOrUpdateUser(User user) {
		return userRepository.save(user);
	}
	
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	public User getById(Integer id) {
		return userRepository.getById(id);
	}
	
	public void delete(Integer id) {
		User user = getById(id);
		userRepository.delete(user);
	}
	
	public User findByEmailAndPassword(String emailAddress, String password)
	{
		return userRepository.findByEmailAddressAndPassword(emailAddress, password);
	}
}

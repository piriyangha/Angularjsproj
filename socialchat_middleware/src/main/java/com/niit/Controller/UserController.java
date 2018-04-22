package com.niit.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.niit.dao.UserDao;
import com.niit.model.User;
import com.niit.model.Error;
@RestController
public class UserController {

	@Autowired
	UserDao userdao;

	/*//------------------CheckLogin-----------------
	@PostMapping(value="/login")
	public ResponseEntity<User> checkLogin(@RequestBody User user,HttpSession session)
	{
		if( userdao.checkLogin(user))
		{
			User tempUser=(User) userdao.getUser(userDetail.getLoginname());
			 userdao.updateOnlineStatus("Y", tempUser);
			session.setAttribute("userdetail",tempUser);
			return new ResponseEntity<User>(tempUser,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(userDetail,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	// ----------------- Register User ---------------
	*/
	
	
	/*@PostMapping(value = "/registerUser")
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		
		user.setRole("USER");
		if ( userdao.registerUser(user)) {
			return new ResponseEntity<String>("User Registered Successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("User registration failed", HttpStatus.NOT_FOUND);
		}
	}
*/
	
	
	
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public ResponseEntity<?> registerUser(@RequestBody User user){
    	try{
    		System.out.print(user.getUsername());
    	User duplicateUserDetails=userdao.getUser(user.getUsername());
    	if(duplicateUserDetails!=null){
    		System.out.print(2);
    		Error error=new Error(2,"Username already exists!!");
    		return new ResponseEntity<Error>(error,HttpStatus.NOT_ACCEPTABLE);
    	}
    	/*duplicateUserDetails=userdao.getUserDetailsByEmail(userDetails.getEmail());
    	if(duplicateUserDetails!=null){
    		System.out.print(3);
    		Error error=new Error(3,"Email address already exists!!");
    		return new ResponseEntity<Error>(error,HttpStatus.NOT_ACCEPTABLE);
    	}*/
    	System.out.print(5);
    	user.setIsonline(false);
    	userdao.registerUser(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
    	}catch(Exception e){
    		System.out.print(e);
    		Error error=new Error(1,"Unable to register user details!!");
    		return new ResponseEntity<Error>(error,HttpStatus.INTERNAL_SERVER_ERROR);
    	}
	}
}

	
	
	
	
	// ----------- Update User -----------------------------
	
	
	
	
	
	/*@PutMapping(value = "/updateUser/{loginname}")
	public ResponseEntity<String> updateUser(@PathVariable("loginname") String loginname, @RequestBody UserDetail userDetail) {
		System.out.println("In updating user " + loginname);
		User mUser =  userdao.getUser(loginname);
		if (mUser == null) {
			System.out.println("No user found with loginname " + loginname);
			return new ResponseEntity<String>("No user found", HttpStatus.NOT_FOUND);
		}

		mUser.setEmailId(userDetail.getEmailId());
		mUser.setMobileNo(userDetail.getMobileNo());
		mUser.setAddress(userDetail.getAddress());
		mUser.setUsername(userDetail.getUsername());
		 userdao.updateUser(mUser);
		return new ResponseEntity<String>("User updated successfully", HttpStatus.OK);
	}

	// --------------------- List Users --------------------------
	@GetMapping(value = "/listUsers")
	public ResponseEntity<List<User>> listUsers() {
		List<User> listUsers =  userdao.listUsers();
		if (listUsers.size() != 0) {
			return new ResponseEntity<List<User>>(listUsers, HttpStatus.OK);
		}
		return new ResponseEntity<List<User>>(listUsers, HttpStatus.NOT_FOUND);
	}

	// --------------------- Get User ----------------------
	@GetMapping(value = "/getUser/{loginname}")
	public ResponseEntity<User> getUser(@PathVariable("loginname") String loginname) {
		User user =  userdao.getUser(loginname);
		if (user == null) {
			System.out.println("No user found");
			return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
	}

	//-----------------------Delete user-----------------------
	@DeleteMapping(value = "/deleteUser/{loginname}")
	public ResponseEntity<String> deleteUser(@PathVariable("loginname") String loginname) {
		System.out.println("In delete user" + loginname);
		User user =  userdao.getUser(loginname);
		if (user == null) {
			System.out.println("No user with LoginName " + loginname + " found to delete");
			return new ResponseEntity<String>("No user found to delete", HttpStatus.NOT_FOUND);
		} else {
			 userdao.deleteUser(user);
			return new ResponseEntity<String>("User with LoginName " + loginname + " deleted successfully", HttpStatus.OK);
		}
	}
	
	
	//--------------------------------------Upload image-----------------------------------------
	
}*/
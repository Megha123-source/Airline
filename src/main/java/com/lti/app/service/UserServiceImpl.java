package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.dao.UserDAO;
import com.lti.app.pojo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO vdao;
	
	@Override
	public List<User> validateUser() {
		// TODO Auto-generated method stub
		return vdao.validateUser();
	}

	@Override
	public List<User> validateAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return vdao.addUser(user);
	}

	@Override
	public boolean validateLogin(String title,String userName, String password) {
		// TODO Auto-generated method stub
		System.out.println(userName);
		return vdao.validateLogin(title,userName, password);
		
	}

//	@Override
//	public boolean validateAdmin(String title, String userName, String password) {
//		// TODO Auto-generated method stub
//		return vdao.validateAdmin(title, userName, password);
//	}
	
	

}

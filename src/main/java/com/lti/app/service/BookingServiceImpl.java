package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.dao.BookingDAO;
import com.lti.app.pojo.Booking;

@Service
@Transactional
public class BookingServiceImpl implements BookingService{

	@Autowired
	BookingDAO vdao;
	
	@Override
	public Booking addBooking(Booking book) {
		// TODO Auto-generated method stub
		return vdao.addBooking(book);
	}

	@Override
	public List<Booking> getBooking() {
		// TODO Auto-generated method stub
		return vdao.getBooking();
	}

	@Override
	public boolean cancelFlight(long pnrNo) {
		// TODO Auto-generated method stub
		return vdao.cancelFlight(pnrNo);
	}

	

}

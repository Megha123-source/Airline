package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Booking;
import com.lti.app.pojo.Flight;

@Repository
public class BookingDAOImpl implements BookingDAO{

	@Autowired
	EntityManager eMan;

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		eMan.persist(booking);
		Booking obj=eMan.find(Booking.class, booking.getPnrNo());
		return obj;
	}

	@Override
	public List<Booking> getBooking() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Booking").getResultList();
	}

	@Override
	public boolean cancelFlight(long pnrNo) {
		Booking obj=eMan.find(Booking.class, pnrNo);
		eMan.remove(obj);
		return true;
	}
	
	

}

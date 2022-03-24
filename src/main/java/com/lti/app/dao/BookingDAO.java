package com.lti.app.dao;

import java.util.List;

import com.lti.app.pojo.Booking;

public interface BookingDAO {
	
	public Booking addBooking(Booking booking);
	public List<Booking> getBooking();
	
	public boolean cancelFlight(long pnrNo);

}

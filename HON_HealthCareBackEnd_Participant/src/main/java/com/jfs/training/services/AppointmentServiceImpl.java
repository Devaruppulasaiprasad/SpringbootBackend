package com.jfs.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfs.training.bean.AppointmentBean;
import com.jfs.training.dao.AppointmentDAOWrapper;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDAOWrapper appointmentDAOWrapper;
	 /**
		To-Do Item 1.12: This method should save appointment details.
		TODO:
			-- Invoke addAppointment() method of AppointmentDAOWrapper to save appointment
		    -- Return the saved AppointmentBean received from DAO layer
	     */
	@Override
	public AppointmentBean saveAppointment(AppointmentBean appointment) {
		return appointmentDAOWrapper.addAppointment(appointment);
	}
	/**
	  To-Do Item 1.13: This method should fetch all appointment details.

	  TODO:
	    --Invoke getAllPatients() method of AppointmentDAOWrapper to fetch all appointments
	    --Return the list of AppointmentBean objects
	 */
	@Override
	public List<AppointmentBean> getAllAppointments() {
		return appointmentDAOWrapper.getAllPatients();
	}

}

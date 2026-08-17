package com.jfs.training.services;

import java.util.List;

import com.jfs.training.bean.AppointmentBean;

public interface AppointmentService {
	AppointmentBean saveAppointment(AppointmentBean appointment);

	List<AppointmentBean> getAllAppointments();
}

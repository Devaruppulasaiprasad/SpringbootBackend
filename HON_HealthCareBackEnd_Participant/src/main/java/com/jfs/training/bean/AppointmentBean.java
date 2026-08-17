package com.jfs.training.bean;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.jfs.training.entity.PatientEntity;

/*  AppointmentBean contains appointment details along with patient reference.
 */
public class AppointmentBean {
	// Primary key for appointment (auto-generated in DB)
	private Long appointmentId;
	@NotNull(message = "Date is required")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate appointmentDate;
	@NotNull(message = "Time is required")
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime appointmentTime;
	@NotEmpty(message = "Doctor Name is required")
	private String doctorName;
	private String status;

	private PatientBean patient;

	// ----------- Getters and Setters -----------
	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PatientBean getPatient() {
		return patient;
	}

	public void setPatient(PatientBean patient2) {
		this.patient = patient2;

	}

}

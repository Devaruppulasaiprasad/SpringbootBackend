package com.jfs.training.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.jfs.training.Application;
import com.jfs.training.bean.AppointmentBean;
import com.jfs.training.bean.PatientBean;
import com.jfs.training.services.AppointmentServiceImpl;

/*
 * Integration-style test class for AppointmentServiceImpl.
 * Uses Spring Boot context and real DAO layer.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class AppointmentServiceTest {

    @Autowired
    private AppointmentServiceImpl appointmentService;

    /**
     * To-Do Test Case 1: testSaveAppointment
     *
     * Objective:
     * Verify that a new appointment can be saved successfully using the service layer.
     *
     * TODO:
     * -- Create a PatientBean object and set an existing patientId
     * -- Create an AppointmentBean object
     * -- Populate mandatory fields such as:
     *        -- appointmentDate
     *        -- appointmentTime
     *        -- doctorName
     *        -- status
     * -- Associate the PatientBean with AppointmentBean
     * -- Invoke saveAppointment() method of AppointmentServiceImpl
     * -- Use JUnit assertion to verify that no exception is thrown
     */
    @Test
    public void testSaveAppointment() {

        // TODO: Create PatientBean and set patientId

        // TODO: Create AppointmentBean and populate mandatory fields

        // TODO: Associate patient with appointment

        // TODO: Call saveAppointment() and assert no exception is thrown
    	PatientBean patient = new PatientBean();
    	
        patient.setPatientId(1L);

        AppointmentBean appointment = new AppointmentBean();

        appointment.setAppointmentDate(LocalDate.now());
        appointment.setAppointmentTime(LocalTime.now());
        appointment.setDoctorName("Dr. Test");
        appointment.setStatus("Scheduled");
        appointment.setPatient(patient);

        Assertions.assertDoesNotThrow(() -> {
            appointmentService.saveAppointment(appointment);
        });
    }

    /**
     * To-Do Test Case 2: testGetAllAppointments
     *
     * Objective:
     * Verify that fetching all appointments returns a non-null list.
     *
     * TODO:
     * -- Invoke getAllAppointments() method of AppointmentServiceImpl
     * -- Use JUnit assertion to verify the returned list is not null
     */
    @Test
    public void testGetAllAppointments() {

        // TODO: Call getAllAppointments()

        // TODO: Assert returned list is not null
    	List<AppointmentBean> appointments =
                appointmentService.getAllAppointments();

        Assertions.assertNotNull(appointments);
    }
}
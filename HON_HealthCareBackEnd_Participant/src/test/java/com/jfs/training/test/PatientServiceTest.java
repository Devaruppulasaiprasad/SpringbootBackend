package com.jfs.training.test;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.jfs.training.Application;
import com.jfs.training.bean.PatientBean;
import com.jfs.training.services.PatientServiceImpl;

/*
 * Integration-style test class for PatientServiceImpl.
 * Uses Spring Boot application context and real DAO layer.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class PatientServiceTest {

    @Autowired
    private PatientServiceImpl patientService;

    /**
     * To-Do Test Case 3: testSavePatient
     *
     * Objective:
     * Verify that a new patient can be saved successfully using the service layer.
     *
     * TODO:
     * -- Create a PatientBean object
     * -- Populate all mandatory fields:
     *        -- patientName
     *        -- age
     *        -- gender
     *        -- contactNumber
     * -- Invoke savePatient() method of PatientServiceImpl
     * -- Use JUnit assertion to verify that the returned PatientBean is not null
     */
    @Test
    public void testSavePatient() {

        // TODO: Create PatientBean and populate mandatory fields

        // TODO: Call savePatient() method

        // TODO: Assert that returned PatientBean is not null
    	PatientBean patient = new PatientBean();

        patient.setPatientName("Test Patient");
        patient.setAge(30);
        patient.setGender("Male");
        patient.setContactNumber("9876543210");

        PatientBean savedPatient = patientService.savePatient(patient);

        Assertions.assertNotNull(savedPatient);
    }

    /**
     * To-Do Test Case 4: testGetAllPatients
     *
     * Objective:
     * Verify that fetching all patients returns a non-null list.
     *
     * TODO:
     * -- Invoke getAllPatients() method of PatientServiceImpl
     * -- Use JUnit assertion to verify the returned list is not null
     */
    @Test
    public void testGetAllPatients() {

        // TODO: Call getAllPatients()

        // TODO: Assert returned list is not null
    	List<PatientBean> patients =
                patientService.getAllPatients();

        Assertions.assertNotNull(patients);
    }

    /**
     * To-Do Test Case 5: testGetPatientById
     *
     * Objective:
     * Verify that fetching a patient by ID returns a patient record.
     *
     * NOTE:
     * Assumes a patient with ID = 1 exists in the database.
     *
     * TODO:
     * -- Invoke getById() method of PatientServiceImpl with a valid patientId
     * -- Use JUnit assertion to verify the returned PatientBean is not null
     */
    @Test
    public void testGetPatientById() {

        // TODO: Call getById() with an existing patientId

        // TODO: Assert returned PatientBean is not null
    	PatientBean patient =
                patientService.getById(1L);

        Assertions.assertNotNull(patient);
    }
}
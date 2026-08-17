package com.jfs.training.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jfs.training.bean.PatientBean;
import com.jfs.training.services.PatientService;

/**
 * REST Controller for managing Patient operations.
 * Spring Boot 2.7.3 compatible.
 * Designed to be consumed by React frontend.
 */
@RestController
@RequestMapping("/patients")
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {

    @Autowired
    private PatientService patientService;

    /**
     * Fetch all patients.
     *
     * URL: /patients/list
     * Method: GET
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<PatientBean>> listPatients() {

    	List<PatientBean> patients = patientService.getAllPatients();

        return ResponseEntity.ok(patients);
    }

    /**
     * Save a new patient.
     *
     * URL: /patients/save
     * Method: POST
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<?> savePatient(
            @Valid PatientBean patientBean,
            BindingResult result) throws Exception {

    	if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }

        PatientBean savedPatient = patientService.savePatient(patientBean);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedPatient);
    }

    /**
     * Global exception handler for this controller.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception exception) {

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
    }
}
package com.jfs.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfs.training.bean.PatientBean;
import com.jfs.training.dao.PatientDAOWrapper;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAOWrapper patientDAOWrapper;
	
	/**
	  To-Do Item 1.9: This method should fetch all patient details.

	  TODO:
	    --Invoke getAllPatients() method of PatientDAOWrapper to fetch all patients
	    --Return the list of PatientBean objects
	 */

	@Override
	public List<PatientBean> getAllPatients() {
		return patientDAOWrapper.getAllPatients();
	}
	/**
	  To-Do Item 1.10: This method should save patient details.
	  TODO:
	    --Invoke savePatient() method of PatientDAOWrapper to save patient
	    --Return the saved PatientBean received from DAO layer
	 */
	@Override
	public PatientBean savePatient(PatientBean patient) {
		return patientDAOWrapper.savePatient(patient);
	}
	/**
	  To-Do Item 1.11: This method should fetch patient details by ID.

	  TODO:
	    --Invoke getById() method of PatientDAOWrapper to fetch patient details.
	    --Return the PatientBean received from DAO layer
	 */

	@Override
	public PatientBean getById(Long patientId) {
		return patientDAOWrapper.getById(patientId);
	}
}

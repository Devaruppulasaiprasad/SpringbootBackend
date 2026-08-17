package com.jfs.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jfs.training.bean.PatientBean;
import com.jfs.training.entity.PatientEntity;

@Repository
public class PatientDAOWrapper {

	// Injecting Spring Data JPA repository
	@Autowired
	private PatientDAO patientDAO;

	/**
	  To-Do Item 1.3: This method should save patient details into the database.
	        NOTE: This requirement needs to be implemented using Spring Data JPA.

	  TODO:
	    --Check if the input PatientBean is null, throw appropriate exception
	    --Convert PatientBean to PatientEntity(Hint: Utilize provided utility methods) 
	    --Invoke save() method of PatientDAO to persist patient details
	    --Convert saved PatientEntity back to PatientBean(Hint: Utilize provided utility methods) 
	    --Return the saved patient details
	 */
	public PatientBean savePatient(PatientBean bean) {

		if (bean == null) {
	        throw new IllegalArgumentException("Patient details cannot be null");
	    }

	    PatientEntity patientEntity = convertPatientBeanToEntity(bean);

	    PatientEntity savedEntity = patientDAO.save(patientEntity);

	    return convertPatientEntityToBean(savedEntity);
	}
	/**
	  To-Do Item 1.4: This method should fetch all patient details from the database.
	        NOTE: This requirement needs to be implemented using Spring Data JPA.

	  TODO:
	    --Invoke findAll() method of PatientDAO to retrieve all patient entities
	    --Check if the returned list is null or empty, handle appropriately
	    --Convert each PatientEntity to PatientBean (Hint: Utilize provided utility methods)
	    --Add all converted beans to a result list
	    --Return the list of PatientBean objects
	 */
	public List<PatientBean> getAllPatients() {
		List<PatientEntity> patientEntities = patientDAO.findAll();

	    List<PatientBean> patientBeans = new ArrayList<>();

	    if (patientEntities == null || patientEntities.isEmpty()) {
	        return patientBeans;
	    }

	    for (PatientEntity patientEntity : patientEntities) {
	        patientBeans.add(convertPatientEntityToBean(patientEntity));
	    }

	    return patientBeans;
	}

	/**
	  To-Do Item 1.5: This method should fetch patient details by ID from the database.
	        NOTE: This requirement needs to be implemented using Spring Data JPA.

	  TODO:
	    --Invoke findById() method of PatientDAO to retrieve patient entity.
	 */
	public PatientEntity getPatientById(Long id) {
		Optional<PatientEntity> optional = patientDAO.findById(id);
	    return optional.orElse(null);
		
	}
	/**
	  To-Do Item 1.6: This method should fetch patient details by ID and return as bean.
	        NOTE: This requirement needs to be implemented using Spring Data JPA.

	  TODO:
	    --Invoke findById() method of PatientDAO to retrieve patient entity
	    --Check if patient exists using Optional
	    --If present:
	            --Create new PatientBean object
	            --Copy properties from PatientEntity to PatientBean (Hint: use BeanUtils.copyProperties method)
	            --Return the PatientBean
	    --If not present:
	            --Return null or throw appropriate exception
	 */

	public PatientBean getById(Long id) {
		Optional<PatientEntity> opt = patientDAO.findById(id);

	    if (opt.isPresent()) {
	        return convertPatientEntityToBean(opt.get());
	    }

	    return null;
	}

	/* Convert PatientEntity to PatientBean */

	private PatientBean convertPatientEntityToBean(PatientEntity patientEntity) {
		PatientBean patient = new PatientBean();
		BeanUtils.copyProperties(patientEntity, patient);
		return patient;
	}

	/* Convert PatientBean to PatientEntity */

	private PatientEntity convertPatientBeanToEntity(PatientBean bean) {
		PatientEntity patientEntityBean = new PatientEntity();
		BeanUtils.copyProperties(bean, patientEntityBean);
		return patientEntityBean;
	}
}

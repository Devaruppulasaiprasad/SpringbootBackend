package com.jfs.training.services;

import java.util.List;

import com.jfs.training.bean.PatientBean;

public interface PatientService {
	PatientBean savePatient(PatientBean patient);

	List<PatientBean> getAllPatients();

	PatientBean getById(Long patientId);
}

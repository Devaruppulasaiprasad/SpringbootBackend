package com.jfs.training.bean;

import javax.validation.constraints.*;
import javax.validation.constraints.Size;

public class PatientBean {

	// Primary key for patient (auto-generated in DB)
	private Long patientId;

	@NotEmpty(message = "Patient name is required")
	@Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
	private String patientName;
	@NotNull(message = "Age is required")
	@Min(value = 1, message = "Age must be at least 1")
	@Max(value = 120, message = "Age must be less than 120")
	private Integer age;
	@NotEmpty(message = "Gender is required")
	private String gender;
	@NotBlank(message = "Contact number is required")
	@Pattern(regexp = "\\d{10}", message = "Contact number must be 10 digits")
	private String contactNumber;
	
	   // ----------- Getters and Setters -----------


	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}

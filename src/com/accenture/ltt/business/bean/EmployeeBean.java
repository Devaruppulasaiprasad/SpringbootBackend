package com.accenture.ltt.business.bean;

import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.accenture.ltt.validator.EmployeeNameValidatorVal;
import com.accenture.ltt.validator.SecretKeyValidatorVal;

@SecretKeyValidatorVal //For Cross Field Validation
public class EmployeeBean {
	@EmployeeNameValidatorVal
	private String name;

	// Restricts entries for null and String with length 0
	@NotEmpty
	private String password;

	@NotEmpty
	private String gender;

	@NotEmpty
	private String country = "1";

	@Size(min = 10)
	private String aboutYou;

	// Restricts to have minimum 2 entries for the community
	@Size(min = 2)
	private String[] community = { "StrutsV" };

	// Restricts mailingList to be always selected
	@AssertTrue
	private Boolean mailingList;

	// Restricts age to be in the range
	@NotNull
	@Range(max = 110, min = 10)
	private Integer age;

	// Restricts Date to be not null and to be a date greater than current day
	@NotNull
	@Future
	@DateTimeFormat(pattern = "dd-MMM-yyyy")
	// default format is MM/dd/yy
	private Date joiningDate;

	// @NotEmpty
	private String confirmPassword;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAboutYou() {
		return aboutYou;
	}

	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}

	public String[] getCommunity() {
		return community;
	}

	public void setCommunity(String[] community) {
		this.community = community;
	}

	public Boolean getMailingList() {
		return mailingList;
	}

	public void setMailingList(Boolean mailingList) {
		this.mailingList = mailingList;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}

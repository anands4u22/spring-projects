package tech.getarrays.employeemanager.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;
private String email;
private String jobTitle;
private String phone;
private String imageUrl;
private String employeeeCode;

public Employee() {
	
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
public String getEmployeeeCode() {
	return employeeeCode;
}
public void setEmployeeeCode(String employeeeCode) {
	this.employeeeCode = employeeeCode;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", phone=" + phone
			+ ", imageUrl=" + imageUrl + ", employeeeCode=" + employeeeCode + "]";
}


	
}

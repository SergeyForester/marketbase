package com.marketbase.admin.beans;

import com.marketbase.admin.models.User;


public class Client {
	private Long id;

	private String name;

	private String status;

	private String category;

	private String phoneNumber;

	private User manager;

	private String wayOfComm;

	public Client(String name, String phoneNumber, String wayOfComm, String status) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.wayOfComm = wayOfComm;
		this.status = status;
	}

	public Client() {
	}

	public User getManager() {
		return manager;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWayOfComm() {
		return wayOfComm;
	}

	public void setWayOfComm(String wayOfComm) {
		this.wayOfComm = wayOfComm;
	}
}
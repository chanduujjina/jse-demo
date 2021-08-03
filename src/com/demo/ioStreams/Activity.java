package com.demo.ioStreams;

import java.io.Serializable;

public class Activity implements Serializable{
	
	@Override
	public String toString() {
		return "Activity [id=" + id + ", activityName=" + activityName + ", description=" + description + ", actor="
				+ actor + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Activity(int id, String activityName, String description, String actor) {
		super();
		this.id = id;
		this.activityName = activityName;
		this.description = description;
		this.actor = actor;
	}

	private int id;
	
	private String activityName;
	
	private String description;
	
	private String actor;

}

package com.crawljax.web.model;

import java.util.Date;
import javax.xml.datatype.Duration;

public class CrawlRecord {
	private int id;
	private String configurationId;
	private Date startTime;
	private Duration duration;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the configurationId
	 */
	public String getConfigurationId() {
		return configurationId;
	}
	/**
	 * @param configurationId the configurationId to set
	 */
	public void setConfigurationId(String configurationId) {
		this.configurationId = configurationId;
	}
	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the duration
	 */
	public Duration getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	
}

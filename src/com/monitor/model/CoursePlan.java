package com.monitor.model;

public class CoursePlan {
	
	private int planid;
	private int batchid;
	private int daynumber;
	private String topic;
	private boolean status;
	
	public CoursePlan() {
		// TODO Auto-generated constructor stub
	}

	public CoursePlan(int planid, int batchid, int daynumber, String topic, boolean status) {
		super();
		this.planid = planid;
		this.batchid = batchid;
		this.daynumber = daynumber;
		this.topic = topic;
		this.status = status;
	}

	public int getPlanid() {
		return planid;
	}

	public void setPlanid(int planid) {
		this.planid = planid;
	}

	public int getBatchid() {
		return batchid;
	}

	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}

	public int getDaynumber() {
		return daynumber;
	}

	public void setDaynumber(int daynumber) {
		this.daynumber = daynumber;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CoursePlan [planid=" + planid + ", batchid=" + batchid + ", daynumber=" + daynumber + ", topic=" + topic
				+ ", status=" + status + "]";
	}

}

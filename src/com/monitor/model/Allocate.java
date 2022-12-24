package com.monitor.model;

public class Allocate {
	
	private int fid;
	private String fname1;
	private int bid;
	private int nos;
	private int cid;
	private String cname;
	
	public Allocate() {
		// TODO Auto-generated constructor stub
	}

	public Allocate(int fid, String fname1, int bid, int nos, int cid, String cname) {
		super();
		this.fid = fid;
		this.fname1 = fname1;
		this.bid = bid;
		this.nos = nos;
		this.cid = cid;
		this.cname = cname;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname1() {
		return fname1;
	}

	public void setFname1(String fname1) {
		this.fname1 = fname1;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getNos() {
		return nos;
	}

	public void setNos(int nos) {
		this.nos = nos;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Allocate [fid=" + fid + ", fname1=" + fname1 + ", bid=" + bid + ", nos=" + nos + ", cid=" + cid
				+ ", cname=" + cname + "]";
	}

}

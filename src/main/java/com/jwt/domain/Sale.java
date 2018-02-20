package com.jwt.domain;

import java.sql.Date;

public class Sale {
	private int id;
	private Date begindate;
	private Date enddate;
	
	public Sale(int id, Date begindate, Date enddate) {
		super();
		this.id = id;
		this.begindate = begindate;
		this.enddate = enddate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBegindate() {
		return begindate;
	}

	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	

}

package com.jwt.domain;

import java.sql.Date;

public class Account {
	private Date opendate;
	private Adress invoiceadress;
	private int id;
	private boolean isActive;
	
	public Account(Date opendate, Adress invoiceadress, int id, boolean isActive) {
		this.opendate = opendate;
		this.invoiceadress = invoiceadress;
		this.id = id;
		this.isActive = isActive;
	}
	
	public Date getOpendate() {
		return opendate;
	}
	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}
	public Adress getInvoiceadress() {
		return invoiceadress;
	}
	public void setInvoiceadress(Adress invoiceadress) {
		this.invoiceadress = invoiceadress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}

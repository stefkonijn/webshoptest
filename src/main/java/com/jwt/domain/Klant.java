package com.jwt.domain;

public class Klant {
	private String name;
	private String picture;
	private Adress adress;

	public Klant(String name, String picture, String liveadress){
		this.name = name;
		this.picture = picture;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Adress getLiveadress() {
		return adress;
	}
	public void setLiveadress(Adress adress) {
		this.adress = adress;
	}
}

package com.app.core;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable{
	private String title;
	private String auther;
	private double price;
	private Date pubdate;//Data member/fields
	
	
	//parameterized constructer
	public Book(String title, String auther, double price, Date pubdate) {
		super();
		this.title = title;
		this.auther = auther;
		this.price = price;
		this.pubdate = pubdate;
	}

	//tostring
	@Override
	public String toString() {
		return "Book [title=" + title + ", auther=" + auther + ", price=" + price + ", pubdate=" + pubdate + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	
	
	
	
}

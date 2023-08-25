package com.kh.review;

public class Book {
	String title;
	
	Book(String title){
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	String getTitle () {
		return this.title;
	}
	
	public String toString() {
		return this.title;
	}
	
	
}

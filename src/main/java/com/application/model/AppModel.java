package com.application.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="librarymanagement")
public class AppModel {
	@Id
	@Column(name="bookId")
	private int bookId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="bookname")
	private String bookname;
	
	@Column(name="genre")
	private String genre;

	public AppModel(int bookId, int quantity, String bookname, String genre) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		this.bookname = bookname;
		this.genre = genre;
	}

	public AppModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "AppModel [bookId=" + bookId + ", quantity=" + quantity + ", bookname=" + bookname + ", genre=" + genre
				+ "]";
	}
	
	
	
}
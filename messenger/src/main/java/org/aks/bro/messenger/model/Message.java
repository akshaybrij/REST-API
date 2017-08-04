package org.aks.bro.messenger.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {
		private Long id;
		private String message;
		private String author;
		private Date d;
    public Message() {	
    	
		}
	public Message(Long id,String message,String author) {
		this.id=id;
		this.setMessage(message);
		this.setAuthor(author);
		
		
	}

	public Long getId() {
		return id;
	}

	public long setId(int id) {
		this.id = (long) id;
		return this.id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	}



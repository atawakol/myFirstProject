package com.example.myfirstproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String content;
	private String ndContent;

	public Greeting(){}
	
	public Greeting(String con, String content) {
		this.ndContent = con;
		this.content = content;
	}
	
	public Greeting(long con, String content) {
		this.id = con;
		this.content = content;
	}


	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNdContent() {
		return ndContent;
	}

	public void setNdContent(String ndContent) {
		this.ndContent = ndContent;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + ", ndContent="
				+ ndContent + "]";
	}

}

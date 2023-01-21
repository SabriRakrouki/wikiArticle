package com.example.article.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString


public class Article {
	public Article(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public Article() {
		super();
	}
	public Article(String title, String author, String publishDate, String lastModifiedDate, String status,
			String body) {
		super();
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		this.lastModifiedDate = lastModifiedDate;
		this.status = status;
		this.body = body;
	}
	public Article(Long id, String title, String author, String publishDate, String lastModifiedDate, String status,
			String body) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		this.lastModifiedDate = lastModifiedDate;
		this.status = status;
		this.body = body;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, body, id, lastModifiedDate, publishDate, status, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		return Objects.equals(author, other.author) && Objects.equals(body, other.body) && Objects.equals(id, other.id)
				&& Objects.equals(lastModifiedDate, other.lastModifiedDate)
				&& Objects.equals(publishDate, other.publishDate) && Objects.equals(status, other.status)
				&& Objects.equals(title, other.title);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private String title ;
	private String author ;
	private String publishDate ;
	private String lastModifiedDate ;
	private String status ;
	private String body ;
	

}

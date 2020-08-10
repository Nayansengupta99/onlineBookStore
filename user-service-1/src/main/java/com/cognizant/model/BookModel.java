package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
@Entity
@Table(name = "book")
public class BookModel {
	@Id
	@Column(name = "bookid")
	private int bookId;
	@Column(name = "bookname")
	private String bookName;
	@Column(name = "bookprice")
	private Integer bookPrice;

}

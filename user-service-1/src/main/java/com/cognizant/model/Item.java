package com.cognizant.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;


@XmlRootElement
@Data
@Entity
@Table(name = "cart")
public class Item {
	@Id
	@Column(name = "bookid")
	private int bookId;
	@ManyToOne
	@JoinColumn(name = "bookid", referencedColumnName = "bookid", insertable = false, updatable = false)

	private BookModel book;
	private int quantity;

	public Item(BookModel book, int quantity) {
		super();
		this.book = book;
		this.quantity = quantity;
	}

	public Item() {
		super();
	}

}

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

@Table(name = "login")
public class LoginModel {
	@Id
	@Column(name = "username")
	private String userName;
	private String password;
}

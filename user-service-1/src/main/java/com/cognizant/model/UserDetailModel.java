package com.cognizant.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
@Entity
public class UserDetailModel {
	@Id
	private int userId;
	private String userName;
	private String userAddress;
	private String userPhoneNumber;
	private String mailid;
}

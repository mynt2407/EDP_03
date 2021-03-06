package com.vti.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name="`Registration_User_Token`")
public class RegistrationUserToken implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "`token`", nullable = false, unique = true, length = 36)
	private String token;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="`user_id`", referencedColumnName = "id", nullable = false)
	private User user;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "`expiryDate`", nullable = false)
	private Date expiryDate;

	public RegistrationUserToken(String token, User user) {
		this.token = token;
		this.user = user;
		
		//1h se bi het han tocken
		expiryDate = new Date(System.currentTimeMillis() + 360000);
		
	}
	
	
}

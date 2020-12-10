package com.vti.entity;

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

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "`Group`", catalog = "FinalAdvance")
public class Group {

	@Column(name = "group_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "group_name", length = 50, nullable = false, unique = true)
	private String name;

	@Column(name = "member", columnDefinition = "SMALLINT default 0")
	private short member;

	// Cấu hình One to one để lấy thông tin account

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "creator_id", referencedColumnName = "account_id")
	private Account creator;

	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate;

	public Group() {
	}

	public Group(String name) {
		this.name = name;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getMember() {
		return member;
	}

	public void setMember(short member) {
		this.member = member;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account account) {
		this.creator = account;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

//	public List<GroupAccount> getAccounts() {
//		return accounts;
//	}
//
//	public void setAccounts(List<GroupAccount> accounts) {
//		this.accounts = accounts;
//	}

	// Để hiển thị cho người dùng xem cần convert từ entity --> Dto

//	public  toDto() {
//		return new Group(id, name, member, creator.getFullname(), createDate);
//	}

	public Group toEntity() {
		return new Group(name);
	}
}

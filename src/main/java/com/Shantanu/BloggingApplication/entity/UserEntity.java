package com.Shantanu.BloggingApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User_Data")
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_ID")
	private Integer UserID;
	@Column(name = "User_NAME")
	private String name;
	@Column(name = "User_EMAIL")
	private String email;
	@Column(name = "User_PASSWORD")
	private String password;
}

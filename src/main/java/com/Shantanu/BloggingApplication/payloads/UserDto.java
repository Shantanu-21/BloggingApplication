package com.Shantanu.BloggingApplication.payloads;

import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto{

	private Integer UserID;
	private String name;
	private String email;
	private String password;
}

package com.vti.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.vti.entity.Group;
import com.vti.validation.NameNotExist;

public class UpdateGroupDto {
	@NotBlank(message = "{CreateDto.name.NotBlank}")
	@NameNotExist(message = "{CreateDto.name.NameNotExist}")
	@Length(min = 6, max = 50, message = "{CreateDto.name.Length}")
	private String name;

	public UpdateGroupDto() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Group toEntity() {
		return new Group(name);
	}

}

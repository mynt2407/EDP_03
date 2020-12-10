package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Group;

public interface IGroupRepository extends JpaRepository<Group, Short> {
	
	Group findByName(String name);

	boolean existsByName(String name);
}

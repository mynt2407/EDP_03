package com.vti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.vti.entity.Group;

public interface IGroupRepository extends JpaRepository<Group, Short> {

	Group findByName(String name);

	boolean existsByName(String name);

	@Transactional
	@Modifying
	@Query("delete from Group g where g.id in ?1")
	void deleteGroupsWithIds(List<Short> ids);
}

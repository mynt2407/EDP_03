package com.vti.service;

import org.springframework.data.domain.Page;

import com.vti.entity.Group;

public interface IGroupService {

	public Page<Group> getAllGroups(int pageNumber, int pageSize, String sortType, String sortField);

	public Group getGroupByID(short id);

	public Group getGroupByName(String name);

	public void createGroup(Group group);

	public void updateGroup(Group group);

	public void deleteGroup(short id);

	public boolean isGroupExistsByID(short id);

	public boolean isGroupExistsByName(String name);
}

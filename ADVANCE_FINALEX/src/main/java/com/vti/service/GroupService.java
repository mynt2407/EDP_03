package com.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vti.entity.Group;
import com.vti.repository.IGroupRepository;

@Service
public class GroupService implements IGroupService{
	
@Autowired
private IGroupRepository repository;
	
	
	@Override
	public Page<Group> getAllGroups(int pageNumber, int pageSize, String sortType, String sortField) {
		
		Sort sort = sortType.equals("DESC") ? Sort.by(sortField).descending() : Sort.by(sortField).ascending();
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, sort);
		Page<Group> page= repository.findAll(pageable);
		return page;
	}

	@Override
	public Group getGroupByID(short id) {
		return repository.findById(id).get();
	}

	@Override
	public Group getGroupByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public void createGroup(Group group) {
		repository.save(group);
	}

	@Override
	public void updateGroup(Group group) {
		repository.save(group);
	}

	@Override
	public void deleteGroup(short id) {
		repository.deleteById(id);
	}

	@Override
	public boolean isGroupExistsByID(short id) {
		return repository.existsById(id);
		
	}

	@Override
	public boolean isGroupExistsByName(String name) {
		return repository.existsByName(name);
	}

}

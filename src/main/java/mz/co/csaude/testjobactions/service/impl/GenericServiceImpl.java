package mz.co.csaude.testjobactions.service.impl;

import java.util.List;

import mz.co.csaude.testjobactions.entity.GenericEntity;
import mz.co.csaude.testjobactions.service.GenericService;

public class GenericServiceImpl implements GenericService {

	@Override
	public GenericEntity saveEntity(GenericEntity entity) {

		entity.setId(1);

		System.out.println(String.format("Adding a new Entity ID: %s, Name: %s ", entity.getId(), entity.getName()));
		return entity;
	}

	@Override
	public GenericEntity updateEntity(GenericEntity entity) {
		return entity;
	}

	@Override
	public void deleteEntity(GenericEntity entity) {

	}

	@Override
	public List<GenericEntity> findAll() {
		return null;
	}

}

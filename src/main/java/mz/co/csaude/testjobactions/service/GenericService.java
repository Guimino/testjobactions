package mz.co.csaude.testjobactions.service;

import java.util.List;

import mz.co.csaude.testjobactions.entity.GenericEntity;

public interface GenericService {

	GenericEntity saveEntity(GenericEntity entity);

	GenericEntity updateEntity(GenericEntity entity);

	void deleteEntity(GenericEntity entity);

	List<GenericEntity> findAll();
}

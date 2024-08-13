package mz.co.csaude.testjobactions.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import mz.co.csaude.testjobactions.entity.GenericEntity;
import mz.co.csaude.testjobactions.service.impl.GenericServiceImpl;

public class TestGenericService {

	@Test
	public void shouldCreateAnEntity() {

		GenericService service = new GenericServiceImpl();

		GenericEntity entity = new GenericEntity();

		entity.setId(1);
		entity.setCode("XPTO");
		entity.setName("Djhon Doe");
		entity.setDescription("Sample Descriptio");

		GenericEntity savedEntity = service.saveEntity(entity);

		Assertions.assertEquals(entity.getId(), savedEntity.getId());
		Assertions.assertEquals(entity.getName(), savedEntity.getName());
		Assertions.assertEquals(entity.getCode(), savedEntity.getCode());
		Assertions.assertEquals(entity.getDescription(), savedEntity.getDescription());

	}
}

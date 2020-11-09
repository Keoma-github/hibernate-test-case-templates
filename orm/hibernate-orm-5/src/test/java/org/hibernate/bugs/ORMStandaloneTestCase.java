package org.hibernate.bugs;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

public class ORMStandaloneTestCase
{
	@Before
	public void setup()
	{
		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
		// Fill these with any DB information.
		// It's a shame that a DB connection seems to be required just to build the metadata.
		StandardServiceRegistry sr = srb.applySetting("hibernate.connection.driver_class", "")
		                                .applySetting("hibernate.connection.url", "")
		                                .applySetting("hibernate.connection.username", "")
		                                .applySetting("hibernate.connection.password", "")
		                                .build();
		new MetadataSources(sr).addFile("CostCenter.hbm.xml").addFile("User.hbm.xml").buildMetadata();
	}

	@Test
	public void hhh123Test()
	{
		// Nothing to test, setup fails with MappingException.
	}
}

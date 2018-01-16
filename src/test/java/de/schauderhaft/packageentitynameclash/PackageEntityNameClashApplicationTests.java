package de.schauderhaft.packageentitynameclash;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan(basePackages = {"de.schauderhaft.packageentitynameclash.entity","de.schauderhaft.packageentitynameclash"})
public class PackageEntityNameClashApplicationTests {

	@Autowired
	EntityManager em;

	@Test
	public void contextLoads() {
		assertEquals(2, em.getMetamodel().getEntities().size());
	}

}

package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Demo2Application.class)
public class Demo2ApplicationTests {

	@Autowired
	private SampleEntityRepository sampleEntityRepository;

	@Test
	public void contextLoads() {
		SampleEntity se = new SampleEntity();
		se.setName("Foo");
		sampleEntityRepository.save(se);
	}

}

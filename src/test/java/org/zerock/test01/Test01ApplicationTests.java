package org.zerock.test01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.test01.mappers.TestMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Test01ApplicationTests {

	@Autowired
	TestMapper testMapper;

	@Test
	void contextLoads() {

		log.info("====================");
		log.info(testMapper.tsetNow());
	}

}

package com.example.springjenkin;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinApplicationTests {

    public static Logger logger= LoggerFactory.getLogger(SpringJenkinApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("Test case is executing1");
        logger.info("Test case is executing2...");
         assertEquals(true,true);
    }

}

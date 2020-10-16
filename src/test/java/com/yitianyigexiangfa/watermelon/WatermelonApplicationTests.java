package com.yitianyigexiangfa.watermelon;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest
class WatermelonApplicationTests {

    @ClassRule
    public static OutputCaptureRule out = new OutputCaptureRule();

    @Test
    public void contextLoads() {
        out.expect(containsString("1,liubei,admin@yitianyigexiangfa.com,liubeiPassword"));
    }

}

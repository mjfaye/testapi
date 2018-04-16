package com.y2j.test.testapi.lang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author liuhao
 * @Date 2018/4/16 16:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemTest
{

    @Test
    public void test()
    {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
}
}

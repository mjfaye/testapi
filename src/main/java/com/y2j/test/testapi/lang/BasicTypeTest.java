package com.y2j.test.testapi.lang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author liuhao
 * @Date 2018/4/16 16:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTypeTest
{
    @Test
    public void booleanTest()
    {
        boolean b = true;
        Boolean B = new Boolean(b);
        Boolean BB = new Boolean("true");
        System.out.println(BB.hashCode());
        System.out.println(B.parseBoolean("true"));



    }
}

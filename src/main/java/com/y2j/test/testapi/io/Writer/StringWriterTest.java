package com.y2j.test.testapi.io.Writer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

/**
 * @Author liuhao
 * @Date 2018/4/3 14:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StringWriterTest
{
    @Test
    public void test()
    {
        String s = "hello world!";
        StringWriter sw = new StringWriter();
        System.out.println(sw.toString());
        sw.write(s);
        System.out.println(sw.toString());
        PrintWriter pw = new PrintWriter(sw);
        System.out.println(sw.toString());
    }
}

package com.y2j.test.testapi.io.Reader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/**
 * @Author liuhao
 * @Date 2018/4/2 13:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StringReaderTest
{
    //读取字符串
    @Test
    public void test()
    {
        try {
            StringReader sr = new StringReader("012345");
            char[] c = new char[8];
            int i = 0;
            while((i = sr.read(c)) != -1)
            {
                sr.read(c);
            }
            System.out.println(Arrays.toString(c));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1()
    {
        try {
            StringReader sr = new StringReader("012345");
            sr.mark(1);
            char[] c = new char[8];
            int i = 0;
            while((i = sr.read(c)) != -1)
            {
                sr.mark(2);
                sr.read(c);
            }
            System.out.println(Arrays.toString(c));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

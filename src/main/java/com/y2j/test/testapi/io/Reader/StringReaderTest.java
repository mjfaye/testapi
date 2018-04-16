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

    //mark,reset测试
    @Test
    public void test1()
    {
        try {
            StringReader sr = new StringReader("012345");
            char[] c = new char[8];
            System.out.println(sr.markSupported());
            for(int i = 0;i < 2;i++)
            {
                char cc = (char)sr.read();
                System.out.println(cc);
            }
            sr.mark(0);
            for(int i = 0;i < 2;i++)
            {
                char cc = (char)sr.read();
                System.out.println(cc);
            }
            sr.reset();
            for(int i = 0;i < 2;i++)
            {
                char cc = (char)sr.read();
                System.out.println(cc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

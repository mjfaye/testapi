package com.y2j.test.testapi.io.Reader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author liuhao
 * @Date 2018/4/3 13:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CharArrayReaderTest
{
    @Test
    public void test()
    {
        try {
            String s = "hello world!";
            CharArrayReader car = new CharArrayReader(s.toCharArray());
            char[] c = new char[1];
            car.read(c);
            System.out.println(Arrays.toString(c));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

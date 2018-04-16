package com.y2j.test.testapi.io.Reader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author liuhao
 * @Date 2018/4/3 10:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BufferedReaderTest
{
    @Test
    public void test()
    {
        try {
            FileReader fr = new FileReader("D://temp/a.txt");
            BufferedReader br = new BufferedReader(fr);
            char c = (char)br.read();
            System.out.println(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

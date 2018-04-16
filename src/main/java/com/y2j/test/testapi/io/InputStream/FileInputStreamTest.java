package com.y2j.test.testapi.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author liuhao
 * @Date 2018/4/3 17:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FileInputStreamTest
{
    @Test
    public void test()
    {
        try {
            FileInputStream fis = new FileInputStream("D://temp/a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

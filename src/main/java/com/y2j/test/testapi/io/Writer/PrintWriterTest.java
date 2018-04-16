package com.y2j.test.testapi.io.Writer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @Author liuhao
 * @Date 2018/4/3 16:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PrintWriterTest
{
    @Test
    public void test()
    {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("D://temp/a.txt");
            pw.println("ggggggggggggggg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(pw != null)
            {
                pw.close();
            }
        }
    }
}

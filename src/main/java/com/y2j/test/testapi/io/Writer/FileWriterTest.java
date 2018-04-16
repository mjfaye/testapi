package com.y2j.test.testapi.io.Writer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author liuhao
 * @Date 2018/4/3 16:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FileWriterTest
{
    @Test
    public void test()
    {
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter("D://temp/a.txt");
            pw = new PrintWriter(fw);
            pw.write("dsadasdasdas");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(pw != null)
            {
                pw.close();
            }
        }


    }
}

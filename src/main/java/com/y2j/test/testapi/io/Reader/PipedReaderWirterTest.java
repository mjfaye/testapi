package com.y2j.test.testapi.io.Reader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @Author liuhao
 * @Date 2018/4/3 14:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PipedReaderWirterTest
{
    @Test
    public void test()
    {
        try {
            PipedWriterTest pwt = new PipedWriterTest();
            PipedReaderTest prt = new PipedReaderTest();
            PipedWriter pw = pwt.getPw();
            PipedReader pr = prt.getPr();
            pr.connect(pw);
            Thread threadRead = new Thread(prt);
            Thread threadWrite = new Thread(pwt);
            threadRead.start();
            threadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

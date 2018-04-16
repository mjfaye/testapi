package com.y2j.test.testapi.io.Reader;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @Author liuhao
 * @Date 2018/4/3 14:06
 */
public class PipedWriterTest implements Runnable
{

    private PipedWriter pw = new PipedWriter();
    String s = "Hello world!";
    @Override
    public void run()
    {
        try {
            pw.write(s.toCharArray());
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public PipedWriter getPw()
    {
        return pw;
    }
}

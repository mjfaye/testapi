package com.y2j.test.testapi.io.Reader;

import java.io.IOException;
import java.io.PipedReader;
import java.util.Arrays;

/**
 * @Author liuhao
 * @Date 2018/4/3 14:09
 */

public class PipedReaderTest implements Runnable
{

    private PipedReader pr = new PipedReader();
    char[] c = new char[10];
    @Override
    public void run()
    {
        try {
            pr.read(c);
            System.out.println("result:" + Arrays.toString(c));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public PipedReader getPr() {
        return pr;
    }
}

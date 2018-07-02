package com.y2j.test.testapi.nio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author liuhao
 * @Date 2018/6/6 9:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BufferTest
{
    @Test
    public void test()
    {
        File f = new File("D:\\lh\\b.txt");
        try
        {
            RandomAccessFile raf = new RandomAccessFile(f,"rw");
            FileChannel fc = raf.getChannel();
            ByteBuffer bb = ByteBuffer.allocate(1024);
            int readFlag = fc.read(bb);
            while(readFlag != -1){
            bb.flip();
            while(bb.hasRemaining()){
                System.out.println((char)bb.get());
            }
            bb.clear();
            readFlag = fc.read(bb);
        }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }


    }

}

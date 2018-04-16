package com.y2j.test.testapi.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @Author liuhao
 * @Date 2018/4/8 10:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ListTest
{
    @Test
    public void test()
    {
        ArrayList al = new ArrayList();
        al.add("1");
    }

    @Test
    public void testStack()
    {
        Stack<String> s = new Stack<String>();
        System.out.println(s.empty());
        s.push("1");
        System.out.println(s.empty());
        s.push("2");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
    }

    @Test
    public void testVector()
    {
        Vector<String> v = new Vector<String>();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        System.out.println(v);
        v.add(2,"a");
        System.out.println(v.toString());
        System.out.println(v.toArray());
        String[] s = {"1","2","3"};
        System.out.println(Arrays.asList(s));

    }

    @Test
    public void testSet()
    {
        Set<String> s = new HashSet<String>();
        s.add("1");
        s.add("2");
        s.add("3");

    }

}

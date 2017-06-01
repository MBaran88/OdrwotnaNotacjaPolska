package com.ONP;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Stack;

/**
 * Created by RENT on 2017-06-01.
 */
public class Algorithm {

    static void push(Stack<String> st, String a){
        st.push(new String());
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }
    static void show(Stack st){
        System.out.println("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack " + st);
    }
    /*String Calculate (Integer a){
        if (a.equals("*"))
            return ;
    }*/


}

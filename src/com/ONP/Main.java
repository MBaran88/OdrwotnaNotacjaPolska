package com.ONP;

import java.util.EmptyStackException;
import java.util.Stack;

import static com.ONP.Algorithm.push;
import static com.ONP.Algorithm.show;

public class Main {

    public static void main(String[] args) {
	// trzeba zrobić algorytm ONP który przeliczy wartość wyrażenia 12 1 2 3 * 4 5 / + * +
        Stack<String> st = new Stack<String>();
        System.out.println("stack: " + st);
        st.push("12");
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("*");
        st.push("4");
        st.push("5");
        st.push("/");
        st.push("+");
        st.push("*");
        st.push("+");

        try{
            show(st);
        }
        catch (EmptyStackException e) {
            System.out.println("empty stack");
        }



    }
}

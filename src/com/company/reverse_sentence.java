package com.company;

import java.util.*;

/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class reverse_sentence
{
    public static void reverseSentence(String str)
    {
        str = new StringBuilder(str).reverse().toString();
        String temp = "";
        List<String> list = new ArrayList<String>();
        int count = 0;
        int sz = str.length();
        for(int i = 0; i < sz; i++)
        {
            if(i == sz - 1)
            {
                temp += str.charAt(i);
            }
            if(!(str.charAt(i) == ' ' || i == sz - 1))
            {
                temp += str.charAt(i);
            }
            if(str.charAt(i) == ' ' || i == sz - 1)
            {
                temp += ' ';
                list.add(temp);
                temp = "";
            }
        }
        StringBuilder sentence = new StringBuilder();
        for(String x: list)
        {
            String s = x;
            x = new StringBuilder(s).reverse().toString();
            sentence.append(x);
            System.out.println(x);
        }

        System.out.println("New Finished Sentence: " + sentence.toString());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverseSentence(s);
    }

}

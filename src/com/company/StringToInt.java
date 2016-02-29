package com.company;

import java.util.Scanner;

/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class StringToInt
{
    public static void StringConvert(String str)
    {
        int factor = 1;
        int answer = 0;
        for(int x = str.length() - 1; x >= 0; x--)
        {
            answer += (str.charAt(x) - '0') * factor;
            factor *= 10;
        }

        System.out.println(answer);
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringConvert(s);
    }
}

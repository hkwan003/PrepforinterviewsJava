package com.company;

import java.util.*;
/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class checkParenthesis
{
    public static boolean checkBalanced(String str)
    {
        int paran = 0;
        int bracked = 0;
        int square = 0;
        int sz = str.length();
        for(int x = 0; x < sz; x++)
        {
            if(str.charAt(x) == '{')
            {
                paran++;
            }
            if(str.charAt(x) == '}')
            {
                paran--;
            }
            if(str.charAt(x) == '(')
            {
                bracked++;
            }
            if(str.charAt(x) == ')')
            {
                bracked--;
            }
            if(str.charAt(x) == '[')
            {
                square++;
            }
            if(str.charAt(x) == ']')
            {
                square--;
            }
        }
        if(paran == 0&& bracked == 0&& square == 0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkBalanced(s));
    }
}

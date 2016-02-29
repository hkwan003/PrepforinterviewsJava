package com.company;

import java.util.Scanner;

/**
 * Created by CalvinKwan on 2/23/2016.
 */
public class checkpermutation
{
    public static void permutation(String str)
    {
        permutation("", str);
    }

    private static void permutation(String prefix, String str)
    {
        int n = str.length();
        if(n == 0)
        {
            System.out.println(prefix);
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                /*
                System.out.printf("Prefix: %s", prefix);
                System.out.println();
                System.out.printf(" str.charAt(i): %s",  str.charAt(i));
                System.out.println();
                System.out.printf("str.substring(0, i: %s", str.substring(0, i));
                System.out.println();
                System.out.printf("str.substring(i + 1, n): %s", str.substring(i + 1, n));
                System.out.println();
                */
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permutation(s);
    }
}

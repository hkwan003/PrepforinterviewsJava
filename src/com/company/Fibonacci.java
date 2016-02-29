package com.company;

import java.util.*;

/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class Fibonacci
{
    public static int fibonacci(int i)
    {
        if(i == 0)
        {
            return 0;
        }
        if(i == 1)
        {
            return 1;
        }
        return (fibonacci(i - 1) + fibonacci(i - 2));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Fibonacci: "+ fibonacci(i));
    }

}

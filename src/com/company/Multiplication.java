package com.company;

/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class Multiplication
{
    public static int multiply2numbers(int i, int j)
    {
        int total = 0;
        if(i <= j)
        {
            for(int temp = 0; temp < i; temp++)
            {
                total = total + j;
            }
            return total;
        }
        else
        {
            System.out.println("this line should output");
            for(int temp = 0; temp < j; temp++)
            {
                total = total + i;
            }
            return total;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(multiply2numbers(100,2));
    }
}

package com.company;

/**
 * Created by CalvinKwan on 2/27/2016.
 */
public class fizzBuzz
{
    public static void fizzBuzz()
    {
        for(int x = 1; x < 100; x++)
        {
            if(x % 3 == 0 && x % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(x % 3 == 0)
            {
                System.out.println("fizz");
            }
            else if(x % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args)
    {
        fizzBuzz();
    }

}

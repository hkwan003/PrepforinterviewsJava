package com.company;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String uniqueName = sc.nextLine();
        System.out.printf("%n");
        System.out.print(isUniqueChars(uniqueName));

    }
    //problem 1.1 cracking the coding interview
    public static boolean isUniqueChars(String str)
    {
        System.out.println(str);
        System.out.printf("%n");
        if(str.length() > 128)
        {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++)
        {
            System.out.print("this incrementior is: ");
            System.out.print(i);
            System.out.printf("%n");
            int val = str.charAt(i);
            if(char_set[val])
            {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }


}

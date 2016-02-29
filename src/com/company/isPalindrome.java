package com.company;

import java.util.Scanner;

/**
 * Created by CalvinKwan on 2/27/2016.
 */
public class isPalindrome
{
    public static boolean canPermutePalindrome(String s) {
        char[] A = new char[256];
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            if(A[s.charAt(i)]>0)
            {
                System.out.println("things to come: ");
                System.out.println(0 + A[s.charAt(i)]);
                A[s.charAt(i)]--;
            }
            else
            {
                A[s.charAt(i)]++;
            }
        }
        for(int i=0; i<256; i++)
        {
            if(A[i]!=0)
            {
                count++;
            }
        }
        return count<=1;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(canPermutePalindrome(s));
    }

}

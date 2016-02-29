package com.company;

import java.util.*;
/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class splitArrayToZero
{
    public static void main(String[] args)
    {
        int [] arr;
        arr = new int[] {1,35,486,0,0,480,0,7860,0};
        Arrays.sort(arr);

        for(int x : arr)
        {
            System.out.println(x);
        }

    }

}

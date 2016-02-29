package com.company;

import java.util.*;

/**
 * Created by CalvinKwan on 2/28/2016.
 */
public class MostFrequestIntArray
{
    public static void findMostFrequent(String str)
    {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        int sz = str.length();

        for(int x = 0; x < sz; x++)
        {
            Integer count = hmap.get(Character.toString(str.charAt(x)));
            hmap.put(Character.toString(str.charAt(x)), count != null ? count + 1 : 0);
        }

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        String temp = "";
        int temp1 = 0;

        while(iterator.hasNext())
        {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            if((int) mentry.getValue() > temp1)
            {
                temp1 = (int)mentry.getValue();
                temp = (String)mentry.getKey();
            }
            System.out.println(mentry.getValue());
        }

        System.out.println("Key: " + temp + " value: " + temp1);



    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        findMostFrequent(s);
    }
}

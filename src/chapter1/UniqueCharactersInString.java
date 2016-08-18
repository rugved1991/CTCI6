package chapter1;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by rugve_000 on 8/18/2016.
 */
public class UniqueCharactersInString {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();


        //boolean isUnique=hasUniqueCharacters(str);
        boolean isUnique=hasUniqueWithHashSet(str);

        if(isUnique)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    public static boolean hasUniqueCharacters(String str)
    {
        if(str==null)
        {
            return false;
        }
        if(str.length()>128)
        {
            return false;
        }

        boolean chars[]=new boolean[128];

        for(int i=0;i<str.length();i++)
        {
            int value=str.charAt(i);
            if(chars[value])
            {
                return false;
            }
            chars[value]=true;
        }

        return true;
    }

    public static boolean hasUniqueWithHashSet(String str){

        if(str==null)
        {
            return false;
        }
        HashSet<Character> hashSet=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
        {
            if(hashSet.add(str.charAt(i))==false)
            {
                return false;
            }
        }

        return true;
    }
}



package chapter1;

import java.util.Scanner;

/**
 * Created by rugve_000 on 8/18/2016.
 */
public class OneEditAway {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();

        boolean isOneEditAway=checkOneEditAway(str1,str2);
        if(isOneEditAway)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    public static boolean checkOneEditAway(String str1, String str2)
    {
        if(str1==null || str2==null)
        {
            return false;
        }
        if(str1.length()==str2.length())
        {
            return oneEditReplace(str1,str2);
        }
        else if(str1.length()+1==str2.length())
        {
            return oneEditInsert(str1,str2);
        }
        else if(str1.length()-1 == str2.length())
        {
            return oneEditInsert(str2,str1);
        }
        return false;
    }

    public static boolean oneEditReplace(String str1,String str2)
    {
        boolean foundDifference=false;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                if(foundDifference)
                {
                    return false;
                }
                foundDifference=true;
            }
        }
        return true;
    }

    public static boolean oneEditInsert(String str1,String str2)
    {
        int index1=0;
        int index2=0;
        while(index2<str2.length() && index1<str1.length())
        {
            if(str1.charAt(index1)!=str2.charAt(index2))
            {
                if(index1!=index2)
                {
                    return false;
                }
                index2++;
            }
            else
            {
                index1++;
                index2++;
            }
        }
        return true;
    }
}

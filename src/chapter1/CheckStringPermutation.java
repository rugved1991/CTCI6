package chapter1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rugve_000 on 8/18/2016.
 */
public class CheckStringPermutation {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();

        boolean isPermutation=checkStringPermutation(str1,str2);
        if(isPermutation)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    public static boolean checkStringPermutation(String str1, String str2)
    {
        if(str1==null||str2==null)
        {
            return false;
        }
        if(str1.length()!=str2.length())
        {
            return false;
        }


        if(sort(str1).equals(sort(str2)))
        {
            return true;
        }
        return false;
    }

    public static String sort(String str)
    {
        char[] sorted=str.toCharArray();
        Arrays.sort(sorted);
        return new String(sorted);
    }
}

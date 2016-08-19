package chapter1;

import java.util.Scanner;

/**
 * Created by rugve_000 on 8/18/2016.
 */
public class PermutationOfPalindrome {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String phrase");
        String str=sc.nextLine();

        boolean isPermutation=checkPermutationOfPalindrome(str);

        if(isPermutation)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

   public static boolean checkPermutationOfPalindrome(String str)
   {
       //int[] table=buildCharFrequency(str);
       //return maxOneOdd(table);

       int[] table=new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
       int countOdd=0;

       for(char c: str.toCharArray())
       {
           int x=getCharNum(c);
           if(x!=-1)
           {
               table[x]++;
               if(table[x]%2==1)
               {
                   countOdd++;
               }
               else
               {
                   countOdd--;
               }
           }
       }
        return countOdd <= 1;
   }

   public static int[] buildCharFrequency(String str)
   {
       int[] table=new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
       char[] strArr=str.toCharArray();
       for(char c : strArr)
       {
           int x=getCharNum(c);
           if(x!=-1)
           {
               table[x]++;
           }
       }
       return table;
   }

   public static int getCharNum(char ch)
   {
       int a=Character.getNumericValue('a');
       int z=Character.getNumericValue('z');
       int val=Character.getNumericValue(ch);
       if(a<=val && val<=z)
       {
           return val-a;
       }
       return -1;
   }

   public static boolean maxOneOdd(int[] table)
   {
       boolean maxOddFound=false;
       for(int i : table)
       {
           if(i%2==1)
           {
               if(maxOddFound)
               {
                   return false;
               }
               maxOddFound=true;
           }
       }
       return true;
   }
}

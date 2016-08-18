package chapter1;

import java.util.Scanner;

/**
 * Created by rugve_000 on 8/18/2016.
 */
public class ConvertSpaces {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        char[] charArr=str.toCharArray();
        System.out.println("Enter true length:");
        int len=sc.nextInt();

        String result=convertSpaces(charArr,len);
        if(result!=null) {
            System.out.println(result);
        }
    }

    public static String convertSpaces(char[] str, int len)
    {
        if(str==null||len<=0)
        {
            return null;
        }

        int count=0;
        for(int i=0;i<len;i++)
        {
            if(str[i]==' ')
            {
                count++;
            }
        }

        int index=len+count*2;
        if(len<str.length)
        {
            str[len]='\0';
        }

        for(int i=len-1;i>=0;i--)
        {
            if(str[i]==' ')
            {
                str[index-1]='0';
                str[index-2]='2';
                str[index-3]='%';
                index=index-3;
            }
            else {
                str[index-1]=str[i];
                index--;
            }
        }
        return new String(str);
    }
}

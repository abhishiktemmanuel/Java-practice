/**20.Write a program to read a string and print the number 
of times each word occurs in the entire text. At the end
of output should be sorted into descending order of 
usage of words. Let there be at the most 50 words in the text.
e.g. You are good when your thoughts are good and your  deeds are good.
Output
Good 3
Are 3
Your 2**/
import java.util.*;
class Q20
{
  Scanner ob=new Scanner(System.in);
  void main()
  {
    while(true)
    {
       System.out.println("ENTER SRING");
       String str=ob.nextLine();
       StringTokenizer s=new StringTokenizer(str," ,.;?!_+=");
       int t=s.countTokens();
       String arr[]=new String[t];
       String arr1[]=new String[t];
       int count=0;
       String temp="";
       for(int i=0;i<t;i++)
         arr[i]=s.nextToken();
       for(int i=0;i<t;i++)
       {
          for(int j=0;j<t;j++)
            if(arr[i].equalsIgnoreCase(arr[j]))
              ++count;
          for(int k=0;k<t;k++)
          {
             temp=(arr1[i]+count);
             if(temp.equalsIgnoreCase(arr1[k]))
                break;
             else
             {
                arr1[i]=arr[i]+count;
                break;
             }
          }
          count=0;
       }
       for(int i=0;i<(t-1);i++)
         for(int j=0;j<(t-1-i);j++)
           if(arr1[j].charAt(arr1[j].length()-1)<arr1[j+1].charAt(arr1[j+1].length()-1))
           {
              temp=arr1[j];
              arr1[j]=arr1[j+1];
              arr1[j+1]=temp;
           }
       for(int i=0;i<t;i++)
         System.out.println(arr1[i]);
    }
  }
}
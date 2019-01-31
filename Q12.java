/**12. Write a program in java to store 20 numbers in single dimension array and arrange them in
ascending order, display all those numbers, which make a series continuous in ascending order till the
last number.
Sample Input:
14, 51, 62, 11, 44,…..
Ascending Order : 11, 14, 44, 51, 62
Sample output.
12,13,15……..43, 45…..50, 52…..61**/
import java.util.*;
class Q12
{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        while(true)
        {
            System.out.println("ENTER SERIES");
            String str=ob.nextLine();
            StringTokenizer s=new StringTokenizer (str,", ");
            int n=s.countTokens();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=Integer.valueOf(s.nextToken());
            for(int i=0;i<(n-1);i++)
                for(int j=0;j<(n-1-i);j++)
                    if(a[j]>a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
            for(int i=0;i<(n-1);i++)
                for(int j=(1+a[i]);j<a[i+1];j++)
                    System.out.print(j+",");
        }
    }
}
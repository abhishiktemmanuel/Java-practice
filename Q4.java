/**4. Write a program to enter a natural number. Display all the possible combination of consecutive
numbers which add up to give the sum equal to the original number.
Sample input : 14
Sample input : 1+2+5+6
2+3+9
3+5+6
5+9**/
import java.util.*;
public class Q4
{
  void main()
  {
    while(true)
    {
     Scanner obj=new Scanner (System.in);
     System.out.println("ENTER THE INTEGER");
     int n=obj.nextInt();
     for(int i=1;i<n;i++)
       for(int j=i+1;j<n;j++)
       {
         for(int k=j+1;k<n;k++)
         //Adding 4 numbers
           if((i+j+k)<n)
             if(n-(i+j+k)>i||n-(i+j+k)>j||n-(i+j+k)>k)
               if(i<j&&j<k&&k<n-(i+j+k))
               {
                 System.out.print(i+"+"+j+"+"+k+"+"+(n-(i+j+k)));
                 System.out.println();
               }
         //Adding 3 numbers
         if((i+j)<n)
           if(n-(i+j)>i||n-(i+j)>j)
             if(i<j&&j<(n-(i+j)))
             {
                System.out.print(i+"+"+j+"+"+(n-(i+j)));
                System.out.println();
             } 
         //Adding 2 numbers
         if((i+j)==n)
          if(i<j)
          {
            System.out.print(i+"+"+j);
            System.out.println();
          }
        }
    }
  }
}          
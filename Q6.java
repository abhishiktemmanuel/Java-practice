/**6. Write a program in java to find the sum of the given series after 
accepting the value of ‘a’ from console.
S= 1+ a10 / 2! + a8 / 4! + a6 / 6! + ……………………… a2 / 10!**/
import java.util.*;
public class Q6
{
    long factorial(int n)
    {
        long f=1;
        for (int i=1;i<=n;i++)
        
            f=f*i;
        return (f);
    }
    void main()
    {
        while(true)
        {
            Scanner ob=new Scanner (System.in);
            System.out.println("ENTER THE VALUE OF   'a'");
            int a=ob.nextInt();
            double S=1;
            int j=5;
            for(int i=1;i<=5;i++,j--)
                S=S+((Math.pow(a,(j*2)))/(factorial(i*2)));
            System.out.print("S="+S);
        }
    } 
}    
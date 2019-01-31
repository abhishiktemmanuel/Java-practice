/**Question 18.
The binary digits are added as per following rules:
0+0 = 0
0+1 = 1
1+0 = 1
carry bit
1+1 = 1 0
carry bit
1+1+1 = 1 1
The Class given below contains a method BinAdd .
Define thiS method so that two binary numbers get added.**/
import java.util.*;
class Q18
{
    Scanner ob=new Scanner(System.in);
    void BinAdd()
    {
        int i=0;
        int remainder=0;
        int sum[]=new int[20];
        System.out.println("INPUT FIRST BINARY NUMBER");
        int b1=ob.nextInt();
        System.out.println("INPUT SECOND BINARY NUMBER");
        int b2=ob.nextInt();
        while(b1!=0||b2!=0)
        {
            sum[i++]=(int)((b1%10+b2%10+remainder)%2);
            remainder=(int)((b1%10+b2%10+remainder)/2);
            b1=b1/10;
            b2=b2/10;
        }
        if(remainder!=0)
            sum[i++]=remainder;
        --i;
        System.out.println("SUM OF TWO BINARY NUMBERS");
        while(i>=0)
            System.out.print(sum[i--]);
        System.out.println();
    }
}
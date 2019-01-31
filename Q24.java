import java.util.*;
class Q24
{
    Scanner ob=new Scanner(System.in);
    /**Butchering Farmer John's cows always yields the best prime 
     * rib. You can tell prime ribs by looking at the
    digits lovingly stamped across them, one by one, by 
    FJ and the USDA. Farmer John ensures that a
    purchaser of his prime ribs gets really prime ribs because 
    when sliced from the right, the numbers on the
    ribs continue to stay prime right down to the last rib, e.g.:
    7 3 3 1
    The set of ribs denoted by 7331 is prime; the three ribs 733 
    are prime; the two ribs 73 are prime, and, of course, the 
    last rib, 7, is prime. The number 7331 is called a superprime 
    of length 4.
    Write a program that accepts a number N 1 <=N<=8 of ribs and prints all the superprimes of that length.
    The number 1 (by itself) is not a prime number. **/
    boolean superprime(int n,int d)
    {
        int c=0;int c1=0;
        for(int i=1;i<=d;i++)
        {
            for(int j=1;j<=n;j++)
                if(n%j==0)
                    ++c;
            if(c==2)
                ++c1;
            n=n/10;
            c=0;
        }
        if(c1==d)
            return true;
        else
            return false;
    }

    /**153 = 1^3+ 5^3+ 3^3
     *1634 = 1^4+ 6^4+ 3^4+ 4^4
    The above numbers are called Pluperfect Digital Invariants 
    or PPDIs. They are also called ArmstrongNumbers. In each 
    case, the power corresponds to the number of digits. 
    There are no PPDIs for numbers of2, 12 or 13 digits. 
    The number shown for 11 digits is one of eight such **/
    boolean Pluperfect_Digital_Invariants(int n)
    {
        int s=0;int m=n;int c=0;
        while(n!=0)
        {
            n=n/10;
            ++c;
        }
        n=m;
        while(n!=0)
        {
            s=s+(int)Math.pow((n%10),c);
            n=n/10;
        }
        if(s==m)
            return true;
        else
            return false;
    }

    /**Recurring Digital Invariant
    Each number of each of the following two series is known as 
    a Recurring Digital Invariant or RDI.Here is an order three 
    RDI, 55, with two intermediate numbers before 55 appears 
    again. The order four RDI, 1138, has six intermediate numbers
    before 1138 reappears. Notice that RDI’s are not necessarily
    Armstrong numbers i.e. the power is not necessarily the same
    as the length of the number. RDI’s, PDI's and PPDI’s are members
    of a larger class of numbers called narcissistic. A narcissistic 
    number is defined as one that may be represented by some 
    manipulation of its digits
    eg:55 : 5^3+ 5^3 = 250
      250 : 2^3+ 5^3+ 0^3= 133
      133 : 1^3+ 3^3+ 3^3= 55**/
    boolean Recurring_Digital_Invariant(int n,int order,int cycle)
    {
        int m=n;
        for(int i=1;i<=cycle;i++)
        {
            int s=0;
            while(n!=0)
            {
                s=s+(int)Math.pow((n%10),order);
                n=n/10;
            }
            n=s;
        }
        if(m==n)
            return true;
        else
            return false;
    }

    void main()
    {
        while(true)
        {
            System.out.println("1.SUPER PRIME NUMBERS");
            System.out.println("2.Pluperfect Digital Invariants or PPDIs(ARMSTRONG)");
            System.out.println("3.Recurring Digital Invariant");
            System.out.println("ENTER YOUR CHOICE");
            int c=ob.nextInt();
            switch(c)
            {
                case 1:
                System.out.println("ENTER NUMBER OF DIGITS");
                int d=ob.nextInt();
                if(d>=1&&d<=8)
                {
                    --d;
                    for(int n=(int)(Math.pow(10,d));n<(int)(Math.pow(10,(1+d)));n++)
                        if(superprime(n,d)==true)
                            System.out.print(n+" ");
                }
                else 
                    System.out.println("!!!INCORRECT DIGIT COUNT!!!!");
                System.out.println();
                break;
                case 2:
                System.out.println("ENTER NUMBER TO BE CHECKED");
                int n=ob.nextInt();
                if(Pluperfect_Digital_Invariants(n)==true)
                    System.out.println("THE GIVEN NUMBER IS A PULPERFECT DIGITAL NUMBER");
                else
                    System.out.println("NO THE GIVEN NUMBER IS NOT A PULPERFECT DIGITAL NUMBER");
                break;
                case 3:
                System.out.println("ENTER NUMBER TO BE CHECKED");
                int number=ob.nextInt();
                System.out.println("ENTER \"ORDER\"");
                int Order=ob.nextInt();
                System.out.println("ENTER \"LENGTH OF CYCLE\"");
                int Cycle=ob.nextInt();
                if(Recurring_Digital_Invariant(number,Order,Cycle)==true)
                    System.out.println("THE GIVEN NUMBER IS A RECURRING DIGITAL INVARIANT");
                else
                    System.out.println("NO THE GIVEN NUMBER IS NOT A RECURRING DIGITAL INVARIANT");
                break;
                default:
                System.out.println("!!!WRONG CHOICE!!!");
                System.out.println("!!!PLEASE TRY AGAIN!!!");
            }
        }
    }
}
/**Question. 16
Class Name : Date
Member Ddata : integers dd, mm, yy
Member Function :
constructors - Both default and argument
void read() - input date, month and year from user
int noOfDays() - returns number of days starting from 1st Jan. Take
care of Leap Year.
Write a complete program to accept date from user and print it is which day of the year.**/
import java.util.*;
class Date
{   
    int dd,mm,yy;
    Scanner ob=new Scanner (System.in);
    Date()
    {
        dd=0;
        mm=0;
        yy=0;
    }
    void read()
    {
        System.out.print("ENTER DAY");
        dd=ob.nextInt();
        System.out.print("ENTER MONTH");
        mm=ob.nextInt();
        System.out.print("ENTER YEAR");
        yy=ob.nextInt();
    }
    int noOfDays(int dd,int mm,int yy)
    {
        int[] md={31,28,31,30,31,30,31,31,30,31,30,31};
        int days=dd;
        if(dd>31)
            System.out.println("!!!!!!WRONG DATE INPUT!!!!!!!");
        try
        {

            if(yy%4==0)
                md [1]=29;

            for(int i=0;i<(mm-1);i++)
                days=days+md[i];

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("!!!!!!!!WRONG INPUT!!!!!!!!");
        }
        return days;
    }
    void main()
    {
        read();
        noOfDays(dd,mm,yy);
    }
}
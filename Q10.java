/**10. Write a program to input two strings. Display the words, whose frequency is more than on in the
strings.
Sample Input:
MAHENDRA SINGH DHONI IS THE CAPTAIN OF INDIAN CRICKET TEAM.
SAURAV GANGULY IS THE EX-CAPTAIN OF THE INDIAN CRICKET TEAM
Sample output.
THE
ON
INDIAN
CRICKET
TEAM
IS*/
import java.util.*;
class Q10
{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        while(true)
        {
            System.out.println("ENTER  1st STING");
            String str1=ob.nextLine();
            System.out.println("ENTER  2nd STING");
            String str2=ob.nextLine();
            StringTokenizer s1=new StringTokenizer (str1," ,.?'/|");
            StringTokenizer s2=new StringTokenizer (str2," ,.?'/|");
            int n1=s1.countTokens();
            int n2=s2.countTokens();
            String arr1[]=new String[n1];
            String arr2[]=new String[n2];
            for(int i=0;i<n1;i++)
                arr1[i]=s1.nextToken();
            for(int i=0;i<n2;i++)
                arr2[i]=s2.nextToken();
            for(int i=0;i<n1;i++)
                for(int j=0;j<n2;j++)
                    if(arr1[i].equals(arr2[j]))
                        System.out.println(arr1[i]);
        }
    }          
}
/**14. Write program to store 11 different numbers in SDA. Arrange them in such a way the highest
element should be in the middle. Second highest in the left side of it and third highest to the right side
and so on.
Sample Input:
71 40 69 56 19 31 85 99 23 91 59
Sample output.
23 40 59 71 91 99 85 66 56 31 19**/
import java.util.*;
class Q14
{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        while(true)
        {
            int n=11;
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("ENTER ELEMENT "+(1+i));
                a[i]=ob.nextInt();
            }
            for(int i=0;i<(n-1);i++)
                for(int j=0;j<(n-1-i);j++)
                    if(a[j]<a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
            int mid=(n-1)/2;
            b[mid]=a[0];
            int j=0;
            for(int i=1;i<=5;i++)
            {
                b[mid+i]=a[++j];
                b[mid-i]=a[++j];
            }
            for(int i=0;i<n;i++)

                System.out.println(b[i]);
        }
    }
}

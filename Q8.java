/**8. Write a program to accept a string and replace the first alphabet
of each word With ‘X’.
Sample Input:
Computer Science is the Text Book for the Plus two students.
Sample output.
Xomputer Xcience Xs Xhe Xext Xook Xor Xhe Xlus Xwo Xtudents**/
import java.util.*;
class Q8
{
    Scanner ob=new Scanner(System.in);
    char x;String k;
    void Replace_1st_alphabet_of_each_word_with_X(String str,int i,String s)
    {
        if(i<str.length())
        {
            if(i==0)
                k="";
            else
                k=" ";
            x=str.charAt(i);
            if(x==' ')
            {
                s=s+k+"X";
                i=i+2;
                Replace_1st_alphabet_of_each_word_with_X(str,i,s);
            }
            else
            {
                s=s+x;
                Replace_1st_alphabet_of_each_word_with_X(str,++i,s);
            }
        }
        else
            System.out.println(s);
    }
    void main()
    {
        while (true)
        {
            System.out.println("ENTER STRING");
            String str=ob.nextLine();
            str=" "+str;
            Replace_1st_alphabet_of_each_word_with_X(str,0,"");
        }
    }
}
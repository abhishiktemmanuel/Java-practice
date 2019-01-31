/**22. Observe that
12 X 42 = 21 X 24
12 X 84 = 21 X 48
These product have the property that
(10.a+b)(10.c+d)=(10.b+a)(10.d+c)
where a and b are unequal and c and d are unequal
To output all such two digit number.**/
class Q22
{
    void main()
    {
        for(int i=10;i<100;i++)
            for(int j=10;j<100;j++)
                if((i/10)!=(i%10)&&(j/10)!=(j%10))
                    if(i*j==((10*(i%10))+(i/10))*((10*(j%10))+(j/10)))
                        System.out.print(i+"x"+j+"    ");
    }
}
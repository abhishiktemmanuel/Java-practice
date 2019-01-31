/**2. Write a program to find the volume of cylinder, cone and sphere according the user’s choice.
Volume of cylinder = 22/7*R*R*R
Volume of cone = 1/3 ∏ r2
h
Volume of sphere = 4/3 ∏ r3
3 Write a program to accept a number and arrange the digits in ascending order.
Sample input : 4925
Sample output : 2,4,5,9**/
import java.util.*;
public class Q2
{
  void main()
  {
    while(true)
    {
       Scanner obj=new Scanner (System.in);
       System.out.println("1.VOLUME OF CYLINDER");
       System.out.println("2.VOLUME OF CONE");
       System.out.println("3.VOLUME OF SPHERE");
       int c=obj.nextInt();
       switch(c)
       {
          case 1:
          System.out.println("ENTER THE height of the cylinder");
          double height_of_cylinder=obj.nextInt();
          System.out.println("ENTER THE RADIUS of the cylinder");
          double radius_of_cylinder =obj.nextInt();
          double k0=22/7*radius_of_cylinder *radius_of_cylinder *height_of_cylinder;
          System.out.println("Volume of the given cylinder="+k0);
          break;
          case 2:
          System.out.println("ENTER THE HEIGHT OF CONE");
          double height_of_cone=obj.nextInt();
          System.out.println("ENTER THE RADIUS of the cone");
          double radius_of_cone =obj.nextInt();
          double volume_of_cone=(1/3.0)*(22/7)*radius_of_cone*radius_of_cone*height_of_cone;
          System.out.println("Volume of the given cone="+volume_of_cone);
          break;
          case 3:
          System.out.println("ENTER THE RADIUS of the given sphere");
          double ro=obj.nextInt();
          double k1=4/3*22/7*ro*ro*ro;
          System.out.println("Volume of the given sphere="+k1);
          break;
          default:
          System.out.println("WRONG CHOICE TRY AGAIN!!");
        }
    }
  }
}
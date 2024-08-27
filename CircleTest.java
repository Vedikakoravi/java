import java.io.*;
class Circle
{
double r,ar,c;

Circle()
{
r=14;
}

Circle(double rad)
{
r=rad;
}

Circle(Circle c)
{
r=c.r;
}

void showarea()
{
ar=3.14*r*r;
c=2*3.14*r;

System.out.println("Radius :"+r+"\t Area :"+ar+"\t Circum :"+c);
}
}

class CircleTest
{
public static void main(String args[])
{
Circle obj1=new Circle();
Circle obj2=new Circle(20);
Circle obj3=new Circle(obj1);

obj1.showarea();
obj2.showarea();
obj3.showarea();

}
}

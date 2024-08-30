import java.util.Scanner;
class Book
{
String bnm;
int bno,cp;

Scanner sc = new Scanner(System.in);

void get()
{
System.out.print("Book name :");
bnm=sc.next();
System.out.print("Book number :");
bno=sc.nextInt();
System.out.print("copies :");
cp=sc.nextInt();
}
}

class Library extends Book
{
String snm;
int rno;

void put()
{
System.out.print("Enter the name of student :");
snm=sc.next();
System.out.print("Roll Number :");
rno=sc.nextInt();
}
}

class Issued extends Library
{
int iss;
void display()
{
iss =cp-1;
System.out.print("Issued book :"+iss);
System.out.println("");

}
}

class Returned extends Issued
{
int rt;
void show()
{
rt =cp+1;
System.out.print("Returned book :"+rt);
System.out.println(" ");
}

public static void main(String args[])
{
int opt;
Scanner s=new Scanner(System.in);
do
{

System.out.println("1.Issued Book \t 2.Returned Book\n");
opt=s.nextInt();

Returned obj=new Returned();
switch(opt)
{
case 1:

obj.get();
obj.put();
obj.display();
break;

case 2:
obj.get();
obj.put();
obj.show();
}
}while(opt>0 && opt<3);
}
}




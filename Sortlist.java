	import java.util.*;

class Number
{
void sortno(int m[])
{
int a,b,temp;
for(a=0;a<=8;a++)
{
for(b=a+1;b<=9;b++)
{
if(m[a]>m[b])
{
temp=m[a];
m[a]=m[b];
m[b]=temp;
}
}
}
}
void sortno(double n[])
{
int a,b;
double temp;
for(a=0;a<=8;a++)
{
for(b=a+1;b<=9;b++)
{
if(n[a]<n[b])
{
temp=n[a];
n[a]=n[b];
n[b]=temp;
}
}
}
}
}

class Sortlist
{
public static void main(String []args)
{
Number no = new Number();

Scanner sc = new Scanner(System.in);
int i,a;

int m[]=new int[10];
double n[]=new double[10];

for(i=0;i<=9;i++)
{
System.out.println("Enter Integer and Double :");
m[i] = sc.nextInt();
n[i] = sc.nextDouble();
}
no.sortno(m);
no.sortno(n);
System.out.println("Sorted List Ascending: ");
for(a=0;a<=9;a++)
{
System.out.println(m[a]);
}
System.out.println("Sorted List Descending: ");
for(a=0;a<=9;a++)
{
System.out.println(n[a]);
}
}
}

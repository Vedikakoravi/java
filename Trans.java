import java.util.*;
class Stock
{
String item;
int avail;
Scanner sc=new Scanner(System.in);
void get()
{
System.out.println("enter the item");
item=sc.next();
System.out.println("Enter the availability");
avail=sc.nextInt();

}
}

class Trans extends Stock
{
int sale,pqty,bal;
void showtrans()
{
System.out.println("Enter the sale Item :");
sale=sc.nextInt();
System.out.println("Enter the purchase qty :");
pqty=sc.nextInt();
bal=avail-sale+pqty;
System.out.println("balance ="+bal);
}
public static void main(String args[])
{
Trans t=new Trans();
t.get();
t.showtrans();
}

}

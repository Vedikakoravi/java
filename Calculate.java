import java.util.Scanner;

class Circle {
    double r;
    Scanner sc = new Scanner(System.in);

    void getradius() {
        System.out.print("Radius: ");
        r = sc.nextDouble();
    }
}

class Area extends Circle {
    double ar;

    void showarea() {
        ar = 3.14 * r * r;
        System.out.println("Area: " + ar);
    }
}

class Circum extends Circle {
    double cir;

    void showcircum() {
        cir = 2 * 3.14 * r;
        System.out.println("Circumference: " + cir);
    }
}

public class Calculate {
    public static void main(String args[])
    {
       int opt;
       Scanner ip=new Scanner(System.in);
       
       do{
       System.out.println("1.Area \t 2.Circumference ");
       opt=ip.nextInt();
       
       switch(opt)
       {
        case 1:
        Area a = new Area();
        a.getradius();
        a.showarea();
        break;

        case 2:
        Circum c = new Circum();
        c.getradius();
        c.showcircum();
       }
       }while(opt>0 && opt<3);
    }
}

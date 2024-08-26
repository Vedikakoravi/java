import java.util.Scanner;

class Cricket
 {
    String name[];
    int pno[], runs[], inn[];
    double avg[];

    void get()
 {
        Scanner sc = new Scanner(System.in);
        name = new String[5];
        pno = new int[5];
        runs = new int[5];
        inn = new int[5];
        avg = new double[5];
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Player name: ");
            name[i] = sc.next();
            System.out.print("Player Number: ");
            pno[i] = sc.nextInt();
            System.out.print("Runs: ");
            runs[i] = sc.nextInt();
            System.out.print("Innings: ");
            inn[i] = sc.nextInt();
        }
        sc.close();
    }

    void show()
       {
        for (int i = 0; i < 5; i++) 
        {
            avg[i] = (double) runs[i] / inn[i];
            System.out.println(name[i] + "\t" + "Average runs: " + avg[i]);
        }
    }
}

class CricketTest 
{
    public static void main(String args[]) 
    {
        Cricket c = new Cricket();
        c.get();
        c.show();
    }
}



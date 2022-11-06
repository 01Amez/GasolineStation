
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class fun {
    private int super1;
    private int muhasan;
    private int normal;
        boolean u = true;

    public fun(int super1, int muhasan, int normal) {
        this.super1 = super1;
        this.muhasan = muhasan;
        this.normal = normal;

    }

    int getsuper() {
        return super1;
    }

    int getmuhasan() {
        return muhasan;
    }

    int getnormal() {
        return normal;
    }

    void k1() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a");

        System.out.println("Current Date: " + ft.format(dNow));

        System.out.println("Gasoline Price According To Today is date \nsuper\\ " + getsuper() + " IQD \nmuhasan\\ " + getmuhasan() + " IQD \nNormal\\ " + getnormal() + " IQD");
    }

    void k2() {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Do you want try this option ?");
        System.out.print("Yes or another number for No\n ");
        System.out.println();

        String a = s.nextLine();
        if (a.equals("yes")) {

            while (u) {
                System.out.print("You Want To Try a Few beston Cars ?\n");
                int c = s.nextInt();
                switch (c) {
                    case 4:
                        System.out.print("The Four Beston Car Could Have 18 Kilometers Of Wounds In The Range\nYou Want a Few Liters:\n ");
                        int x4 = s.nextInt();
                        System.out.print("The Litre You Chose is \\ " + x4 * 18 + " km\n ");
                        u = false;
                        break;
                    case 6:
                        System.out.print("The six Beston Car Could Have 13 Kilometers Of Wounds In The Range\nYou Want a Few Liters:\n ");

                        int x6 = s.nextInt();

                        System.out.print("The Litre You Chose is \\ " + x6 * 13 + " KM\n ");
                        u = false;
                        break;
                    case 8:
                        System.out.print("The eight Beston Car Could Have 10 Kilometers Of Wounds In The Range\nYou Want a Few Liters:\n ");

                        int x8 = s.nextInt();
                        System.out.print("The Litre You Chose is  \\ " + x8 * 10 + " KM\n");
                        u = false;
                        break;
                    default:
                        System.out.println("Please Choose The Correct Option\n");
                }
            }
        }
    }

    void k3() {
        Scanner s = new Scanner(System.in);
        boolean t = true;
        System.out.print("How many Liters Do You need?\n ");
        double o = s.nextDouble();
        while (t) {
            System.out.println("What type Of Gasoline Do You Want ?\nChoose Number One If You Want Super Gasoline \\" + o * 850 + " IQD \nChoose Number Two If You Want Muhasan Gasoline\\ " + o * 750 + " IQD\nChoose Number Three If You Want Normal Gasoline\\ " + o * 700 + " IQD\n");
            int p = s.nextInt();
            switch (p) {
                case 1:
                    System.out.println("The Price Of The Gasoline You Want it is " + (o * 850) + "IQD\n ");
                    t = false;
                    break;
                case 2:
                    System.out.println("The Price Of The Gasoline You Want it is " + (o * 750) + "IQD\n");
                    t = false;
                    break;
                case 3:
                    System.out.println("It is The Price Of The Gasoline You Want it is " + (o * 700) + "IQD\n");
                    t = false;
                    break;
                default:
                    System.out.println("Please Choose The Correct Option");

            }
        }
    }
}

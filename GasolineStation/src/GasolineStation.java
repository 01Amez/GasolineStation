
import java.util.*;
public class GasolineStation {

    static {
        System.out.println("|_________________________________________________________________________________________________________|");
        System.out.println("|&&&&&&&&&                      Hello welcome to Mama Vandam gas station                         &&&&&&&&&|");
        System.out.println("|_________________________________________________________________________________________________________|");

    }

    public static void main(String[] args) {
        fun o = new fun(850, 750, 700);
        Scanner s = new Scanner(System.in);
        System.out.println("\nChoose Number One For Price\nChoose Number Two For L\\Km\nChoose Number Three To Buy Gasoline");
        while (true) {
            System.out.print("Enter the number : ");
            String x = s.nextLine();
            switch (x) {
                case "1":
                    o.k1();
                    break;
                case "2":
                    o.k2();
                    break;
                case "3":
                    o.k3();
                    break;
                case "4":
                    System.out.println("we are glad for Choosing us have a Good Time");
                    System.exit(0);
                default:
                    System.out.println("Please Choose The Correct Option");
                    break;
            }
            System.out.println("\nChoose Number One For Price\nChoose Number Two For L\\Km\nChoose Number Three To Buy Gasoline \nChoose Number Four For Exit\n");

        }
    }
}

import java.util.Scanner;

public class MyCalculator {
    static Calculate calc_ = new Calculate();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShowMenu();
        int UserSEL = sc.nextInt();
        while (true) {
            System.out.println("\nTo exit, Type -1");
            System.out.println("Type 2 Elements : ");
            int In1 = sc.nextInt();
            if (In1 == -1) break;
            int In2 = sc.nextInt();
            System.out.print("Ans : ");
            if (UserSEL == 1) System.out.print(calc_.add(In1,In2));
            else if (UserSEL == 2) System.out.print(calc_.minus(In1,In2));
            else if (UserSEL == 3) System.out.print(calc_.devide(In1,In2));
        }
    }
    public static void ShowMenu() {
        System.out.println("Mycalc\nMENUS\n");
        System.out.println("1.Plus\n2.Minus\n3.Devide");
    }

}

class Calculate {
    int add(int A,int B) {
        return A+B;
    }
    int minus(int A,int B) {
        return A-B;
    }
    int devide(int A,int B) {
        return A/B;
    }
}

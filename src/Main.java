import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Nhap a");
        a = scanner.nextInt();
        System.out.print("Nhap b");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0||b==0){
            System.out.println("No greatest common factor");
        }else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }

            System.out.println("Greatest common factor: " + a);
        }
    }
}

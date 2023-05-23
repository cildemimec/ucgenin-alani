import java.util.Scanner ;

public class Main {
    public static void main (String[] args) {
        //Değişkenlerinizi oluşturalım
        int a, b, c;
        double u, alan;

        // kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. kenarı giriniz : ");
        b = girdi.nextInt();
        System.out.print("3. kenarı giriniz : ");
        c = girdi.nextInt();

        u = (a + b + c) /2;
        alan = (u*u);
        System.out.print(alan);
    }
}
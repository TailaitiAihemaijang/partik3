import java.util.Scanner;
/**
 * ClassName: UcgenAlanHesaplima
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 4/30/2023 6:52 AM
 * @Version 1.0
 */
public class UcgenAlanHesaplima {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenari giriniz : ");
        a = girdi.nextDouble();
        System.out.print("2.kenari giriniz : ");
        b = girdi.nextDouble();
        System.out.print("3.kenari giriniz : ");
        c = girdi.nextDouble();
        u = (a + b + c)/2;
        alan =Math.sqrt(u * (u - a)* (u - b ) * (u - c));
        System.out.println("Ucgen Alani : " + alan);
    }
}

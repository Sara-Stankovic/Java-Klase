package Trougao;

import java.util.Scanner;

public class TrougaoTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi stranicu A: ");
        double a = sc.nextDouble();

        System.out.println("Unesi stranicu B: ");
        double b = sc.nextDouble();

        System.out.println("Unesi stranicu C: ");
        double c = sc.nextDouble();

        Trougao tr = new Trougao(a,b,c);

        System.out.println("Stranice trougla su: " + tr.getStranicaA() + ", " + tr.getStranicaB() + ", " + tr.getStranicaC());

       /* if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Obim i povrsina se ne mogu izracunati");
        } else */

            System.out.println("Obim trougla je: " + tr.obim());
            System.out.println("Povrsina trougla je: " + tr.povrsina());

        System.out.println(tr);


    }
}

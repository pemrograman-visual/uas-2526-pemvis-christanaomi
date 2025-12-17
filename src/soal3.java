//Christa Naomi Silalahi-12S25041
//Tongam Prozona Manurung-12S25007

import java.util.*;
import java.lang.Math;

public class soal3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, m, j, daya, subTotal, grandTotal;
        String nama;

        grandTotal = 0;
        n = Integer.parseInt(input.nextLine());
        System.out.println("Total Konsumsi");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            m = Integer.parseInt(input.nextLine());
            subTotal = 0;
            for (j = 1; j <= m; j++) {
                daya = Integer.parseInt(input.nextLine());
                subTotal = subTotal + daya;
            }
            System.out.println(nama + " = " + subTotal + " wh");
            grandTotal = grandTotal + subTotal;
        }
        System.out.println("Total konsumsi kamar = " + grandTotal + " wh");
        if (grandTotal <= 1000) {
            System.out.println("Konsumsi masih dalam batas wajar.");
        } else {
            System.out.println("Peringatan: Konsumsi daya berlebih!");
        }
    }
    
    public static int totalKonsumsi(int m, int n, int i, int j, int subTotal, int grandTotal, int daya) {
        String nama;

        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            m = Integer.parseInt(input.nextLine());
            subTotal = 0;
            for (j = 1; j <= m; j++) {
                daya = Integer.parseInt(input.nextLine());
                subTotal = subTotal + daya;
            }
            System.out.println(nama + " = " + subTotal + " wh");
            grandTotal = grandTotal + subTotal;
        }
        
        return Total;
    }
}

//Christa Naomi Silalahi-12S25041
//Tongam Prozona Manurung-12S25007
import java.util.*;
import java.lang.Math;

public class soal4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, shift, total, maxVal, minVal;
        String nama, maxName, minName;

        total = 0;
        n = Integer.parseInt(input.nextLine());
        System.out.println("Daftar Shift:");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            shift = Integer.parseInt(input.nextLine());
            System.out.println(nama + " = " + shift);
            total = total + shift;
            if (i == 1) {
                maxVal = shift;
                maxName = nama;
                minVal = shift;
                minName = nama;
            } else {
                if (shift > maxVal) {
                    maxVal = shift;
                    maxName = nama;
                }
                if (shift < minVal) {
                    minVal = shift;
                    minName = nama;
                }
            }
        }
        System.out.println("Total shift = " + total);
        System.out.println("Rata-rata = " + (double) total / n);
        System.out.println("Shift terbanyak: " + maxName + " (" + maxVal + ")");
        System.out.println("Shift tersedikit: " + minName + " (" + minVal + ")");
        if (maxVal - minVal > 3) {
            System.out.println("Distribusi shift tidak merata, beberapa asisten terbebani.");
        } else {
            System.out.println("Distribusi shift cukup merata.");
        }
    }
}

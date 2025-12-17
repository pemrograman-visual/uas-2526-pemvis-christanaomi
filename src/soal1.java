//Christa Naomi Silalahi-12S25041
//Tongam Prozona Manurung-12S25007 
 * Timport java.util.*;
import java.lang.Math;

public class soal1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, jumlahRatingTinggi, max, min;
        double total, rataRata;

        System.out.println("Masukkan jumlah data (N):");
        n = Integer.parseInt(input.nextLine());
        int[] rating = new int[n];

        total = 0;
        jumlahRatingTinggi = 0;
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Masukkan rating ke-" + i + 1 + ":");
            rating[i] = Integer.parseInt(input.nextLine());
        }
        max = rating[0];
        min = rating[0];
        System.out.print("Daftar rating: ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(Integer.toString(rating[i]) + " ");
            total = total + rating[i];
            if (rating[i] > max) {
                max = rating[i];
            }
            if (rating[i] < min) {
                min = rating[i];
            }
            if (rating[i] >= 4) {
                jumlahRatingTinggi = jumlahRatingTinggi + 1;
            }
        }
        System.out.println("");
        rataRata = total / n;
        System.out.println("Rata-rata: " + toFixed(rataRata,2));
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah: " + min);
        System.out.println("Reviewer rating >= 4: " + jumlahRatingTinggi + " orang");
        if (rataRata >= 4) {
            System.out.println("Kondisi sangat baik!");
        } else {
            if (rataRata >= 3) {
                System.out.println("Kondisi cukup, masih perlu peningkatan.");
            } else {
                System.out.println("Kondisi kurang, perlu evaluasi mendalam.");
            }
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

        }
    }
}

//Christa Naomi Silalahi-12S25041
//Tongam Prozona Manurung-12S25007
import java.util.*;
import java.lang.Math;

public class Soal5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, gaji, tanggungan;
        double ipk;
        String nama;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            ipk = Double.parseDouble(input.nextLine());
            gaji = Integer.parseInt(input.nextLine());
            tanggungan = Integer.parseInt(input.nextLine());
            if (ipk >= 3.0 && gaji <= 3000000) {
                System.out.println(nama + " -> Lolos Syarat Awal");
            } else {
                System.out.println(nama + " -> Tidak Lolos");
            }
        }
        System.out.println("Jumlah lolos " + " Total ");
    }
}

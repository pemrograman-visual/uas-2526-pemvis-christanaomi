//Christa Naomi Silalahi-12S25041
//Tongam Prozona Manurung-12S25007
import java.util.*;
import java.lang.Math;

public class soal2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, stokAwal, terjual, sisa;
        String nama, status;

        n = Integer.parseInt(input.nextLine());
        System.out.println("Nama:  StokAwal:  Terjual:  Sisa:   Status: ");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            stokAwal = Integer.parseInt(input.nextLine());
            terjual = Integer.parseInt(input.nextLine());
            sisa = stokAwal - terjual;
            status = cekStatus(sisa);
            System.out.println(nama + "  :  " + stokAwal + "   :    " + terjual + " :    " + sisa + "  :   " + status);
        }
    }
    
    public static String cekStatus(int sisastok) {
        String pesan;

        if (sisastok == 0) {
            pesan = "Habis, segera restock!";
        } else {
            if (sisastok < 5) {
                pesan = "Stok menipis";
            } else {
                pesan = "Stok aman";
            }
        }
        
        return pesan;
    }
}

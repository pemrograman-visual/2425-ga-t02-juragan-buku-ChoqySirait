// 12S24006 - Margareth Bungaran Sitompul   
// 12S24012 - Choqy Pananda Sirait
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penerbit, triple, ket, ket1, ket2;
        int tahun, stok;
        double hargaP, minimumM, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penerbit = input.nextLine();
        tahun = Integer.parseInt(input.nextLine());
        triple = input.nextLine();
        ket = input.nextLine();
        hargaP = Double.parseDouble(input.nextLine());
        minimumM = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7 || rating <= 5.0) {
            ket1 = "Best pick";
        } else {
            if (rating >= 4.5 || rating < 4.7) {
                ket1 = "Must read";
            } else {
                if (rating >= 4.0 || rating < 4.5) {
                    ket1 = "Recomended";
                } else {
                    if (rating >= 3.0 || rating < 4.0) {
                        ket1 = "Average";
                    } else {
                        if (rating < 3.0 || rating >= 0.0) {
                            ket1 = "low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penerbit + "|" + tahun + "|" + triple + "|" + ket + "|" + hargaP + "|" + minimumM + "|" + stok + "|" + rating + "|" + ket1);
    }
}

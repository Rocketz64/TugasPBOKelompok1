/*
Nama File: ItemBarang.java
Anggota:
- Hadrian Shandhy Yudha 		(24060124140207)
- Muhammad Alfaiq Rido Salafy	(24060124140148)
- Mohammad Najib Fitrianto      (24060124140203)
- Ridho Tri Saputra  	        (24060124130122)
*/

package Logistik;

public class ItemBarang {
    private String namaBarang;
    private double berat;
    private int jumlah;

    public ItemBarang(String namaBarang, double berat, int jumlah) {
        this.namaBarang = namaBarang;
        this.berat = berat;
        this.jumlah = jumlah;
    }

    public double getTotalBerat() {
        return berat * jumlah;
    }
}

/*
Nama File: Pesanan.java
Anggota:
- Hadrian Shandhy Yudha 		(24060124140207)
- Muhammad Alfaiq Rido Salafy	(24060124140148)
- Mohammad Najib Fitrianto      (24060124140203)
- Ridho Tri Saputra  	        (24060124130122)
*/

package Logistik;

import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private ArrayList<ItemBarang> daftarBarang = new ArrayList<>();

    public Pesanan(){
    }

    public Pesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public void tambahBarang(ItemBarang barang) {
        daftarBarang.add(barang);
    }

    public double hitungTotalBerat() {
        double total = 0;
        for (ItemBarang b : daftarBarang) {
            total += b.getTotalBerat();
        }
        return total;
    }

    public void cekKapasitas(Kendaraan kendaraan) throws Exception {
        if (hitungTotalBerat() > kendaraan.getKapasitas()) {
            throw new Exception("Muatan melebihi kapasitas kendaraan!");
        }
    }
    
}

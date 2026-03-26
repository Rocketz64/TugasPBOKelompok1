package Logistik;

import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private ArrayList<ItemBarang> daftarBarang = new ArrayList<>();

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

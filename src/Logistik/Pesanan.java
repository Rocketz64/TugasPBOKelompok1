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
    
}

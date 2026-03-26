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

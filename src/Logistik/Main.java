package Logistik;

public class Main {
    public static void main(String[] args) {
        try {
            Manager manager = new Manager("Budi", "M001");
            Sopir sopir = new Sopir("Joko", "S001");

            Truk truk = new Truk("H1234AB", 1000, 50);

            PoolKendaraan pool = new PoolKendaraan();
            pool.tambahKendaraan(truk);

            Pesanan pesanan = manager.buatPesanan("P001");

            pesanan.tambahBarang(new ItemBarang("TV", 10, 5));
            pesanan.tambahBarang(new ItemBarang("Kulkas", 50, 3));

            pesanan.cekKapasitas(truk);

            sopir.mengemudi(truk);

            truk.kirimLokasi();

            System.out.println("Pengiriman berhasil!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
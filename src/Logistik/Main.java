package Logistik;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Budi", "M001");
        PoolKendaraan pool = new PoolKendaraan();

        try {
            System.out.println("Kasus 1: Berhasil!");
            Sopir sopir = new Sopir("Joko", "S001");
            Truk truk = new Truk("H1234AB", 1000, 50);

            pool.tambahKendaraan(truk);

            Pesanan pesanan = manager.buatPesanan("P001");

            pesanan.tambahBarang(new ItemBarang("TV", 10, 5));
            pesanan.tambahBarang(new ItemBarang("Kulkas", 50, 3));

            pesanan.cekKapasitas(truk);

            truk.cekBensin();

            sopir.mengemudi(truk);

            truk.kirimLokasi();

            System.out.println("Pengiriman berhasil!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Kasus 2: Kapasitas Kurang");
            Sopir sopir2 = new Sopir("Kus", "S002");

            Truk truk2 = new Truk("H1235FJ", 200, 50);

            pool.tambahKendaraan(truk2);

            Pesanan pesanan2 = manager.buatPesanan("P002");
            pesanan2.tambahBarang(new ItemBarang("Lemari", 60, 2));
            pesanan2.tambahBarang(new ItemBarang("Sofa", 120, 1));

            pesanan2.cekKapasitas(truk2);

            truk2.cekBensin();

            sopir2.mengemudi(truk2);

            truk2.kirimLokasi();

            System.out.println("Pengiriman berhasil!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Kasus 3: Bensin Kurang!");
            Sopir sopir3 = new Sopir("Koko", "S003");
            Truk truk3 = new Truk("H6262LZ", 1000, 0);

            pool.tambahKendaraan(truk3);

            Pesanan pesanan3 = manager.buatPesanan("P003");
            pesanan3.tambahBarang(new ItemBarang("Meja Makan", 100, 1));
            pesanan3.tambahBarang(new ItemBarang("Kursi", 25, 6));
            pesanan3.tambahBarang(new ItemBarang("Karpet", 10, 1));

            pesanan3.cekKapasitas(truk3);

            truk3.cekBensin(); 

            sopir3.mengemudi(truk3);

            truk3.kirimLokasi();

        } catch (AssertionError e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
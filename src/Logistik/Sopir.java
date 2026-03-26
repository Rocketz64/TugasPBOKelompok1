package Logistik;

public class Sopir extends Manusia{

    public Sopir(String nama, String id) {
        super(nama, id);
    }

    public void mengemudi(Kendaraan kendaraan) {
        System.out.println(nama + " mengemudi " + kendaraan.getNoPolisi());
    }
}

package Logistik;

public class Manager extends Manusia{

    public Manager(String nama, String id) {
        super(nama, id);
    }

    public Pesanan buatPesanan(String idPesanan) {
        return new Pesanan(idPesanan);
    }
    
}

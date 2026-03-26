package Logistik;

public class Truk extends Kendaraan implements PelacakanGPS{

    public Truk(String noPolisi, double kapasitas, double bensin) {
        super(noPolisi, kapasitas, bensin);
    }
    
    @Override
    public void kirimLokasi() {
        System.out.println("Mengirim lokasi GPS dari truk " + noPolisi);
    }
}

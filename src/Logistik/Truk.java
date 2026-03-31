/*
Nama File: Truk.java
Anggota:
- Hadrian Shandhy Yudha 		(24060124140207)
- Muhammad Alfaiq Rido Salafy	(24060124140148)
- Mohammad Najib Fitrianto      (24060124140203)
- Ridho Tri Saputra  	        (24060124130122)
*/

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

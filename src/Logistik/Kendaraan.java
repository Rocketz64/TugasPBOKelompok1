/*
Nama File: Kendaraan.java
Anggota:
- Hadrian Shandhy Yudha 		(24060124140207)
- Muhammad Alfaiq Rido Salafy	(24060124140148)
- Mohammad Najib Fitrianto      (24060124140203)
- Ridho Tri Saputra  	        (24060124130122)
*/

package Logistik;

public abstract class Kendaraan implements PelacakanGPS{
    protected String noPolisi;
    protected double kapasitas;
    protected double bensin;
    protected static int kendaraanCounter = 0;

    public Kendaraan() {
        kendaraanCounter++;
    }

    public Kendaraan(String nomorPolisi, double kapasitas, double bensin) {
        this.noPolisi = nomorPolisi;
        this.kapasitas = kapasitas;
        this.bensin = bensin;
        kendaraanCounter++;
    }

    public String getNoPolisi(){
        return this.noPolisi;
    }

    public double getKapasitas(){
        return this.kapasitas;
    }

    public double getBensin(){
        return this.bensin;
    }

    public void setNoPolisi(String noPolisi){
        this.noPolisi = noPolisi;
    }

    public void setKapasitas(double kapasitas){
        this.kapasitas = kapasitas;
    }

    public void setBensin(double bensin){
        this.bensin = bensin;
    }

    public void cekBensin() {
        assert bensin > 0 : "Bensin habis!";
    }

    public void printInfo(){
        System.out.println("No. Polisi: " + noPolisi);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Bensin: " + bensin);
    }

    @Override
    public void kirimLokasi() {
        System.out.println("Mengirim lokasi GPS dari truk " + noPolisi);
    }
}

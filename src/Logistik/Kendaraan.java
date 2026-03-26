package Logistik;

public abstract class Kendaraan {
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
}

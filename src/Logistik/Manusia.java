package Logistik;

public abstract class Manusia {
    protected String nama;
    protected String id;
    protected static int manusiaCounter = 0;

    public Manusia() {
        manusiaCounter++;
    }

    public Manusia(String nama, String id) {
        this.nama = nama;
        this.id = id;
        manusiaCounter++;
    }

    public String getNama() {
        return this.nama;
    }

    public String getID() {
        return this.id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setID(String id) {
        this.id = id;
    }
}

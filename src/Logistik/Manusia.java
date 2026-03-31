/*
Nama File: Manusia.java
Anggota:
- Hadrian Shandhy Yudha 		(24060124140207)
- Muhammad Alfaiq Rido Salafy	(24060124140148)
- Mohammad Najib Fitrianto      (24060124140203)
- Ridho Tri Saputra  	        (24060124130122)
*/

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

    public void printInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
    }
}

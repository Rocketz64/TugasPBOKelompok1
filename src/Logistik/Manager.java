/*
Nama File: Manager.java
Anggota:
- Hadrian Shandhy Yudha 		(24060124140207)
- Muhammad Alfaiq Rido Salafy	(24060124140148)
- Mohammad Najib Fitrianto      (24060124140203)
- Ridho Tri Saputra  	        (24060124130122)
*/

package Logistik;

public class Manager extends Manusia{

    public Manager(String nama, String id) {
        super(nama, id);
    }

    public Pesanan buatPesanan(String idPesanan) {
        return new Pesanan(idPesanan);
    }
    
}

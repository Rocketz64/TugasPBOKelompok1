/*
Nama File: PoolKendaraan.java
Anggota:
- Hadrian Shandhy Yudha 		(24060124140207)
- Muhammad Alfaiq Rido Salafy	(24060124140148)
- Mohammad Najib Fitrianto      (24060124140203)
- Ridho Tri Saputra  	        (24060124130122)
*/

package Logistik;

import java.util.ArrayList;

public class PoolKendaraan {
    private ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
    }

    public ArrayList<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }
}

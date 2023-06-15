/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadrofinugraha_2110010241;

/**
 *
 * @author ACER
 */
public class tbl_biaya  {
    private int id_biaya;
    private int id_pengajuan_int;
    private Double biaya_sklh;
    private Double biaya_rumah_tangga;
    private Double biaya_angsuran;

    public tbl_biaya() {}

    public void setIdBiaya(int id_biaya) {
        this.id_biaya = id_biaya;
    }

    public int getIdBiaya() {
        return id_biaya;
    }

    public void setIdPengajuanInt(int id_pengajuan_int) {
        this.id_pengajuan_int = id_pengajuan_int;
    }

    public int getIdPengajuanInt() {
        return id_pengajuan_int;
    }

    public void setBiayaSklh(Double biaya_sklh) {
        this.biaya_sklh = biaya_sklh;
    }

    public Double getBiayaSklh() {
        return biaya_sklh;
    }

    public void setBiayaRumahTangga(Double biaya_rumah_tangga) {
        this.biaya_rumah_tangga = biaya_rumah_tangga;
    }

    public Double getBiayaRumahTangga() {
        return biaya_rumah_tangga;
    }

    public void setBiayaAngsuran(Double biaya_angsuran) {
        this.biaya_angsuran = biaya_angsuran;
    }

    public Double getBiayaAngsuran() {
        return biaya_angsuran;
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas tbl_biaya
        tbl_biaya biaya = new tbl_biaya();

        // Mengatur nilai atribut
        biaya.setIdBiaya(1);
        biaya.setIdPengajuanInt(1001);
        biaya.setBiayaSklh(1500000.0);
        biaya.setBiayaRumahTangga(2000000.0);
        biaya.setBiayaAngsuran(500000.0);

        // Mendapatkan nilai atribut dan mencetaknya
        System.out.println("ID Biaya: " + biaya.getIdBiaya());
        System.out.println("ID Pengajuan Int: " + biaya.getIdPengajuanInt());
        System.out.println("Biaya Sekolah: " + biaya.getBiayaSklh());
        System.out.println("Biaya Rumah Tangga: " + biaya.getBiayaRumahTangga());
        System.out.println("Biaya Angsuran: " + biaya.getBiayaAngsuran());
    }
}
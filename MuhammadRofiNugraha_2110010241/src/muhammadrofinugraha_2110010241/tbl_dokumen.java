/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadrofinugraha_2110010241;

/**
 *
 * @author ACER
 */
public class tbl_dokumen {
    private int id_dokumen;
    private int id_pengajuan;
    private String kk;
    private String npwp;
    private String akte;

    public tbl_dokumen() {}

    public void setIdDokumen(int id_dokumen) {
        this.id_dokumen = id_dokumen;
    }

    public int getIdDokumen() {
        return id_dokumen;
    }

    public void setIdPengajuan(int id_pengajuan) {
        this.id_pengajuan = id_pengajuan;
    }

    public int getIdPengajuan() {
        return id_pengajuan;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }

    public String getKk() {
        return kk;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setAkte(String akte) {
        this.akte = akte;
    }

    public String getAkte() {
        return akte;
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas tbl_dokumen
        tbl_dokumen dokumen = new tbl_dokumen();

        // Mengatur nilai atribut
        dokumen.setIdDokumen(1);
        dokumen.setIdPengajuan(1001);
        dokumen.setKk("1234567890");
        dokumen.setNpwp("9876543210");
        dokumen.setAkte("ABC123XYZ");

        // Mendapatkan nilai atribut dan mencetaknya
        System.out.println("ID Dokumen: " + dokumen.getIdDokumen());
        System.out.println("ID Pengajuan: " + dokumen.getIdPengajuan());
        System.out.println("KK: " + dokumen.getKk());
        System.out.println("NPWP: " + dokumen.getNpwp());
        System.out.println("Akte: " + dokumen.getAkte());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadrofinugraha_2110010241;

/**
 *
 * @author ACER
 */
public class tbl_pendapatan {
    private int id_pendapatan;
    private int id_pengajuan;
    private Double pendapatan_ttp;
    private Double pendapatan_tdk_ttp;

    public tbl_pendapatan() {}

    public void setIdPendapatan(int id_pendapatan) {
        this.id_pendapatan = id_pendapatan;
    }

    public int getIdPendapatan() {
        return id_pendapatan;
    }

    public void setIdPengajuan(int id_pengajuan) {
        this.id_pengajuan = id_pengajuan;
    }

    public int getIdPengajuan() {
        return id_pengajuan;
    }

    public void setPendapatanTtp(Double pendapatan_ttp) {
        this.pendapatan_ttp = pendapatan_ttp;
    }

    public Double getPendapatanTtp() {
        return pendapatan_ttp;
    }

    public void setPendapatanTdkTtp(Double pendapatan_tdk_ttp) {
        this.pendapatan_tdk_ttp = pendapatan_tdk_ttp;
    }

    public Double getPendapatanTdkTtp() {
        return pendapatan_tdk_ttp;
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas tbl_pendapatan
        tbl_pendapatan pendapatan = new tbl_pendapatan();

        // Mengatur nilai atribut
        pendapatan.setIdPendapatan(1);
        pendapatan.setIdPengajuan(1001);
        pendapatan.setPendapatanTtp(5000000.0);
        pendapatan.setPendapatanTdkTtp(2000000.0);

        // Mendapatkan nilai atribut dan mencetaknya
        System.out.println("ID Pendapatan: " + pendapatan.getIdPendapatan());
        System.out.println("ID Pengajuan: " + pendapatan.getIdPengajuan());
        System.out.println("Pendapatan TTP: " + pendapatan.getPendapatanTtp());
        System.out.println("Pendapatan Tidak TTP: " + pendapatan.getPendapatanTdkTtp());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadrofinugraha_2110010241;

/**
 *
 * @author ACER
 */
import java.util.Date;
public class tbl_pengajuan {

    private int id_pengajuan;
    private String no_ktp;
    private Date tgl_pengajuan;
    private Integer dokumen;
    private Double jumlah_pengajuan;
    private Double angsuran_perbulan;
    private Integer lama_kredit;
    private Integer jumlah_ank;
    private Integer jumlah_ank_sklh;
    private Integer pernah_kredit;

    public tbl_pengajuan() {}

    public void setIdPengajuan(int id_pengajuan) {
        this.id_pengajuan = id_pengajuan;
    }

    public int getIdPengajuan() {
        return id_pengajuan;
    }

    public void setNoKtp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getNoKtp() {
        return no_ktp;
    }

    public void setTglPengajuan(Date tgl_pengajuan) {
        this.tgl_pengajuan = tgl_pengajuan;
    }

    public Date getTglPengajuan() {
        return tgl_pengajuan;
    }

    public void setDokumen(Integer dokumen) {
        this.dokumen = dokumen;
    }

    public Integer getDokumen() {
        return dokumen;
    }

    public void setJumlahPengajuan(Double jumlah_pengajuan) {
        this.jumlah_pengajuan = jumlah_pengajuan;
    }

    public Double getJumlahPengajuan() {
        return jumlah_pengajuan;
    }

    public void setAngsuranPerbulan(Double angsuran_perbulan) {
        this.angsuran_perbulan = angsuran_perbulan;
    }

    public Double getAngsuranPerbulan() {
        return angsuran_perbulan;
    }

    public void setLamaKredit(Integer lama_kredit) {
        this.lama_kredit = lama_kredit;
    }

    public Integer getLamaKredit() {
        return lama_kredit;
    }

    public void setJumlahAnk(Integer jumlah_ank) {
        this.jumlah_ank = jumlah_ank;
    }

    public Integer getJumlahAnk() {
        return jumlah_ank;
    }

    public void setJumlahAnkSklh(Integer jumlah_ank_sklh) {
        this.jumlah_ank_sklh = jumlah_ank_sklh;
    }

    public Integer getJumlahAnkSklh() {
        return jumlah_ank_sklh;
    }

    public void setPernahKredit(Integer pernah_kredit) {
        this.pernah_kredit = pernah_kredit;
    }

    public Integer getPernahKredit() {
        return pernah_kredit;
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas tbl_pengajuan
        tbl_pengajuan pengajuan = new tbl_pengajuan();

        // Mengatur nilai atribut
        pengajuan.setIdPengajuan(1);
        pengajuan.setNoKtp("1234567890");
        pengajuan.setTglPengajuan(new Date());
        pengajuan.setDokumen(3);
        pengajuan.setJumlahPengajuan(10000000.0);
        pengajuan.setAngsuranPerbulan(1500000.0);
        pengajuan.setLamaKredit(12);
        pengajuan.setJumlahAnk(2);
        pengajuan.setJumlahAnkSklh(1);
        pengajuan.setPernahKredit(1);

        // Mendapatkan nilai atribut dan mencetaknya
        System.out.println("ID Pengajuan: " + pengajuan.getIdPengajuan());
        System.out.println("Nomor KTP: " + pengajuan.getNoKtp());
        System.out.println("Tanggal Pengajuan: " + pengajuan.getTglPengajuan());
        System.out.println("Dokumen: " + pengajuan.getDokumen());
        System.out.println("Jumlah Pengajuan: " + pengajuan.getJumlahPengajuan());
        System.out.println("Angsuran per Bulan: " + pengajuan.getAngsuranPerbulan());
        System.out.println("Lama Kredit: " + pengajuan.getLamaKredit());
        System.out.println("Jumlah Anak: " + pengajuan.getJumlahAnk());
        System.out.println("Jumlah Anak Sekolah: " + pengajuan.getJumlahAnkSklh());
        System.out.println("Pernah Kredit: " + pengajuan.getPernahKredit());
    }
}
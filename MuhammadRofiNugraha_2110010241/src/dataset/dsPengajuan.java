/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.Date;

public class dsPengajuan {
 private ArrayList<Integer> id_pengajuan;
    private ArrayList<String> no_ktp;
    private ArrayList<String> tgl_pengajuan;
    private ArrayList<String> dokumen;
    private ArrayList<Double> jumlah_pengajuan;
    private ArrayList<Double> angsuran_perbulan;
    private ArrayList<Integer> lama_kredit;
    private ArrayList<Integer> jumlah_ank;
    private ArrayList<Integer> jumlah_ank_sklh;
    private ArrayList<Integer> pernah_kredit;

    public dsPengajuan() {
        id_pengajuan = new ArrayList<Integer>();
        no_ktp = new ArrayList<String>();
        tgl_pengajuan = new ArrayList<String>();
        dokumen = new ArrayList<String>();
        jumlah_pengajuan = new ArrayList<Double>();
        angsuran_perbulan = new ArrayList<Double>();
        lama_kredit = new ArrayList<Integer>();
        jumlah_ank = new ArrayList<Integer>();
        jumlah_ank_sklh = new ArrayList<Integer>();
        pernah_kredit = new ArrayList<Integer>();
        // Kode inisialisasi lainnya...
    }

    // Tambahkan getter dan setter untuk variabel ArrayList
    public ArrayList<Integer> getRecordIdPengajuan() {
        return this.id_pengajuan;
    }

    public void insertIdPengajuan(int value) {
        this.id_pengajuan.add(value);
    }

    public ArrayList<String> getRecordNoKtp() {
        return this.no_ktp;
    }

    public void insertNoKtp(String value) {
        this.no_ktp.add(value);
    }

    public ArrayList<String> getRecordTglPengajuan() {
        return this.tgl_pengajuan;
    }

    public void insertTglPengajuan(String value) {
        this.tgl_pengajuan.add(value);
    }

    public ArrayList<String> getRecordDokumen() {
        return this.dokumen;
    }

    public void insertDokumen(String value) {
        this.dokumen.add(value);
    }

    public ArrayList<Double> getRecordJumlahPengajuan() {
        return this.jumlah_pengajuan;
    }

    public void insertJumlahPengajuan(Double value) {
        this.jumlah_pengajuan.add(value);
    }

    public ArrayList<Double> getRecordAngsuranPerbulan() {
        return this.angsuran_perbulan;
    }

    public void insertAngsuranPerbulan(Double value) {
        this.angsuran_perbulan.add(value);
    }

    public ArrayList<Integer> getRecordLamaKredit() {
        return this.lama_kredit;
    }

    public void insertLamaKredit(int value) {
        this.lama_kredit.add(value);
    }

    public ArrayList<Integer> getRecordJumlahAnak() {
        return this.jumlah_ank;
    }

    public void insertJumlahAnak(int value) {
        this.jumlah_ank.add(value);
    }

    public ArrayList<Integer> getRecordJumlahAnakSekolah() {
        return this.jumlah_ank_sklh;
    }

    public void insertJumlahAnakSekolah(int value) {
        this.jumlah_ank_sklh.add(value);
    }

    public ArrayList<Integer> getRecordPernahKredit() {
        return this.pernah_kredit;
    }

    public void insertPernahKredit(int value) {
        this.pernah_kredit.add(value);
    }
    public void insertPengajuan(int id_pengajuan, String no_ktp, String tgl_pengajuan, String dokumen, double jumlah_pengajuan,
            double angsuran_perbulan, int lama_kredit, int jumlah_ank, int jumlah_ank_sklh, int pernah_kredit) {
        this.id_pengajuan.add(id_pengajuan);
        this.no_ktp.add(no_ktp);
        this.tgl_pengajuan.add(tgl_pengajuan);
        this.dokumen.add(dokumen);
        this.jumlah_pengajuan.add(jumlah_pengajuan);
        this.angsuran_perbulan.add(angsuran_perbulan);
        this.lama_kredit.add(lama_kredit);
        this.jumlah_ank.add(jumlah_ank);
        this.jumlah_ank_sklh.add(jumlah_ank_sklh);
        this.pernah_kredit.add(pernah_kredit);
    }
}
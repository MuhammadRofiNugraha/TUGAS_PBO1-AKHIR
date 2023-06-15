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

public class dsPendapatan {
 private ArrayList<Integer> id_pendapatan;
    private ArrayList<Integer> id_pengajuan;
    private ArrayList<Double> pendapatan_ttp;
    private ArrayList<Double> pendapatan_tdk_ttp;

    public dsPendapatan() {
        id_pendapatan = new ArrayList<Integer>();
        id_pengajuan = new ArrayList<Integer>();
        pendapatan_ttp = new ArrayList<Double>();
        pendapatan_tdk_ttp = new ArrayList<Double>();
        // Kode inisialisasi lainnya...
    }

    // Tambahkan getter dan setter untuk variabel ArrayList
    public ArrayList<Integer> getRecordIdPendapatan() {
        return this.id_pendapatan;
    }

    public void insertIdPendapatan(int value) {
        this.id_pendapatan.add(value);
    }

    public ArrayList<Integer> getRecordIdPengajuan() {
        return this.id_pengajuan;
    }

    public void insertIdPengajuan(int value) {
        this.id_pengajuan.add(value);
    }

    public ArrayList<Double> getRecordPendapatanTTP() {
        return this.pendapatan_ttp;
    }

    public void insertPendapatanTTP(Double value) {
        this.pendapatan_ttp.add(value);
    }

    public ArrayList<Double> getRecordPendapatanTidakTTP() {
        return this.pendapatan_tdk_ttp;
    }

    public void insertPendapatanTidakTTP(Double value) {
        this.pendapatan_tdk_ttp.add(value);
    }
    public void insertPendapatan(int id_pendapatan, int id_pengajuan, double pendapatan_ttp, double pendapatan_tdk_ttp) {
        this.id_pendapatan.add(id_pendapatan);
        this.id_pengajuan.add(id_pengajuan);
        this.pendapatan_ttp.add(pendapatan_ttp);
        this.pendapatan_tdk_ttp.add(pendapatan_tdk_ttp);
    }

}
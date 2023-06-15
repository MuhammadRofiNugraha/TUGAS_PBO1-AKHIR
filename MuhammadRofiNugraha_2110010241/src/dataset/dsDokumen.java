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

public class dsDokumen {
    private ArrayList<Integer> id_dokumen;
    private ArrayList<Integer> id_pengajuan;
    private ArrayList<String> kk;
    private ArrayList<String> npwp;
    private ArrayList<String> akte;

    public dsDokumen() {
        id_dokumen = new ArrayList<Integer>();
        id_pengajuan = new ArrayList<Integer>();
        kk = new ArrayList<String>();
        npwp = new ArrayList<String>();
        akte = new ArrayList<String>();
        // Other initialization code...
    }

    // Add getters and setters for the ArrayList variables
    public ArrayList<Integer> getRecordIdDokumen() {
        return this.id_dokumen;
    }

    public void insertIdDokumen(int value) {
        this.id_dokumen.add(value);
    }

    public ArrayList<Integer> getRecordIdPengajuan() {
        return id_pengajuan;
    }

    public void insertIdPengajuan(int value) {
        id_pengajuan.add(value);
    }

    public ArrayList<String> getRecordKK() {
        return kk;
    }

    public void insertKK(String value) {
        kk.add(value);
    }

    public ArrayList<String> getRecordNPWP() {
        return npwp;
    }

    public void insertNPWP(String value) {
        npwp.add(value);
    }

    public ArrayList<String> getRecordAkte() {
        return akte;
    }

    public void insertAkte(String value) {
        akte.add(value);
    }
    public void insertDokumen(int id_dokumen, int id_pengajuan, String kk, String npwp, String akte) {
    this.id_dokumen.add(id_dokumen);
    this.id_pengajuan.add(id_pengajuan);
    this.kk.add(kk);
    this.npwp.add(npwp);
    this.akte.add(akte);
    }
}
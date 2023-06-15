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


public class dsDebitur {
private ArrayList<String> no_ktp;
    private ArrayList<String> username_debitur;
    private ArrayList<String> password_debitur;
    private ArrayList<String> nm_debitur;
    private ArrayList<String> almt_debitur;
    private ArrayList<String> telp_debitur;
    private ArrayList<String> tmpt_lahir;
    private ArrayList<String> tgl_lahir;
    private ArrayList<Integer> usia;

    public dsDebitur() {
        no_ktp = new ArrayList<String>();
        username_debitur = new ArrayList<String>();
        password_debitur = new ArrayList<String>();
        nm_debitur = new ArrayList<String>();
        almt_debitur = new ArrayList<String>();
        telp_debitur = new ArrayList<String>();
        tmpt_lahir = new ArrayList<String>();
        tgl_lahir = new ArrayList<String>();
        usia = new ArrayList<Integer>();
        // Other initialization code...
    }

    // Add getters and setters for the ArrayList variables
    public ArrayList<String> getRecordNoKtp() {
        return this.no_ktp;
    }

    public void insertNoKtp(String value) {
        this.no_ktp.add(value);
    }

    public ArrayList<String> getRecordUsernameDebitur() {
        return this.username_debitur;
    }

    public void insertUsernameDebitur(String value) {
        this.username_debitur.add(value);
    }

    public ArrayList<String> getRecordPasswordDebitur() {
        return this.password_debitur;
    }

    public void insertPasswordDebitur(String value) {
        this.password_debitur.add(value);
    }

    public ArrayList<String> getRecordNamaDebitur() {
        return this.nm_debitur;
    }

    public void insertNamaDebitur(String value) {
        this.nm_debitur.add(value);
    }

    public ArrayList<String> getRecordAlamatDebitur() {
        return this.almt_debitur;
    }

    public void insertAlamatDebitur(String value) {
        this.almt_debitur.add(value);
    }

    public ArrayList<String> getRecordTeleponDebitur() {
        return this.telp_debitur;
    }

    public void insertTeleponDebitur(String value) {
        this.telp_debitur.add(value);
    }

    public ArrayList<String> getRecordTempatLahir() {
        return this.tmpt_lahir;
    }

    public void insertTempatLahir(String value) {
        this.tmpt_lahir.add(value);
    }

    public ArrayList<String> getRecordTanggalLahir() {
        return this.tgl_lahir;
    }

    public void insertTanggalLahir(String value) {
        this.tgl_lahir.add(value);
    }

    public ArrayList<Integer> getRecordUsia() {
        return this.usia;
    }

    public void insertUsia(Integer value) {
        this.usia.add(value);
    }

     public void insertDebitur(String no_ktp, String username_debitur, String password_debitur, String nm_debitur, String almt_debitur,
                          String telp_debitur, String tmpt_lahir, String tgl_lahir, int usia, int tbl_userid_user) {
    this.no_ktp.add(no_ktp);
    this.username_debitur.add(username_debitur);
    this.password_debitur.add(password_debitur);
    this.nm_debitur.add(nm_debitur);
    this.almt_debitur.add(almt_debitur);
    this.telp_debitur.add(telp_debitur);
    this.tmpt_lahir.add(tmpt_lahir);
    this.tgl_lahir.add(tgl_lahir);
    this.usia.add(usia);
     }

}
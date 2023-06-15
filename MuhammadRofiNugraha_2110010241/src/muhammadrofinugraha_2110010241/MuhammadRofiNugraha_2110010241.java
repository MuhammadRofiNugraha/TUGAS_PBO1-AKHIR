/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadrofinugraha_2110010241;
import dataset.*;
/**
 *
 * @author ACER
 */
import java.util.Scanner;
import java.util.Date;
import dataset.dsBiaya;
import dataset.dsDebitur;
import dataset.dsDokumen;
import dataset.dsPendapatan;
import dataset.dsPengajuan;
import dataset.dsUser;
import forms.*; 

public class MuhammadRofiNugraha_2110010241 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* String nama, npm;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input Nama Lengkap Anda : ");
        nama = input.nextLine();
        System.out.print("Input NPM Anda : ");
        npm = input.nextLine();
        
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);

        */
        /*
        dsBiaya biaya = new dsBiaya();
        dsDebitur debitur = new dsDebitur();
        dsDokumen dokumen = new dsDokumen();
        dsPendapatan pendapatan = new dsPendapatan();
        dsPengajuan pengajuan = new dsPengajuan();
        dsUser user = new dsUser();

        biaya.insertIdBiaya(001);
        biaya.insertIdPengajuanInt(50000);
        biaya.insertBiayaSekolah(600000);
        biaya.insertBiayaRumahTangga(3000000);
        biaya.insertBiayaAngsuran(700000);

        debitur.setNoKtp("123456789");
        debitur.setUsernameDebitur("john_doe");
        debitur.setPasswordDebitur("password");
        debitur.setNamaDebitur("John Doe");
        debitur.setAlamatDebitur("Jl. ABC No. 123");
        debitur.setTeleponDebitur("081234567890");
        debitur.setTempatLahir("Jakarta");
        debitur.setTanggalLahir(new Date());
        debitur.setUsia(30);
        debitur.setTblUserIdUser(1001);

        dokumen.setIdDokumen(1);
        dokumen.setIdPengajuan(1);
        dokumen.setKK("KK123456");
        dokumen.setNPWP("NPWP123456");
        dokumen.setAkte("Akte123456");

        pendapatan.setIdPendapatan(1);
        pendapatan.setIdPengajuan(1);
        pendapatan.setPendapatanTTP(5000000.0);
        pendapatan.setPendapatanTidakTTP(3000000.0);

        pengajuan.setIdPengajuan(1);
        pengajuan.setNoKtp("123456789");
        pengajuan.setTglPengajuan(new Date());
        pengajuan.setDokumen(1);
        pengajuan.setJumlahPengajuan(1000000.0);
        pengajuan.setAngsuranPerbulan(1000000.0);
        pengajuan.setLamaKredit(12);
        pengajuan.setJumlahAnak(2);
        pengajuan.setJumlahAnakSekolah(1);
        pengajuan.setPernahKredit(1);

        user.setIdUser(1001);
        user.setUsernameUser("johndoe");
        user.setPasswordUser("password");
        user.setNamaUser("John Doe");

        System.out.println(biaya.getRecordIdBiaya());
        System.out.println(biaya.getRecordBiayaAngsuran());
        System.out.println(debitur.getNoKtp());
        System.out.println(debitur.getNamaDebitur());
        System.out.println(dokumen.getKK());
        System.out.println(dokumen.getNPWP());
        System.out.println(pendapatan.getPendapatanTTP());
        System.out.println(pendapatan.getPendapatanTidakTTP());
        System.out.println(pengajuan.getJumlahPengajuan());
        System.out.println(pengajuan.getTglPengajuan());
        System.out.println(user.getIdUser());
        System.out.println(user.getUsernameUser());
        System.out.println(user.getNamaUser());*/
        
        new frameUtama().setVisible(true);
    }
}
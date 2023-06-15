/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * author ACER
 */
public class dsBiaya {
    private ArrayList<Integer> id_biaya;
    private ArrayList<Integer> id_pengajuan_int;
    private ArrayList<Double> biaya_sklh;
    private ArrayList<Double> biaya_rumah_tangga;
    private ArrayList<Double> biaya_angsuran;
    
    public dsBiaya(){
        id_biaya = new ArrayList<Integer>();
        id_pengajuan_int = new ArrayList<Integer>();
        biaya_sklh = new ArrayList<Double>();
        biaya_rumah_tangga = new ArrayList<Double>();
        biaya_angsuran = new ArrayList<Double>();
        // Other initialization code...
    }
    
    public void insertIdBiaya(int isi){
        this.id_biaya.add(isi);
    }
    
    public void insertIdPengajuanInt(int isi){
        this.id_pengajuan_int.add(isi);
    }
    
    public void insertBiayaSekolah(double biaya){
        this.biaya_sklh.add(biaya);
    }
    
    public void insertBiayaRumahTangga(double biaya){
        this.biaya_rumah_tangga.add(biaya);
    }
    
    public void insertBiayaAngsuran(double biaya){
        this.biaya_angsuran.add(biaya);
    }
    
    public ArrayList<Integer> getRecordIdBiaya(){
        return this.id_biaya;
    }
    
    public ArrayList<Integer> getRecordIdPengajuanInt(){
        return this.id_pengajuan_int;
    }
    
    public ArrayList<Double> getRecordBiayaSekolah(){
        return this.biaya_sklh;
    }
    
    public ArrayList<Double> getRecordBiayaRumahTangga(){
        return this.biaya_rumah_tangga;
    }
    
    public ArrayList<Double> getRecordBiayaAngsuran(){
        return this.biaya_angsuran;
    }
    
    public void insertBiaya(int id_biaya, int id_pengajuan, double biaya_sklh, double biaya_rumah_tangga, 
            double biaya_angsuran){
        this.id_biaya.add(id_biaya);
        this.id_pengajuan_int.add(id_pengajuan);
        this.biaya_sklh.add(biaya_sklh);
        this.biaya_rumah_tangga.add(biaya_rumah_tangga);
        this.biaya_angsuran.add(biaya_angsuran);
    }
    
}

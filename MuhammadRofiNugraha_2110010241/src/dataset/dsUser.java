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

public class dsUser {
    private ArrayList<Integer> id_user;
    private ArrayList<String> username_user;
    private ArrayList<String> password_user;
    private ArrayList<String> nm_user;

    public dsUser() {
        id_user = new ArrayList<Integer>();
        username_user = new ArrayList<String>();
        password_user = new ArrayList<String>();
        nm_user = new ArrayList<String>();
        // Kode inisialisasi lainnya...
    }

    // Tambahkan getter dan setter untuk variabel ArrayList
    public ArrayList<Integer> getRecordIdUser() {
        return this.id_user;
    }

    public void insertIdUser(int value) {
        this.id_user.add(value);
    }

    public ArrayList<String> getRecordUsernameUser() {
        return this.username_user;
    }

    public void insertUsernameUser(String value) {
        this.username_user.add(value);
    }

    public ArrayList<String> getRecordPasswordUser() {
        return this.password_user;
    }

    public void insertPasswordUser(String value) {
        this.password_user.add(value);
    }

    public ArrayList<String> getRecordNamaUser() {
        return this.nm_user;
    }

    public void insertNamaUser(String value) {
        this.nm_user.add(value);
    }
}
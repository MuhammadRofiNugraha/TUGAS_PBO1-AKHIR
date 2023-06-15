/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadrofinugraha_2110010241;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class tbl_user {

    private int id_user;
    private String username_user;
    private String password_user;
    private String nm_user;

    public tbl_user() {}

    public void setIdUser(int id_user) {
        this.id_user = id_user;
    }

    public int getIdUser() {
        return id_user;
    }

    public void setUsernameUser(String username_user) {
        this.username_user = username_user;
    }

    public String getUsernameUser() {
        return username_user;
    }

    public void setPasswordUser(String password_user) {
        this.password_user = password_user;
    }

    public String getPasswordUser() {
        return password_user;
    }

    public void setNmUser(String nm_user) {
        this.nm_user = nm_user;
    }

    public String getNmUser() {
        return nm_user;
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas tbl_user
        tbl_user user = new tbl_user();

        // Mengatur nilai atribut
        user.setIdUser(1);
        user.setUsernameUser("admin");
        user.setPasswordUser("password123");
        user.setNmUser("Muhammad Rofi Nugraha");

        // Menggunakan Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan username dan password
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Memeriksa kecocokan username dan password
        if (username.equals(user.getUsernameUser()) && password.equals(user.getPasswordUser())) {
            System.out.println("Login berhasil!");
            System.out.println("Selamat datang, " + user.getNmUser() + "!");
        } else {
            System.out.println("Username atau password salah. Login gagal!");
        }

        scanner.close();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Rima Regiani
 */
public class Connect {

    private static java.sql.Connection koneksi;
    public static Statement st;
    public static ResultSet rs;

    public static java.sql.Connection getKoneksi() {
        if (koneksi == null) {
            try {
                System.out.println("Membuat koneksi...");
                Class.forName("com.mysql.cj.jdbc.Driver");
                koneksi = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/elektronik",
                        "root",
                        "");
                st = koneksi.createStatement();
                JOptionPane.showMessageDialog(null, "Terkoneksi");
                System.out.println("Koneksi berhasil.");
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Tidak Terkoneksi");
                System.out.println("Koneksi berhasil.");
            }
        }
        return koneksi;
    }
    public static void main(String[] args) {
        Connect.getKoneksi();
    }
}

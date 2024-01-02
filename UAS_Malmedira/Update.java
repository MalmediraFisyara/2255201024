/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_Malmedira;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SST Sang Surya
 */
public class Update {
     Koneksi konek = new Koneksi();

    public void update(String nama, String email, String nik, String tipe, String jumlahtiket) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            String sql_email = "update datakonser set email ='" + email + "'where nama= '" + nama + "'";
            String sql_nik = "update datakonser set nik ='" + nik + "'where nama= '" + nama + "'";
            String sql_jumlahtiket = "update datakonser set jumlahtiket ='" + jumlahtiket + "'where nama= '" + nama + "'";
            String sql_tipe = "update datakonser set tipe ='" + tipe + "'where nama= '" + nama + "'";
            statement.executeUpdate(sql_email);
            statement.executeUpdate(sql_nik);
            statement.executeUpdate(sql_tipe);
            statement.executeUpdate(sql_jumlahtiket);
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

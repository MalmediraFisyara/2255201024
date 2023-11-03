/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6_TugasEnkapsulasi;

/**
 *
 * @author SST Sang Surya
 */
public class Registrasi {
  
    private String NKK;
    private String NIK;
    
    public void SetNomorKartuKeluarga (String NKK){
        this.NKK = NKK;
    }
    public void SetNomorIndukKeluarga(String NIK){
        this.NIK = NIK;
    }
    public String GetNomorKartuKeluarga(){
        return this.NKK;
    }
    public String GetNomorIndukKeluarga(){
        return this.NIK;
    }
}

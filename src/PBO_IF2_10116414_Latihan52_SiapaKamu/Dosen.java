/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan52_SiapaKamu;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan Siapa kamu
 */
public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Nama Saya "+nama+" umur "+umur+" tahun sedang mengajar mata kuliah "+mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}

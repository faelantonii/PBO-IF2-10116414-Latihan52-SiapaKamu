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
public class PBO_IF2_10116414_SiapaKamu {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setNip("41227829930");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        System.out.println("NIP DOSEN "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
   
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Fael Antoni");
        mhs.setKelas("PBO2");
        mhs.setNim("10116414");
        mhs.setUmur(22);
        
        System.out.println("\nNIM MAHASISWA "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}

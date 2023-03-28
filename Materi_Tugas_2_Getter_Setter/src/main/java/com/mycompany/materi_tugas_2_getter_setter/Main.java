/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materi_tugas_2_getter_setter;

/**
 *
 * @author Bintang Satria Mulya
 */
public class Main {
    public static void main(String[] args) {
        Getter_Setter user=new Getter_Setter();
        
        user.setNama("Raiden Shogun");
        user.setKelas(11);
        user.setUmur(16);
        user.setTtl(03);
        user.setAlamat("Sumeru City");
        
        
        System.out.println("---BIO DATA SISWA---");
        System.out.println("Nama Siswa : "+user.getNama());
        System.out.println("Kelas : "+user.getKelas()+" Jurusan Memasak");
        System.out.println("Umur Siswa : "+user.getUmur()+" Tahun");
        System.out.println("Tanggal Lahir : "+user.getTtl()+" Desember");
        System.out.println("Alamat Rumah : "+user.getAlamat());
    }
 
}

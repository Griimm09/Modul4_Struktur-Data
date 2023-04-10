package Materi1Modul4;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Griimm", "4B", "Struktur Data", 2021103403));
        mhs.put("2", new Mahasiswa("Bonbon", "4I", "Basis Data", 2021103605));
        mhs.put("3", new Mahasiswa("Krelin", "4G", "Sistem Operasi", 2021103713));

        System.out.print("Masukan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : "+ data.nama +", Kelas : "+ data.kelas +", Mata kuliah praktikum : "+data.matkulPraktikum+", nim : "+data.nim);
        }
    }
}

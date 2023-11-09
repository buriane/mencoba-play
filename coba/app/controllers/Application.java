package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void test() {
        render();
    }

    public static void proses(int x, int y) {
        int hasil = x + y;
        render(hasil);
    }

    public static void newMahasiswa() {
        render();
    }

    public static void buatBaru(Mahasiswa objmhs) {
        objmhs.nama = objmhs.nama+" ganteng sekali";
        render(objmhs);
    }

    public static void tampilkan() {
        List daftar = Mahasiswa.findAll();
        render(daftar);
    }

    public static void baru(){
        render();
    }

    public static void simpan(Mahasiswa mahasiswaku){
        mahasiswaku.save();
        tampilkan();
    }

    public static void edit(Long id){
        Mahasiswa z = Mahasiswa.find("id", id).first();
        render(z);
    }
}
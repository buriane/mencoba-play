package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Mahasiswa extends Model {
    public String nama;
    public String nim;
    public String alamat;
    public Date tanggalLahir;
    public String kodepos;
    @ManyToOne
    public JenisKelamin kelamin;

    public String toString() {
        return nama;
    }
}

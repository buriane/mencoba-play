package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.GolDar;
import models.Kabupaten;
import play.db.jpa.Model;

@Entity
public class Orang extends Model {
    public String nama;
    public String alamat;
    public int umur;

    @ManyToOne
    public Kabupaten kabupaten;
    @ManyToOne
    public GolDar golonganDarah;

    public String toString() {
        return nama;
    }
}
package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Kabupaten extends Model {
    public String namaKabupaten;

    public String toString() {
        return this.namaKabupaten;
    }
}

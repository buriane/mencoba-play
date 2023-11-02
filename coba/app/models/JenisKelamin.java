package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class JenisKelamin extends Model {
    public String namakelamin;

    public String toString() {
        return this.namakelamin;
    }
}

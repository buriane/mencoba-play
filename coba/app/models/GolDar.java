package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class GolDar extends Model {
    public String golongan;

    public String toString() {
        return this.golongan;
    }
}

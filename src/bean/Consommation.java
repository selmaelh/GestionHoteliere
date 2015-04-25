/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;

/**
 *
 * @author EL
 */
public class Consommation {
    
    private Integer Id;
    private String Libelle;
    private Date Date;

    
    public Consommation(){}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Consommation{" + "Id=" + Id + ", Libelle=" + Libelle + ", Date=" + Date + '}';
    }
    
    

}

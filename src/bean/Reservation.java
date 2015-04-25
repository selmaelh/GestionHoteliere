/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author EL
 */
public class Reservation {
    
  private Integer Id;
  private Date Date_debut;
  private Date Date_fin;
  private Integer Nbre_nuits;
  private List<Consommation> consommations;
  
  public Reservation(){}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Date getDate_debut() {
        return Date_debut;
    }

    public void setDate_debut(Date Date_debut) {
        this.Date_debut = Date_debut;
    }

    public Date getDate_fin() {
        return Date_fin;
    }

    public void setDate_fin(Date Date_fin) {
        this.Date_fin = Date_fin;
    }

    public Integer getNbre_nuits() {
        return Nbre_nuits;
    }

    public void setNbre_nuits(Integer Nbre_nuits) {
        this.Nbre_nuits = Nbre_nuits;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }

    @Override
    public String toString() {
        return "Reservation{" + "Id=" + Id + ", Date_debut=" + Date_debut + ", Date_fin=" + Date_fin + ", Nbre_nuits=" + Nbre_nuits + ", consommations=" + consommations + '}';
    }
  
  

}

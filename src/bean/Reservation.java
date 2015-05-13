/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author EL
 */

@Entity
public class Reservation implements Serializable{
  
  @Id
  @GeneratedValue
  private Integer id;
  private Date date_debut;
  private Date date_fin;
  private Integer nbre_nuits;
  
  @OneToMany
  private List<Consommation> consommations;
  
  public Reservation(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Integer getNbre_nuits() {
        return nbre_nuits;
    }

    public void setNbre_nuits(Integer nbre_nuits) {
        this.nbre_nuits = nbre_nuits;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", nbre_nuits=" + nbre_nuits + ", consommations=" + consommations + '}';
    }

  

}

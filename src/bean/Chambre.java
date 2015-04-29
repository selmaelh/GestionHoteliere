/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author EL
 */
public class Chambre {
    
    private Integer id;
    private String catégorie;
    private String tél;
    private Integer tarif;
    
    public Chambre(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }

    public String getTél() {
        return tél;
    }

    public void setTél(String tél) {
        this.tél = tél;
    }

    public Integer getTarif() {
        return tarif;
    }

    public void setTarif(Integer tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "Chambre{" + "id=" + id + ", cat\u00e9gorie=" + catégorie + ", t\u00e9l=" + tél + ", tarif=" + tarif + '}';
    }

   
}

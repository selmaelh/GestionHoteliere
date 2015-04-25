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
    
    private Integer Id;
    private String Catégorie;
    private String Tél;
    private Integer Tarif;
    
    public Chambre(){}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCatégorie() {
        return Catégorie;
    }

    public void setCatégorie(String Catégorie) {
        this.Catégorie = Catégorie;
    }

    public String getTél() {
        return Tél;
    }

    public void setTél(String Tél) {
        this.Tél = Tél;
    }

    public Integer getTarif() {
        return Tarif;
    }

    public void setTarif(Integer Tarif) {
        this.Tarif = Tarif;
    }

    @Override
    public String toString() {
        return "Chambre{" + "Id=" + Id + ", Cat\u00e9gorie=" + Catégorie + ", T\u00e9l=" + Tél + ", Tarif=" + Tarif + '}';
    }
    
    
}

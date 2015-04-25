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
public class Facture {
    
    private Integer Id;
    private float Total;
    
    public Facture(){}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Facture{" + "Id=" + Id + ", Total=" + Total + '}';
    }
    
    
    

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author EL
 */

@Entity
public class Facture implements Serializable{
    
    @Id
    @GeneratedValue
    private Integer id;
    private float total;
    
    public Facture(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Facture{" + "id=" + id + ", total=" + total + '}';
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import bean.Chambre;
import dao.ChambreDao;
import java.util.List;

/**
 *
 * @author EL
 */
public class ChambreService extends ChambreDao{
    
    
    public List<Chambre> getAllChambers(){
       
        String hqlQuery ="from Chambre cbr where 1=1";
        return load(hqlQuery);
    }
    
    
}

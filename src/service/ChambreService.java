/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Chambre;
import dao.AbstractDao;

/**
 *
 * @author EL
 */
public class ChambreService extends AbstractDao<Chambre>{
    
    public ChambreService() {
        super(Chambre.class);
    }
}

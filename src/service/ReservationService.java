/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Reservation;
import dao.AbstractDao;

/**
 *
 * @author EL
 */
public class ReservationService extends AbstractDao<Reservation>{
 
    
     public ReservationService() {
        super(Reservation.class);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import bean.Client;
import dao.ClientDao;
import java.util.List;

/**
 *
 * @author EL
 */
public class ClientService extends ClientDao {

    
    public List<Client> getAllClients(){
       
        String hqlQuery ="from Client cl where 1=1";
        return load(hqlQuery);
    }
     
    
}

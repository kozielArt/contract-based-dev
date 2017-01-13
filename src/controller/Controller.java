/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entitites.Reservation;
import java.sql.SQLException;
import mappers.Mapper;

/**
 *
 * @author arturkonzile
 */
public class Controller {
    
    public Controller (){
        
    }
    
public Reservation makeReservation(int numbOfPeople, boolean oneWay, String date) throws SQLException, ClassNotFoundException{
    Mapper m = new Mapper();
    Reservation r = m.makeReservation(numbOfPeople, oneWay, date);
    return r;
}
    
}

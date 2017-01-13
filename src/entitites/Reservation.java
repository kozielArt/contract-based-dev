/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author arturkonzile
 */
@Entity
@Table(name = "Reservations")
public class Reservation {
    private int numbOfPeople;
    private boolean oneWay;
    private String date;
    @Id
    private Long id;
    
    public Reservation(){
       
    }
    
    public Reservation(int numbOfPeople, boolean oneWay, String date){
        this.numbOfPeople = numbOfPeople;
        this.oneWay = oneWay;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
            
}

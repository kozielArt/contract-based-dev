/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import entitites.Reservation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author arturkonzile
 */
public class Mapper {
    List<String> reservations = new ArrayList();
    public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    public static final String MYSQL_URL = "jdbc:mysql://138.68.86.0:3306/javaTestDB?user=root&password=russiandick";
    private Connection connection;
    
    
    public Mapper() {
        
    }
    
    public Reservation makeReservation(int numbOfPeople, boolean oneWay, String date) throws ClassNotFoundException, SQLException{
        Class.forName(MYSQL_DRIVER);
        connection = DriverManager.getConnection(MYSQL_URL);
        Reservation r = new Reservation(numbOfPeople, oneWay, date);
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("SebastianPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try { 
            em.persist(r);
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            System.exit(0);
        } finally {
            em.getTransaction().commit();
            em.close();
        }
        return r;
    }
         
}

    


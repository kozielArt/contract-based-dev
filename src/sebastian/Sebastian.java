package sebastian;

import controller.Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arturkonzile
 */
public class Sebastian {


 static void main(String[] args) {
     Controller c = new Controller();
     try {
         c.makeReservation(9, false, "2017.01.15");
     } catch (SQLException ex) {
         Logger.getLogger(Sebastian.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Sebastian.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
}

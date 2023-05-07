
package ondemandmotors;

/**
 * @author Prajwal Gautam, Sanjay Malla, Parichit K.C
 */
public class OnDemandMotors {


    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenuForm().setVisible(true);
            }
        });
    }
    
}


package ondemandmotors;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 */
public class mainMenuForm extends javax.swing.JFrame {

    public mainMenuForm() {
        initComponents();
    }
    
    //Variables
    String location = "";
    String path = "";


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showroomLocation = new javax.swing.ButtonGroup();
        ktmRadioButton = new javax.swing.JRadioButton();
        pkrRadioButton = new javax.swing.JRadioButton();
        itrRadioButton = new javax.swing.JRadioButton();
        ngtRadioButton = new javax.swing.JRadioButton();
        loadShowroomButton = new javax.swing.JButton();
        heading1 = new javax.swing.JLabel();
        heading2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        seperator = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        document = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showroomLocation.add(ktmRadioButton);
        ktmRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ktmRadioButton.setText("Kathmandu");
        ktmRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ktmRadioButtonActionPerformed(evt);
            }
        });

        showroomLocation.add(pkrRadioButton);
        pkrRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pkrRadioButton.setText("Pokhara");
        pkrRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkrRadioButtonActionPerformed(evt);
            }
        });

        showroomLocation.add(itrRadioButton);
        itrRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        itrRadioButton.setText("Ithari");
        itrRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itrRadioButtonActionPerformed(evt);
            }
        });

        showroomLocation.add(ngtRadioButton);
        ngtRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ngtRadioButton.setText("Chitwan");
        ngtRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngtRadioButtonActionPerformed(evt);
            }
        });

        loadShowroomButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loadShowroomButton.setText("Load Showroom");
        loadShowroomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadShowroomButtonActionPerformed(evt);
            }
        });

        heading1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        heading1.setText("Welcome to On Demand Motors Vehicle finder");

        heading2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        heading2.setText("Select a showroom location");

        fileMenu.setText("File");

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        fileMenu.add(home);
        fileMenu.add(seperator);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        fileMenu.add(exit);

        menuBar.add(fileMenu);

        helpMenu.setText("Help");

        document.setText("Documentation");
        document.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentActionPerformed(evt);
            }
        });
        helpMenu.add(document);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(heading1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(ktmRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(pkrRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(itrRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(ngtRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heading2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(loadShowroomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heading2)
                .addGap(28, 28, 28)
                .addComponent(ktmRadioButton)
                .addGap(18, 18, 18)
                .addComponent(pkrRadioButton)
                .addGap(18, 18, 18)
                .addComponent(itrRadioButton)
                .addGap(18, 18, 18)
                .addComponent(ngtRadioButton)
                .addGap(27, 27, 27)
                .addComponent(loadShowroomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadShowroomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadShowroomButtonActionPerformed
        // TODO add your handling code here:
        if(!(location.equals("") && path.equals(""))){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new isApplication(location, path).setVisible(true);
                }
            });
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select a showroom location", "Alert",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_loadShowroomButtonActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        location = "";
        path = "";
        showroomLocation.clearSelection();
    }//GEN-LAST:event_homeActionPerformed

    private void documentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentActionPerformed

        //open the pdf file located in data/help.pdf
        try{
            File file = new File("data\\help.pdf");
            //Open the file if it exists
            if(file.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(this, "Not supported");
                }
            } else{
                JOptionPane.showMessageDialog(this, "File does not exist");
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_documentActionPerformed

    private void ngtRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngtRadioButtonActionPerformed
        // TODO add your handling code here:
        location = "Chitwan";
        path = "data\\chitwan.csv";
    }//GEN-LAST:event_ngtRadioButtonActionPerformed

    private void itrRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itrRadioButtonActionPerformed
        // TODO add your handling code here:
        location = "Ithari";
        path = "data\\ithari.csv";
    }//GEN-LAST:event_itrRadioButtonActionPerformed

    private void pkrRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkrRadioButtonActionPerformed
        // TODO add your handling code here:
        location = "Pokhara";
        path = "data\\pokhara.csv";
    }//GEN-LAST:event_pkrRadioButtonActionPerformed

    private void ktmRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ktmRadioButtonActionPerformed
        // TODO add your handling code here:
        location = "Kathmandu";
        path = "data\\kathmandu.csv";
    }//GEN-LAST:event_ktmRadioButtonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem document;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel heading1;
    private javax.swing.JLabel heading2;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem home;
    private javax.swing.JRadioButton itrRadioButton;
    private javax.swing.JRadioButton ktmRadioButton;
    private javax.swing.JButton loadShowroomButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButton ngtRadioButton;
    private javax.swing.JRadioButton pkrRadioButton;
    private javax.swing.JPopupMenu.Separator seperator;
    private javax.swing.ButtonGroup showroomLocation;
    // End of variables declaration//GEN-END:variables
}

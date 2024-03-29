/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ManageFlights extends javax.swing.JFrame {

    /**
     * Creates new form ManageFlights
     */
    public ManageFlights() {
        initComponents();
        DisplayFlight();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Flcodetb = new javax.swing.JTextField();
        Numofseatstb = new javax.swing.JTextField();
        Destcombobox = new javax.swing.JComboBox<>();
        Sourcecombobox = new javax.swing.JComboBox<>();
        TakeoffdateChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Flightstable = new javax.swing.JTable();
        Editbutton = new javax.swing.JButton();
        Savebutton = new javax.swing.JButton();
        Backbutton = new javax.swing.JButton();
        Deletebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 10));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Java Project\\logooo.jpg")); // NOI18N
        jLabel2.setText("Aaha Airlines");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Manage Flights");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Destination");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Flight Code");

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Number Of Seats");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Source");

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Take Off Date");

        Flcodetb.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Flcodetb.setForeground(new java.awt.Color(0, 0, 153));

        Numofseatstb.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Numofseatstb.setForeground(new java.awt.Color(0, 0, 153));

        Destcombobox.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Destcombobox.setForeground(new java.awt.Color(0, 0, 153));
        Destcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chennai", "Delhi", "Bengaluru", "Madurai", "Mysore", "Trichy", "Hyderabad", "Pune", "Goa" }));

        Sourcecombobox.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Sourcecombobox.setForeground(new java.awt.Color(0, 0, 153));
        Sourcecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chennai", "Delhi", "Bengaluru", "Madurai", "Mysore", "Trichy", "Hyderabad", "Pune", "Goa" }));
        Sourcecombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourcecomboboxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Flights List");

        Flightstable.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        Flightstable.setForeground(new java.awt.Color(0, 0, 153));
        Flightstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FlCode", "Source", "Destination", "TakeOffDate", "No.OfSeats"
            }
        ));
        Flightstable.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(Flightstable);

        Editbutton.setBackground(new java.awt.Color(0, 0, 153));
        Editbutton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Editbutton.setForeground(new java.awt.Color(255, 255, 255));
        Editbutton.setText("Edit");
        Editbutton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 255)));

        Savebutton.setBackground(new java.awt.Color(0, 0, 153));
        Savebutton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Savebutton.setForeground(new java.awt.Color(255, 255, 255));
        Savebutton.setText("Save");
        Savebutton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 255)));
        Savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebuttonActionPerformed(evt);
            }
        });

        Backbutton.setBackground(new java.awt.Color(0, 0, 153));
        Backbutton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Backbutton.setForeground(new java.awt.Color(255, 255, 255));
        Backbutton.setText("Back");
        Backbutton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 255)));
        Backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbuttonMouseClicked(evt);
            }
        });
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });

        Deletebutton.setBackground(new java.awt.Color(0, 0, 153));
        Deletebutton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Deletebutton.setForeground(new java.awt.Color(255, 255, 255));
        Deletebutton.setText("Delete");
        Deletebutton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 255)));
        Deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Flcodetb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(Sourcecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(226, 226, 226))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Destcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(TakeoffdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Numofseatstb, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(629, 629, 629)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(Savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(Editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(554, 554, 554)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118)
                        .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(515, 515, 515)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Destcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sourcecombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Flcodetb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TakeoffdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numofseatstb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletebuttonActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackbuttonActionPerformed

    private void BackbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbuttonMouseClicked
        new MainPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackbuttonMouseClicked

    private void SourcecomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourcecomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SourcecomboboxActionPerformed
Connection con=null;
Statement st=null,st1=null;
ResultSet rs=null,rs1=null;
private void  DisplayFlight()
{try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airline?zeroDateTimeBehavior=CONVERT_TO_NULL","root","root");
    st=con.createStatement();
    rs=st.executeQuery("select * from flighttbl");
    DefaultTableModel tm=new DefaultTableModel();
    tm.setColumnIdentifiers(new Object[]{"FlCode","Source","Destination","TakeOffDate","No.OfSeats"});
    while(rs.next())
    {
        tm.addRow(new Object[]{
        rs.getString("Flcode"),
            rs.getString("FlSource"),
            rs.getString("FlDest"),
            rs.getString("FlDate"),
            rs.getString("FlSeats"),
            });
    }
    Flightstable.setModel(tm);
    
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e);
}
    
}
private void clear(){
    Flcodetb.setText("");
     Numofseatstb.setText("");            
}
    private void SavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebuttonActionPerformed
        // TODO add your handling code here:
        if(Flcodetb.getText().isEmpty()|| Numofseatstb.getText().isEmpty()|| Sourcecombobox.getSelectedIndex()==-1||Destcombobox.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else
        {
          try{
              
              Class.forName("com.mysql.cj.jdbc.Driver");
              con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airline?zeroDateTimeBehavior=CONVERT_TO_NULL","root","root");
             PreparedStatement Add=null;
             Add = con.prepareStatement("insert into flighttbl (FlCode,FlSource,FlDest,FlDate,FlSeats)values(?,?,?,?,?)");
              Add.setString(1,Flcodetb.getText());
              Add.setString(2,Sourcecombobox.getSelectedItem().toString());
              Add.setString(3,Destcombobox.getSelectedItem().toString());
              Add.setString(4,TakeoffdateChooser.getDate().toString());
              Add.setInt(5,Integer.valueOf(Numofseatstb.getText()));
              int row=Add.executeUpdate();
              JOptionPane.showMessageDialog(this,"Flight Added");
              con.close();
              DisplayFlight();
              clear();
          }  
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
        }
    }//GEN-LAST:event_SavebuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbutton;
    private javax.swing.JButton Deletebutton;
    private javax.swing.JComboBox<String> Destcombobox;
    private javax.swing.JButton Editbutton;
    private javax.swing.JTextField Flcodetb;
    private javax.swing.JTable Flightstable;
    private javax.swing.JTextField Numofseatstb;
    private javax.swing.JButton Savebutton;
    private javax.swing.JComboBox<String> Sourcecombobox;
    private com.toedter.calendar.JDateChooser TakeoffdateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

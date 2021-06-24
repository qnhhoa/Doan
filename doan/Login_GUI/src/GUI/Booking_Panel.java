/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.*;
import DTO.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Huy
 */
public class Booking_Panel extends javax.swing.JFrame {

    /**
     * Creates new form Booking_Panel
     */
    Booking_BUS booking_bus = new Booking_BUS();
    Employee_BUS em_bus = new Employee_BUS();
    Customer_BUS cus_bus = new Customer_BUS();
    Room_BUS room_bus = new Room_BUS();
    public Booking_Panel() {
        initComponents();
        setLocationRelativeTo(null);
        RoomID_TextField.setText(MainFrame.ID_TextField.getText());
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
        DOBirth_Chooser = new com.toedter.calendar.JDateChooser();
        RoomID_TextField = new javax.swing.JTextField();
        Name_KH_TextField = new javax.swing.JTextField();
        CCCD_KH_TextField = new javax.swing.JTextField();
        Phone_KH_TextField = new javax.swing.JTextField();
        btnBook = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("BOOKING INFO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 248));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DOBirth_Chooser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DOBirth_Chooser.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jPanel1.add(DOBirth_Chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 400, 40));

        RoomID_TextField.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        RoomID_TextField.setText("Room ID");
        RoomID_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RoomID_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RoomID_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RoomID_TextFieldFocusLost(evt);
            }
        });
        jPanel1.add(RoomID_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 400, 40));

        Name_KH_TextField.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        Name_KH_TextField.setText("Full Name");
        Name_KH_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Name_KH_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Name_KH_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Name_KH_TextFieldFocusLost(evt);
            }
        });
        jPanel1.add(Name_KH_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 400, 40));

        CCCD_KH_TextField.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        CCCD_KH_TextField.setText("CCCD");
        CCCD_KH_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CCCD_KH_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CCCD_KH_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CCCD_KH_TextFieldFocusLost(evt);
            }
        });
        jPanel1.add(CCCD_KH_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 400, 40));

        Phone_KH_TextField.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        Phone_KH_TextField.setText("Phone Number");
        Phone_KH_TextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Phone_KH_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Phone_KH_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Phone_KH_TextFieldFocusLost(evt);
            }
        });
        jPanel1.add(Phone_KH_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 400, 40));

        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLP_pic/btnBook1.png"))); // NOI18N
        btnBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookMouseExited(evt);
            }
        });
        jPanel1.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 120, 50));

        jLabel1.setFont(new java.awt.Font("UTM Avo", 1, 24)); // NOI18N
        jLabel1.setText("BOOKING INFO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLKH_pic/Phone_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 540, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLP_pic/ID_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 540, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLKH_pic/Name_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLKH_pic/CCCD_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 540, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLKH_pic/DateOfBirth_Bgr.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 540, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseClicked
       
      boolean CheckInsertCus = cus_bus.Insert(new Customer_DTO("",Name_KH_TextField.getText(),CCCD_KH_TextField.getText(),Phone_KH_TextField.getText(),DOBirth_Chooser.getDate()));
       
       // get clientid to insert clientid into booking
       List<Customer_DTO> list_cus = new ArrayList<>();
       list_cus=cus_bus.Select("select * from Client where CCCD = '"+CCCD_KH_TextField.getText()+"'");
       Object[] row = new Object[1];
       System.out.println(list_cus.size());
       list_cus.forEach((Customer_DTO cus) -> {
            row[0]=cus.getCustomer_id();
            System.out.println(row[0]);
        });      
       
       boolean CheckInsertBK = booking_bus.Insert(new Booking_DTO("",row[0].toString(),RoomID_TextField.getText(),null,null));
       
     // get bookingid to insert bookingid into room  
       List<Booking_DTO> list_Booking=booking_bus.Select("select * from Booking where ClientID = '"+row[0].toString()+"'");
       String bookingId = "";
       System.out.println(list_Booking.size());
       
       for (Booking_DTO bk : list_Booking){
           bookingId=bk.getBookId();
           System.out.println(bookingId);
       }   
       
       // insert bookingid into room and reset txt
       
       if (CheckInsertBK==true && CheckInsertCus==true){
           room_bus.Update(new Room_DTO(RoomID_TextField.getText(),null,"Booked",null,bookingId));
           Name_KH_TextField.setText(null);
           CCCD_KH_TextField.setText(null);
           Phone_KH_TextField.setText(null);
           DOBirth_Chooser.setDate(null);
       };
       
    }//GEN-LAST:event_btnBookMouseClicked

    private void btnBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseEntered
        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLP_pic/btnBook2.png")));
    }//GEN-LAST:event_btnBookMouseEntered

    private void btnBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseExited
        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/pic/QLP_pic/btnBook1.png")));
    }//GEN-LAST:event_btnBookMouseExited

    private void RoomID_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RoomID_TextFieldFocusGained
        if(RoomID_TextField.getText().equals("Room ID")){
            RoomID_TextField.setText("");
        }
    }//GEN-LAST:event_RoomID_TextFieldFocusGained

    private void RoomID_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RoomID_TextFieldFocusLost
        if(RoomID_TextField.getText().isEmpty()) {
            RoomID_TextField.setText("Room ID");
        }
    }//GEN-LAST:event_RoomID_TextFieldFocusLost

    private void Name_KH_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Name_KH_TextFieldFocusGained
        if(Name_KH_TextField.getText().equals("Full Name")){
            Name_KH_TextField.setText("");
        }
    }//GEN-LAST:event_Name_KH_TextFieldFocusGained

    private void Name_KH_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Name_KH_TextFieldFocusLost
        if(Name_KH_TextField.getText().isEmpty()) {
            Name_KH_TextField.setText("Full Name");
        }
    }//GEN-LAST:event_Name_KH_TextFieldFocusLost

    private void CCCD_KH_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CCCD_KH_TextFieldFocusGained
        if(CCCD_KH_TextField.getText().equals("CCCD")){
            CCCD_KH_TextField.setText("");
        }
    }//GEN-LAST:event_CCCD_KH_TextFieldFocusGained

    private void CCCD_KH_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CCCD_KH_TextFieldFocusLost
        if(CCCD_KH_TextField.getText().isEmpty()) {
            CCCD_KH_TextField.setText("CCCD");
        }
    }//GEN-LAST:event_CCCD_KH_TextFieldFocusLost

    private void Phone_KH_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Phone_KH_TextFieldFocusGained
        if(Phone_KH_TextField.getText().equals("Phone Number")){
            Phone_KH_TextField.setText("");
        }
    }//GEN-LAST:event_Phone_KH_TextFieldFocusGained

    private void Phone_KH_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Phone_KH_TextFieldFocusLost
        if(Phone_KH_TextField.getText().isEmpty()) {
            Phone_KH_TextField.setText("Phone Number");
        }
    }//GEN-LAST:event_Phone_KH_TextFieldFocusLost

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
            java.util.logging.Logger.getLogger(Booking_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCD_KH_TextField;
    private com.toedter.calendar.JDateChooser DOBirth_Chooser;
    private javax.swing.JTextField Name_KH_TextField;
    private javax.swing.JTextField Phone_KH_TextField;
    private javax.swing.JTextField RoomID_TextField;
    private javax.swing.JLabel btnBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

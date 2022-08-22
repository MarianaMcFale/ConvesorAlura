/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversor;

/**
 *
 * @author marum
 */
public class SelectConversionMoneda extends javax.swing.JFrame {
        String mensaje;
        double valorMoneda;
    /**
     * Creates new form SelectConversion
     */
    public SelectConversionMoneda() {
        initComponents();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 78, 169));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(227, 236, 254));
        jComboBox1.setFont(new java.awt.Font("Source Sans Pro Light", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Pesos Argentinos a Dólares USA", "De Pesos Argentinos a Euros", "De Pesos Argentinos a Libras Esterlinas", "De Pesos Argentinos a Yen Japonés", "De Pesos Argentinos a Won Surcoreano", "De Dólares USA a Pesos Argentinos", "De Euros a Pesos Argentinos", "De Libras Esterlinas a Pesos Argentinos", "De Yen Japonés a Pesos Argentinos", "De Won Surcoreano a Pesos Argentinos" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jComboBox1ComponentRemoved(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 523, 49));

        jButton1.setBackground(new java.awt.Color(204, 255, 212));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("OK");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 271, 213, 49));

        jButton2.setBackground(new java.awt.Color(255, 2, 115));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 271, 213, 49));

        jLabel1.setBackground(new java.awt.Color(0, 115, 193));
        jLabel1.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione el tipo de conversión");
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(207, 26));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 113, 371, -1));

        jLabel2.setFont(new java.awt.Font("Source Sans Pro", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Conversor alura - Monedas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 15, 430, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBox1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ComponentRemoved

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String conversionSeleccionada = (String) jComboBox1.getSelectedItem();

        MensajeFinal mensajeFinal = new MensajeFinal();
        
        InputValorMoneda inputValorMoneda = new InputValorMoneda();
        
        Moneda pesosArg = new Moneda();
		pesosArg.setValorDolarUsa(0.0074);
		pesosArg.setValorEuro(0.0073);
		pesosArg.setValorLibraEsterlina(0.0062);
		pesosArg.setValorYenJapones(1.01);
		pesosArg.setValorWonSurCoreano(9.82);
        
        if(conversionSeleccionada == "De Pesos Argentinos a Dólares USA"){
            
            double total = pesosArg.ConvertirADolarUSA(valorMoneda);
        
            mensaje = "Son "+total+" dólares americanos.";
            mensajeFinal.jLabel1.setText(mensaje);
           
        
        } else if(conversionSeleccionada == "De Pesos Argentinos a Euros"){
            
            double total = pesosArg.ConvertirAEuro(valorMoneda);
        
            mensaje = "Son "+total+" euros.";
            mensajeFinal.jLabel1.setText(mensaje);
           
            
        } else if(conversionSeleccionada == "De Pesos Argentinos a Libras Esterlinas"){
            
            double total = pesosArg.ConvertirALibra(valorMoneda);
        
            mensaje = "Son "+total+" libras esterlinas.";
            mensajeFinal.jLabel1.setText(mensaje);
        
        } else if(conversionSeleccionada == "De Pesos Argentinos a Yen Japonés"){
            
            double total = pesosArg.ConvertirAYen(valorMoneda);
        
            mensaje = "Son "+total+" yenes japoneses.";
            mensajeFinal.jLabel1.setText(mensaje);
            
        } else if(conversionSeleccionada == "De Pesos Argentinos a Won Surcoreano"){
            
            double total = pesosArg.ConvertirAWon(valorMoneda);
        
            mensaje = "Son "+total+" wones surcoreanos.";
            mensajeFinal.jLabel1.setText(mensaje);
        
        } else if(conversionSeleccionada == "De Dólares USA a Pesos Argentinos"){
            
            double total = pesosArg.ConvertirDeDolarUSA(valorMoneda);
        
            mensaje = "Son "+total+" pesos argentinos.";
            mensajeFinal.jLabel1.setText(mensaje);
            
            
        } else if(conversionSeleccionada == "De Euros a Pesos Argentinos"){
            double total = pesosArg.ConvertirDeEuro(valorMoneda);
        
            mensaje = "Son "+total+" pesos argentinos.";
            mensajeFinal.jLabel1.setText(mensaje);
            
            
        } else if(conversionSeleccionada == "De Libras Esterlinas a Pesos Argentinos"){
            
            double total = pesosArg.ConvertirDeLibra(valorMoneda);
        
            mensaje = "Son "+total+" pesos argentinos.";
            mensajeFinal.jLabel1.setText(mensaje);
            
            
            
        } else if(conversionSeleccionada == "De Yen Japonés a Pesos Argentinos"){
            
           double total = pesosArg.ConvertirDeYen(valorMoneda);
        
            mensaje = "Son "+total+" pesos argentinos.";
            mensajeFinal.jLabel1.setText(mensaje);
            
            
            
        } else if(conversionSeleccionada == "De Won Surcoreano a Pesos Argentinos"){
            
            double total = pesosArg.ConvertirDeWon(valorMoneda);
        
            mensaje = "Son "+total+" pesos argentinos.";
            mensajeFinal.jLabel1.setText(mensaje);
            
        }
            
            mensajeFinal.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectConversionMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectConversionMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectConversionMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectConversionMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectConversionMoneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
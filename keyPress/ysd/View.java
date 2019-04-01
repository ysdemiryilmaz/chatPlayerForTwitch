package keyPress.ysd;

import java.awt.Font;

public class View extends javax.swing.JFrame {
        
    private String[][] cmnd = new String[2][2];
    private String tempUserName;
    private String tempCommand;
    
    public View() {
        initComponents();
        cmnd[0][0] =  "Username";
        cmnd[0][1] =  "Command";
        cmnd[1][0] =  "Username";
        cmnd[1][1] =  "Command";
    }
    
    public void showView(){
        View.this.setVisible(true);
    }
    
    public void setUser(String usr, String msg){
                
        cmnd[0][0] =  cmnd[1][0];
        cmnd[0][1] =  cmnd[1][1];
        cmnd[1][0] = usr;
        cmnd[1][1] = msg;
        
        if (msg.equalsIgnoreCase("[") || msg.equalsIgnoreCase("]") ||
                msg.equalsIgnoreCase("\\") || msg.equalsIgnoreCase("^")){                      
            currentCmnd.setFont(new Font("PixArrows", Font.PLAIN, 18));           
        } else {
            currentCmnd.setFont(new Font("Press Start 2P", Font.PLAIN, 18));
        }
        
        if (cmnd[0][1].equalsIgnoreCase("[") || cmnd[0][1].equalsIgnoreCase("]") ||
                cmnd[0][1].equalsIgnoreCase("\\") || cmnd[0][1].equalsIgnoreCase("^")){                      
            previusCmnd.setFont(new Font("PixArrows", Font.PLAIN, 12));           
        } else {
            previusCmnd.setFont(new Font("Press Start 2P", Font.PLAIN, 12));
        }

        previusUsername.setText(cmnd[0][0]);
        previusCmnd.setText(cmnd[0][1]);
        currentUsername.setText(cmnd[1][0]);
        currentCmnd.setText(cmnd[1][1]);

    }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        previusUsername = new javax.swing.JLabel();
        previusCmnd = new javax.swing.JLabel();
        currentUsername = new javax.swing.JLabel();
        currentCmnd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        previusUsername.setFont(new java.awt.Font("Press Start 2P", 0, 11)); // NOI18N
        previusUsername.setForeground(new java.awt.Color(255, 255, 255));
        previusUsername.setText("Username");

        previusCmnd.setFont(new java.awt.Font("PixArrows", 0, 11)); // NOI18N
        previusCmnd.setForeground(new java.awt.Color(255, 255, 255));
        previusCmnd.setText("1");

        currentUsername.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        currentUsername.setForeground(new java.awt.Color(255, 255, 0));
        currentUsername.setText("Username");

        currentCmnd.setFont(new java.awt.Font("PixArrows", 0, 18)); // NOI18N
        currentCmnd.setForeground(new java.awt.Color(0, 153, 0));
        currentCmnd.setText("0");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Current    :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Previous   :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previusUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(previusCmnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentCmnd, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previusUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previusCmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentCmnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(currentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentCmnd;
    private javax.swing.JLabel currentUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel previusCmnd;
    private javax.swing.JLabel previusUsername;
    // End of variables declaration//GEN-END:variables
}

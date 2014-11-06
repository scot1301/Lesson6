public class guessinggame extends javax.swing.JFrame {
    public guessinggame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtguess = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        lblresult = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblattempts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("guessinggame 1.0");

        jLabel1.setText("enter your guess from 1-100");

        txtguess.setColumns(10);

        btnsubmit.setText("submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        lblresult.setBackground(new java.awt.Color(204, 204, 204));
        lblresult.setFont(new java.awt.Font("Trajan Pro 3", 1, 12)); // NOI18N
        lblresult.setForeground(new java.awt.Color(255, 255, 96));
        lblresult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblresult.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Trajan Pro 3", 1, 11)); // NOI18N
        jLabel2.setText("attempts so far");

        lblattempts.setFont(new java.awt.Font("Trajan Pro 3", 1, 14)); // NOI18N
        lblattempts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblattempts.setText("0");
        lblattempts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblresult, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(txtguess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsubmit)))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblattempts)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtguess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsubmit))
                .addGap(18, 18, 18)
                .addComponent(lblresult, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblattempts))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
      int number = Integer.parseInt(txtguess.getText());
      lblresult.setText("you guessed a " + number);
      lblattempts.setText(" " + 1);
    }                                         
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guessinggame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guessinggame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guessinggame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guessinggame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guessinggame().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblattempts;
    private javax.swing.JLabel lblresult;
    private javax.swing.JTextField txtguess;
}

package grocery.system;


public class INTERFACE extends javax.swing.JFrame {

    public INTERFACE() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("SURAMYAS Pvt (Ltd)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 660, 90));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -40, 420, 240));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("LOADING PLEASE WAIT....");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, 110));

        pbar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pbar.setForeground(new java.awt.Color(0, 0, 0));
        pbar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pbar.setStringPainted(true);
        getContentPane().add(pbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 280, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/148782.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 1890, 970));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, -1, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTERFACE().setVisible(true);
            }
        });
        
        INTERFACE infa = new INTERFACE();
        
        infa.setVisible(true);
        
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(50);
                
                infa.pbar.setValue(i);
            }
            //ls.setVisible(false);
            
            LOG_IN log = new LOG_IN();
            
            log.setVisible(true);
            
        }
        catch(InterruptedException e)
        {
            System.out.print(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JProgressBar pbar;
    // End of variables declaration//GEN-END:variables
}

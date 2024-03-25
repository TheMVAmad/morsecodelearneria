



package morsecodelearner;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;





public class MenuUI extends javax.swing.JFrame {


    
    
    
    public MenuUI() {
        super("Main Menu");
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);



        morToChar.addActionListener(e -> openMorseToChar());
        charToMor.addActionListener(e -> openCharToMorse());
        dictionary.addActionListener(e -> openDictionary());


    }
            public void display() {
            setVisible(true);
            }
    
    

    
private void openMorseToChar() {
        morToChar morToChar = new morToChar(); 
               morToChar.setVisible(true); 
   
                this.setVisible(false);
    }

    private void openCharToMorse() {
               MainUI MainUI = new MainUI(); 
               MainUI.setVisible(true); 
   
                this.setVisible(false);
    }

    private void openDictionary() {
        // Implement opening Dictionary
        System.out.println("Dictionary");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuUI().setVisible(true));
    }



    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        charToMor = new javax.swing.JButton();
        morToChar = new javax.swing.JButton();
        dictionary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        charToMor.setText("Character to Morse");

        morToChar.setText("Morse to Character");

        dictionary.setText("Dictionary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(morToChar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(charToMor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(dictionary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(dictionary)
                .addGap(56, 56, 56)
                .addComponent(charToMor)
                .addGap(35, 35, 35)
                .addComponent(morToChar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void menu(String args[]) {
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
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton charToMor;
    private javax.swing.JButton dictionary;
    private javax.swing.JButton morToChar;
    // End of variables declaration//GEN-END:variables


    
}

package morsecodelearner;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;





public class MainUI extends javax.swing.JFrame {


    

    public MainUI() {
        initComponents();
        setUpQuestionLabel();
        displayRandomCharacter();
        displaySkipAmount();
        displayRevAmount();
        displayAnswer();
        backToMenu();
        setTitle("Morse Code Learner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            private char currentChar;
            private int currentSkip;
            private int revAm;
            public void display() {
            setVisible(true);
            }
            
            private void backToMenu(){
               MenuUI MenuUI = new MenuUI(); 
               MenuUI.setVisible(true); 
   
                this.setVisible(false);
            }

            private void displayRandomCharacter() {
            currentChar = MorseCodeConverter.getRandomCharacter();
            question.setText(String.valueOf(currentChar));
                System.out.println(MorseCodeConverter.toMorse(currentChar));

            }
            private void displaySkipAmount() {
            currentSkip = 0;
            skipAmount.setText(String.valueOf(currentSkip));
            }
            private void displayRevAmount() {
            revAm = 0;
            revAmount.setText(String.valueOf(revAm));
            }
            private void displayAnswer() {
                ansReveal.setText("");
            }
            private void setUpQuestionLabel() {
            submitAns.addActionListener((ActionEvent e) -> {

                String userAnswer = answer.getText().trim();
                
                

                String correctAnswer = MorseCodeConverter.toMorse(currentChar);
                

                if(userAnswer.equals(correctAnswer)) {
                    currentSkip = 0;
                    skipAmount.setText(String.valueOf(currentSkip));
                    JOptionPane.showMessageDialog(MainUI.this, "Correct!", "Feedback", JOptionPane.INFORMATION_MESSAGE);
                    displayRandomCharacter();
                    ansReveal.setText("");
                } else if(userAnswer.equals("")){
                }else {
                    currentSkip++;
                    skipAmount.setText(String.valueOf(currentSkip));
                    JOptionPane.showMessageDialog(MainUI.this, "Incorrect. Try again.", "Feedback", JOptionPane.ERROR_MESSAGE);
                }
                answer.setText("");
                
            });
            revAns.addActionListener((ActionEvent e) -> {
                String morseCode = MorseCodeConverter.toMorse(currentChar);
                revAm++;
                revAmount.setText(String.valueOf(revAm));
                ansReveal.setText(morseCode);
            });
            skip.addActionListener((var e) -> {
                currentSkip++;
                skipAmount.setText(String.valueOf(currentSkip));
                ansReveal.setText("");
                displayRandomCharacter();
            });
            backMenu.addActionListener((var e) -> {
               MenuUI MenuUI = new MenuUI(); 
               MenuUI.setVisible(true); 
   
                this.setVisible(false);
            });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextPane();
        revAns = new javax.swing.JButton();
        question = new javax.swing.JLabel();
        submitAns = new javax.swing.JButton();
        skip = new javax.swing.JButton();
        skipAmount = new javax.swing.JLabel();
        revAmount = new javax.swing.JLabel();
        ansReveal = new javax.swing.JLabel();
        backMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(answer);

        revAns.setText("Reveal");

        submitAns.setText("Submit");

        skip.setText("Skip");

        skipAmount.setText(null);

        revAmount.setText(null);

        ansReveal.setText(null);

        backMenu.setText("Main Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(skipAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(revAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitAns, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(revAns, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skip, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ansReveal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(revAns)
                        .addGap(18, 18, 18)
                        .addComponent(skip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ansReveal)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitAns)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(revAmount)
                            .addComponent(skipAmount))
                        .addContainerGap())))
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansReveal;
    private javax.swing.JTextPane answer;
    private javax.swing.JButton backMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel question;
    private javax.swing.JLabel revAmount;
    private javax.swing.JButton revAns;
    private javax.swing.JButton skip;
    private javax.swing.JLabel skipAmount;
    private javax.swing.JButton submitAns;
    // End of variables declaration//GEN-END:variables



}

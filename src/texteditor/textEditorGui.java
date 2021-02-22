package texteditor;


import texteditor.Strategy_Design_Pattern.Strategy_File_Methods;
import texteditor.Strategy_Design_Pattern.SaveAs;
import texteditor.Strategy_Design_Pattern.New;
import texteditor.Strategy_Design_Pattern.Exit;
import texteditor.Strategy_Design_Pattern.Open;
import texteditor.Strategy_Design_Pattern.Save;
import texteditor.Factory_Design_Pattern.Format;
import texteditor.Factory_Design_Pattern.Factory;
import texteditor.Command_Design_Pattern.undoImplement;
import texteditor.Command_Design_Pattern.undoFunction;
import texteditor.Command_Design_Pattern.undoCommand;
import texteditor.Iterator_Design_Pattern.SingleTransposition;



public class textEditorGui extends javax.swing.JFrame {

    
    
    
    public textEditorGui() {
        initComponents();
    }
    
    
    // SingleTranposition işlemi için singleTransposition sınıfından bir nesne olusturuldu.
    final SingleTransposition singleTransposition = new SingleTransposition(this);
    

    // Command tasarim deseniyle undo islemi icin gerekli nesneler olusturuldu. 
    
    final undoFunction undo_function_object = new undoFunction(this);
    
    final undoCommand undo_command_object = new undoCommand(undo_function_object);
    
    final undoImplement undo_implement_object = new undoImplement(undo_command_object);
    
    
 
    
    // Factory design pattern icin uygun nesneler olusturuldu.
   
    final Factory find_replace_factory = new Factory();

    Format format_object1 = find_replace_factory.getFormat("find");
    Format format_object2 = find_replace_factory.getFormat("replace");
    Format format_object3 = find_replace_factory.getFormat("replace all");
    Format format_object4 = find_replace_factory.getFormat("find all");
    
    

    // Strategy design pattern icin uygun nesneler olusturuldu.
    
    Strategy_File_Methods file_methods1 = new Strategy_File_Methods(new Open());
    Strategy_File_Methods file_methods2 = new Strategy_File_Methods(new New());
    Strategy_File_Methods file_methods3 = new Strategy_File_Methods(new Save());
    Strategy_File_Methods file_methods4 = new Strategy_File_Methods(new SaveAs());
    Strategy_File_Methods file_methods5 = new Strategy_File_Methods(new Exit());
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FindTextField = new javax.swing.JTextField();
        ReplaceTextField = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        FindAll = new javax.swing.JButton();
        ReplaceButton = new javax.swing.JButton();
        ReplaceAll = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        SaveAs = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        SingleTransposition = new javax.swing.JMenu();
        Undo = new javax.swing.JMenuItem();
        spellCheck = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        jLabel1.setText("Find :");

        jLabel2.setText("Replace :");

        FindButton.setText("Find");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        FindAll.setText("Find All");
        FindAll.setMaximumSize(new java.awt.Dimension(85, 23));
        FindAll.setPreferredSize(new java.awt.Dimension(85, 23));
        FindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindAllActionPerformed(evt);
            }
        });

        ReplaceButton.setText("Replace");
        ReplaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplaceButtonActionPerformed(evt);
            }
        });

        ReplaceAll.setText("Replace All");
        ReplaceAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplaceAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ReplaceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReplaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ReplaceAll))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FindAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(FindButton)
                        .addComponent(FindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FindAll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ReplaceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReplaceButton)
                    .addComponent(ReplaceAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);

        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        SaveAs.setText("Save As");
        SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(SaveAs);

        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        SingleTransposition.setText("Edit");

        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });
        SingleTransposition.add(Undo);

        spellCheck.setText("Spell Check");
        spellCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spellCheckActionPerformed(evt);
            }
        });
        SingleTransposition.add(spellCheck);

        jMenuBar1.add(SingleTransposition);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // New islemi butona atandı.
    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        file_methods2.execute(this);

    }//GEN-LAST:event_newFileActionPerformed

    // Dosya açma islemi butona atandı.
    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        
        file_methods1.execute(this);
      
    }//GEN-LAST:event_openFileActionPerformed

    // Kaydetme islemi butona atandı.
    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        
        file_methods3.execute(this);
    }//GEN-LAST:event_saveFileActionPerformed

    // Çıkıs islemi butona atandı.
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
         file_methods5.execute(this);

    }//GEN-LAST:event_exitActionPerformed

    // Find islemi butona atandı.
    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
        format_object1.execute(this);
    }//GEN-LAST:event_FindButtonActionPerformed

    // Replace islemi butona atandı.
    private void ReplaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplaceButtonActionPerformed

        format_object2.execute(this);

    }//GEN-LAST:event_ReplaceButtonActionPerformed

    // ReplaceAll islemi butona atandı.
    private void ReplaceAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplaceAllActionPerformed

        format_object3.execute(this);
        
    }//GEN-LAST:event_ReplaceAllActionPerformed

    // Find All islemi butona atandı.
    private void FindAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindAllActionPerformed

        format_object4.execute(this);
    }//GEN-LAST:event_FindAllActionPerformed
    
    // Undo islemi butona atandı.
    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
       undo_implement_object.pop();

    }//GEN-LAST:event_UndoActionPerformed
    // Text Area ' ya veri girisi yapıldığı andan itibaren stack push edilmeye baslandı.
    private void textAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyPressed
        undo_implement_object.push();
    }//GEN-LAST:event_textAreaKeyPressed
    
    // SaveAs islemi butona atandı.
    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsActionPerformed
        
        file_methods4.execute(this);
            

    }//GEN-LAST:event_SaveAsActionPerformed

    //findMistakes islemi butona atandı.
    private void spellCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spellCheckActionPerformed
        // TODO add your handling code here:
        singleTransposition.findMistakes(); 
    }//GEN-LAST:event_spellCheckActionPerformed

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
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindAll;
    private javax.swing.JButton FindButton;
    public javax.swing.JTextField FindTextField;
    private javax.swing.JButton ReplaceAll;
    private javax.swing.JButton ReplaceButton;
    public javax.swing.JTextField ReplaceTextField;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JMenu SingleTransposition;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JMenuItem spellCheck;
    public javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}

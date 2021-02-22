package texteditor.Strategy_Design_Pattern;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import texteditor.textEditorGui;


// Arayuzden implement edildi. 
// Execute metodu gerekli islem sekline gore kodlandi.

public class New implements file_methods_interface{

    
    String filename; // Dosya adini tutan degisken
    String fileAddress; // Dosya adresini tutan degisken
    String textString;
    
    @Override
    public void execute(textEditorGui gui) {
        if(filename == null)
            textString = "";
            
        if (!(textString.equals(gui.textArea.getText()))) {
            int answer = showWarningMessage(gui);
            switch (answer) {
                case JOptionPane.YES_OPTION:
                    if(filename == null){
                        JOptionPane.showInputDialog(gui,"Enter your file name that you want to save.");
                        SaveAs a = new SaveAs();
                        a.execute(gui);  
                    }
                    filename = JOptionPane.showInputDialog("File name:"); // Dosya adi degisiklik sorusu
                    gui.textArea.setText("");
                    gui.setTitle(filename);     
                    
                    SaveAs b = new SaveAs();
                    b.execute(gui);
                    break;   
                case JOptionPane.NO_OPTION:                  
                    filename = JOptionPane.showInputDialog("File name:"); // Dosya adi degisiklik sorusu
                    gui.textArea.setText("");
                    gui.setTitle(filename);         
                    break;
                     
                case JOptionPane.CANCEL_OPTION:;
                    break;
            }
        } 
        else {
            filename = JOptionPane.showInputDialog("File name:"); // Dosya adi degisiklik sorusu
            gui.textArea.setText("");
            gui.setTitle(filename);
        }      
    }
    

    // cikis islemlerinde kullanilacak olan uyari kutusu
    private int showWarningMessage(textEditorGui gui) {
        String[] buttonLabels = new String[] {"Yes", "No", "Cancel"};
        String defaultOption = buttonLabels[0];
        Icon icon = null;
         
        return JOptionPane.showOptionDialog(gui,
                "There's still something unsaved.\n" +
                "Do you want to save before exiting?",
                "Warning",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                icon,
                buttonLabels,
                defaultOption);    
    }

    
    
}

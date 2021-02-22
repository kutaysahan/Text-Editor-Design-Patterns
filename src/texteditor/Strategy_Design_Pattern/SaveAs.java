package texteditor.Strategy_Design_Pattern;


import java.awt.FileDialog;
import java.io.FileWriter;
import java.io.IOException;
import texteditor.textEditorGui;

// Arayuzden implement edildi. 
// Execute metodu gerekli islem sekline gore kodlandi.
public class SaveAs implements file_methods_interface  {

    String filename; // Dosya adini tutan degisken
    String fileAddress; // Dosya adresini tutan degisken
    String textString;
    
    @Override
    public void execute(textEditorGui gui) {
        // Kaydetme islemi icin FileDialog yapisi kullanildi.
        FileDialog fd = new FileDialog(gui,"SaveAs",FileDialog.SAVE);
        fd.setVisible(true);
    
        if(fd.getFile() != null){
            filename = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.setTitle(filename);           
        } 
        
        try {           
            // Kaydetme islemi icin FileWriter yapisi kullanildi.
            FileWriter fw = new FileWriter(fileAddress + filename);
            fw.write(gui.textArea.getText());
            fw.close();
            textString = gui.textArea.getText();
            
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
    
    
    
}

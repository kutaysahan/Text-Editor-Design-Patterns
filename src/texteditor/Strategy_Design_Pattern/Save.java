package texteditor.Strategy_Design_Pattern;


import java.io.FileWriter;
import java.io.IOException;
import texteditor.textEditorGui;

// Arayuzden implement edildi. 
// Execute metodu gerekli islem sekline gore kodlandi.
public class Save implements file_methods_interface {

    String filename; // Dosya adini tutan degisken
    String fileAddress; // Dosya adresini tutan degisken
    String textString;

    @Override
    public void execute(textEditorGui gui) {
        // Kaydedilmis bir dosya yoksa sadece saveAs metodu cagrildi.
        if(filename == null){
            SaveAs a = new SaveAs();
            a.execute(gui);
        }
        // Aksi kosulda yeni bir kay±t olusturur gibi saveAs metotundaki gibi FileWriter yapisi kullanildi.
        else {         
            try {
                FileWriter fw = new FileWriter(fileAddress + filename);               
                fw.write(gui.textArea.getText());
                gui.setTitle(filename);
                fw.close();
                textString = gui.textArea.getText();
            } catch (IOException e) {
                System.out.println("ERROR");
            }
        }
        
    }
    
    
    
    
}

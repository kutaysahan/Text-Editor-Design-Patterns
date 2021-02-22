
package texteditor.Strategy_Design_Pattern;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import texteditor.textEditorGui;



// Arayuzden implement edildi. 
// Execute metodu gerekli islem sekline gore kodlandi.

public class Open implements file_methods_interface{

    String filename; // Dosya adini tutan degisken
    String fileAddress; // Dosya adresini tutan degisken
    String textString;
    
    @Override
    public void execute(textEditorGui gui) {
       //Dosya acma islemi icin FileDialog Load yapisi kullanildi.
        FileDialog fd = new FileDialog(gui,"Open", FileDialog.LOAD);
        fd.setVisible(true);

        // Dosya adi ve adresi elde edildi.
        if(fd.getFile() != null ){
            filename = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.setTitle(filename);
        }
        try {
            // Acma islemi sirasinda dosyayi yüklemek icin dosya adresi ve dosya adi kullanildi.
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + filename));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null){
                sb.append(line + "\n");
            }
            gui.textArea.setText(sb.toString());
            br.close();

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND.");
        }
        textString = gui.textArea.getText(); 
    }
   
}

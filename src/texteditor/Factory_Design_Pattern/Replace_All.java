/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor.Factory_Design_Pattern;

import javax.swing.JOptionPane;
import texteditor.textEditorGui;

/* 
    Format arayüzünden implements yardimiyla bir sinif olusturuldu. 
    Bu sinifta Format arayüzünde olusturulan execute metodu uygun isleme göre
    kodlandi.

*/

public class Replace_All implements Format{

    int currentPosition = 0;
    
    @Override
    public void execute(textEditorGui gui) {
        String findFromText = gui.textArea.getText();  // Texte yazilan veri alindi
        String toFindText = gui.FindTextField.getText(); // Bulunmak istenilen kelime
        
        // Bos string girisi oldugu durumda hata kontrolu
        if("".equals(toFindText)){
            JOptionPane.showMessageDialog(gui, "You must enter a value that will find.");
        }
        else{
            String withReplaceText = gui.ReplaceTextField.getText(); // degistirilmek istenilen kelime
            gui.textArea.setText(findFromText.replaceAll(toFindText, withReplaceText)); // butun kelimeleri degistiren kod
            currentPosition = 0; // guncel pozisyon sifirlandi
        }

    }
    
    
    
    
}

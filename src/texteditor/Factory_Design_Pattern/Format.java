/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor.Factory_Design_Pattern;

import texteditor.textEditorGui;

/**
 *
 * @author Kutay
 */
public interface Format {
    
    //Format arayüzünde çalıştırma işlemini metot oluşturuldu.
    void execute(textEditorGui gui);
    
    
}

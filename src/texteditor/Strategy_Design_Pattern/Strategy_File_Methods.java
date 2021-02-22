package texteditor.Strategy_Design_Pattern;

import texteditor.textEditorGui;

public class Strategy_File_Methods {
    
    // Arayüz tipinden bir degisken olusturuldu.
    public file_methods_interface method;
    
    
    // Degiskenin kullanilabilmesi icin bir constructor olusturuldu.
    public Strategy_File_Methods(file_methods_interface method){
        this.method = method;
    }
    
    
    // Bu tasarim deseni icin islem turunu belirleyen execute metodu
    public void execute(textEditorGui gui){
        method.execute(gui);     
    }
}


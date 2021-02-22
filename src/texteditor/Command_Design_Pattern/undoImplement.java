/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor.Command_Design_Pattern;



// Undo islemini uygulamak icin tasarlanan sinif.
// Komutlari cagiran, cagirici sinif olarak düsünülebilir.

public class undoImplement {
    
    private final Command cmd;

    public undoImplement(Command cmd) {
        this.cmd = cmd;
    }
    
    public void push(){
        cmd.executePush();
    }
    
    public void pop(){
        cmd.executePop();
    }
}

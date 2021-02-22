/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor.Command_Design_Pattern;


public class undoCommand implements Command{    
    /*  
    Undo islemini gerceklestirecek olan pop ve push metotlarinin yazili
    oldugu class'a üst sinif olusturuldu.
    */
    
    // UndoFunction sinifindan bir degisken olusturuldu.
    private final undoFunction undoFunc;

    public undoCommand(undoFunction undoFunc) {
        this.undoFunc = undoFunc;
    }
    
    
    
    // Bir interfaceden alinan pop ve push metotlari override edildi.
    @Override
    public void executePush() {
        undoFunc.PushUndoStack();
    }

    @Override
    public void executePop() {
        undoFunc.PopUndoStack();
    }
    
    
}

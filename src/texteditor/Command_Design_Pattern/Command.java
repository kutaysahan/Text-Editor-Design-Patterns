/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor.Command_Design_Pattern;

/**
 *
 * @author Kutay
 */
public interface Command {

    //Push ve Pop işlemlerini gerçekleştiren metotlar arayüzde oluşturuldu.
    public void executePush();
    public void executePop();
    
}

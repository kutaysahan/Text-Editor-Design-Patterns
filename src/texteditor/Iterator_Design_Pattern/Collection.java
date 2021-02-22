/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor.Iterator_Design_Pattern;

/**
 *
 * @author Mustafa
 */
public interface Collection {       
    //Geriye Iterator dönen createIterator arayüzü oluşturuldu.
    public MyIterator createIterator();
}

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
public interface MyIterator {
    public boolean hasNext();   //Bir sonraki adımda eleman olup olmadığını kontrol eden metot
    public Object next();       //Bir sonraki adımda bulunan elemanı getiren metot
    public Object current();    //Mevcut indeksteki elemanı getiren metot
    void reset();               //Gezilen indeks numarasını sıfırlayan metot
}

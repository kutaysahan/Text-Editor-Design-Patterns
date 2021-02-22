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
//String dizisini barındıran ve içerisinde ListIterator döndüren metot bulunan somut sınıf.
public class ListCollection implements Collection{
    
    String[] word;
    
    public ListCollection(String[] word)
    {
        this.word = word;
    }

    public ListCollection() {
    }   
    
    @Override
    public MyIterator createIterator() 
    { 
        return new ListIterator(word); 
    } 
}

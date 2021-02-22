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

//Iterasyon kurallarını tanıttığımız ve dizi üzerinden işlemler yaptığımız sınıf.
public class ListIterator implements MyIterator{
    
    private String[] word;
    private int current = 0; //Gezindiğimiz indeks numarasını tutan değişken

    public ListIterator(String[] word)
    {
        this.word = word;
    }
    
    //Bir sonraki elemanı döndüren metot.
    @Override
    public String next()
    {        
        return word[current++];
    }
    
    //Bir sonraki elemanın var olup olmadığını boolean değer olarak döndüren metot.
    @Override
    public boolean hasNext()
    {
        if (current >= word.length)
            return false;
        else
            return true;         
    }

    //Bulunan indeksteki elemanı döndüren metot.
    @Override
    public Object current() {
        return word[current];
    }

    //Bulunan indeks değerini sıfırlayan metot.
    @Override
    public void reset() {
        current = 0;
    }
}

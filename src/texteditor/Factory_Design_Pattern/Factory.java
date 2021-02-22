/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor.Factory_Design_Pattern;



// Yapilacak islemin hangisi olacaginin belirlendigi sinif
public class Factory {
    /*
        Factory sinifinda yapilacak olan islem secildi. Ve secilen isleme uygun
        islemler yapildi.
    */
    
    public Format getFormat(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("find")){
            return new Find();
        } else if (shapeType.equalsIgnoreCase("replace")){
            return new Replace();
        } else if(shapeType.equals("find all")){
            return new Find_All();
        } else if (shapeType.equals("replace all")){
            return new Replace_All();
        }
        return null;
    }
}
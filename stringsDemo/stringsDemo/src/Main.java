import sun.text.resources.CollationData;

import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
      /*  System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman ." + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));//cümle bu harfle başlıyorsa tru çevir
        System.out.println(mesaj.endsWith("."));//cümle bu harfle bitiyorsa tru çevir
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);

        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));*/

        String yeniMesaj = mesaj.replace(' ', '-'); //tüm boşluklara - koy
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));//kesmek

        for (String kelime: mesaj.split(" "))//kelimeleri tek tek yazan fonksiyon
        {
            System.out.println(kelime);
        }

System.out.println(mesaj.toLowerCase());//yazıyı küçük harfe çevirmek
        System.out.println(mesaj.toUpperCase());//yazıyı büyük harfe çevirmek
        System.out.println(mesaj.trim());//boşlukları almak





    }

}
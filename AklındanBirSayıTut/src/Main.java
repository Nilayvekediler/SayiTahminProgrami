/* Kullanıcıdan  0-100 arasında bir sayı tutmasını isteyecek. Bu sırada programın kendisi de rastgele bir sayıyı hafızaya alacak ve kullanıcı programın belirlediği
sayıyı bilene kadar çalışacak. Program kullanıcıya aşağı ve yukarı şeklinde ipuçları vererek yönlendirmeler yapacak. Kullanıcı, programın belirlediği sayıyı bulduğu
zaman Bildiniz mesajı yazılacak ve programın çalışması sona erecek.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random hafizaSayi = new Random();
        int hf = hafizaSayi.nextInt(100);// Burada parantez içerisine 100 yazmamızın sebebi,0-100 arası sayılar tutmak istenmesidir. Fakat 0 ve 100 dahil değildir.

        //Program hafızasına rastgele bir sayıyı "hf" içine yukarıda attı.

        System.out.println("Merhaba oyuncu. Ben aklımdan 0-100(0 ile 100 dahil değil) arasında bir sayı tuttum. Bakalım bilebilecek misin?:");

        int i =0;
        while(i==0)
        {
            System.out.println("Tahmin ettiğin sayı:");

            Scanner kisiSayi = new Scanner(System.in);
            int sayi = kisiSayi.nextInt(); //Kullanıcı tahmin ettiği sayıyı "sayi" içine yukarıda attı.

             if (sayi == hf)
             {
                System.out.println("Bildiniz!");
                i += 1;
             }

             else
             {
                 if (sayi > hf)
                 {
                     System.out.println("Yanlış.Daha düşük bir değer tut!");
                 }

                 else if (sayi < hf)
                 {
                     System.out.println("Yanlış.Daha yüksek bir değer tut!");
                 }


             }

        }




    }
}

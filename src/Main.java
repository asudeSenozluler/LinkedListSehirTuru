
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    public static void islemleriBastir(){
        
        
        System.out.println("0 - İşlemleri Görüntüle..");
        System.out.println("1 - Bir sonraki şehre git...");
        System.out.println("2 - Bir önceki şehre git...");
        System.out.println("3 - Uygulamadan Çık.");
        
    }
    
    public static void  sehirleriTurla(LinkedList<String> sehirler) {
        //iterator sayesinde linkedListi baştan sona dogru tek yonde tarıyorum
        ListIterator<String> iterator = sehirler.listIterator();
        
        int islem;
        
        islemleriBastir();
        
        Scanner scanner = new Scanner(System.in);
        //islemleri kullanicidan almak icin scanner kullandım
        
        if (!iterator.hasNext()) {
            //iterator.hasNext linkedListin dolu olup olmadıgını kontrol ediyor
            
            System.out.println("Herhangi bir şehir bulunmuyor...");
        }
        boolean cikis = false;
        boolean ileri = true;
        
        while (!cikis) {
            System.out.println("Bir işlem seçiniz:");
            
            islem = scanner.nextInt();
            
            switch(islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()) {
                            
                            iterator.next();
                            //iteratorda 1 sonraki parametreyi almak icin (bir sonraki sehri göstermek için) kullanılıyo

                            
                        }
                        ileri = true;
                        //iteratorde ileri geri yaparken gittigim parametreyi bir daha yazdırmamak icin yeni bir degisken kullandım

                        
                    }
                    if (iterator.hasNext()) {
                        //bulunan parametreden bir sonraki parametreye gitmek için kullanılır
                        
                        System.out.println("Şehre gidiliyor : " + iterator.next());
                       
                    }
                    else {
                        System.out.println("Gidilecek Şehir Kalmadı...");
                        ileri = true;
                        
                        
                    }
                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()) {
                            //iteratorde onceden gosterdigimiz bir parametre olup olmadıgını kontrol ediyoruz

                            iterator.previous();
                            
                        }
                        ileri = false;

                        
                    }
                    if (iterator.hasPrevious()) {
                        
                        System.out.println("Şehre Gidiliyor : " + iterator.previous());
                        
                    }
                    else {

                        System.out.println("Şehir Turu Başladı....");
                    }
                    break;
                    
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
                
            }
        }
    }
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");
        sehirler.add("İzmir");
        sehirler.add("Manisa");
        sehirler.add("İstanbul");
        
        sehirleriTurla(sehirler);
        
    }
    
}

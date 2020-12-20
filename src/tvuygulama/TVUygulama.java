package tvuygulama;

import java.util.Scanner;

public class TVUygulama {

    static Scanner sc = new Scanner(System.in);
    static Televizyon tv;

    public static void main(String[] args) 
    {

        menuGoster();
        boolean cikis = false;

        while(cikis == false)
        {
            System.out.println("Secim yapiniz: ");
            int secim = sc.nextInt();
            
            switch(secim){
                case 1:
                    tvKurveKanallariOlustur();
                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 6:
                    kanaliBilgisiniGoster();
                    break;
                case 7:
                    tvKapat();
                    break;
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor.");
                    cikis = true;
                    break;
                    default:
                        System.out.println("0 ile 8 aralığında bir sayi giriniz!!");
                        break;
            }
        }
    }
    private static void tvAc()
    {
        if(tv != null)
        {
            tv.tvAc();
        }
        else
        {
            System.out.println("Once tv'yi kurun ve kanallari olusturun");
        }
            
    }
    private static void tvKapat()
    {
        if(tv != null)
        {
            tv.tvKapat();
        }
        else
        {
            System.out.println("Once tv'yi kurun ve kanallari olusturun");
        }
            
    }
    public static void menuGoster(){
        System.out.println("***********");
        System.out.println("0 - Cikis\n"+
                "1 - Televizyonu Kur \n"+
                "2 - televizyonu ac\n"+
                "3 - sesi arttir\n"+
                "4 - sesi azalt\n"+
                "5 - kanal degistir\n"+
                "6 - kanal bilgisini goster\n"+
                "7 - televizyonu kapat\n"+
                "8 - menuyu goster\n");
    }

    private static void tvKurveKanallariOlustur() {
        sc.nextLine();
        System.out.println("Marka: ");
        String marka = sc.nextLine();
        System.out.println("boyut: ");
        String boyut = sc.nextLine();
        
        if(tv == null)
        {
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);
        }
    }

    private static void sesArttir() {
        if(tv != null)
        {
            tv.sesArttir();
        }
        else
        {
            System.out.println("Once tv'yi kurun ve kanallari olusturun");
        }
    }
      private static void sesAzalt(){
        if(tv != null)
        {
            tv.sesAzalt();
        }
        else
        {
            System.out.println("Once tv'yi kurun ve kanallari olusturun");
        }
    }

    private static void kanalDegistir() {
        if(tv!=null)
        {
            System.out.println("Hangi kanala gitmek istiyorsunuz: ");
            int acilmasiIstenenDeger = sc.nextInt();
            tv.kanalDegistir(acilmasiIstenenDeger);
        }
        else
        {
            System.out.println("Once tv'yi kurun ve kanallari olusturun");
        }
    }

    public static void kanaliBilgisiniGoster() {
        if(tv!=null)
        {
            tv.aktifKanalGoster();
        }
        else
        {
            System.out.println("Once tv'yi kurun ve kanallari olusturun");

        }
    }

    
}

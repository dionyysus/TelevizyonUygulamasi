package tvuygulama;

import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;
    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        kanallar = new ArrayList<>(); //burayi kontrol et
        ses = 10;
        aktifKanal = 1;
        kanallariOlustur();
        this.acik = false;
    }
    public void sesArttir()
    {
        if(ses<20 && acik == true)
        {
            ses++;
            System.out.println("Ses seviyesi: "+ses);
        }
        else
        {
            System.out.println("ses maksimumda daha fazla arttıramazsiniz ya da tv kapali.");
        }
    }
    public void sesAzalt()
    {
        if(ses>0 && acik)
        {
            ses--;
            System.out.println("Ses seviyesi: "+ses);

        }
        else
        {
            System.out.println("ses minimumda daha fazla azaltamazsiniz ya da tv kapali..");
        }
    }
    public void tvAc()
    {
        if(acik == false)
        {
            acik = true;
            System.out.println("tv acildi");
        }
        else
        {
            System.out.println("tv zaten acik");
        }
    }
    public void tvKapat()
    {
        if(acik == true)
        {
            acik = false;
            System.out.println("tv kapandı");
        }
        else
        {
            System.out.println("tv zaten kapali");
        }
    }
    private void kanallariOlustur()
    {
        HaberKanali cnn = new HaberKanali("cnn",1,"genel haber");
        kanallar.add(cnn);
        HaberKanali bein = new HaberKanali("bein",2,"spor haber");
        kanallar.add(bein);
        MuzikKanali dreamTurk = new MuzikKanali("dream", 3, "yerli muzik kanali");
        kanallar.add(dreamTurk);
        MuzikKanali numberOne = new MuzikKanali("number one", 4, "yabanci muzik kanali");
        kanallar.add(numberOne);
    }
    public void kanalDegistir(int acilmasiIstenenKanal)
    {
        if(acik)
        {
            if(acilmasiIstenenKanal != aktifKanal)
            {
                if(acilmasiIstenenKanal<=kanallar.size() &&acilmasiIstenenKanal>=0)
                {
                    aktifKanal = acilmasiIstenenKanal;
                    System.out.println("Kanal" + acilmasiIstenenKanal + "Bilgi: "+ kanallar.get(aktifKanal-1).kanalBilgiGoster());
                }
            }
            else
            {
                System.out.println("zaten" + aktifKanal + "kanaldasiniz. Degistirme yapilamadi.");
            }
        }
        else
        {
            System.out.println("once tv'yi aciniz!");
        }
    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
    public void aktifKanalGoster()
    {
        System.out.println("Aktif kanal: "+kanallar.get(aktifKanal-1).kanalBilgiGoster());
    }
    @Override
    public String toString() {
        return "marka: " + marka + "boyut: "+boyut + "olan tv olusturuldu.";
    }
    
}

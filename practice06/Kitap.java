package practiceAdvanced.practice06;

public class Kitap {
    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static int kitapSayisi;

    public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        kitapSayisi++;
        this.seriNo = yazarAdi.substring(0,2)+kitapAdi.substring(0,2)+"00"+kitapSayisi;
    }
    public void kitapBilgileri(){
        System.out.println("Kitap Adi: "+kitapAdi+"\nYazar Adi:  "+yazarAdi+"\nSayfa Sayisi: "+sayfaSayisi+"\nKitap seri No: "+seriNo+"\n**************");

    }



}

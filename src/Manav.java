import java.util.Scanner;

public class Manav {

    static String[] urunListesi = new String[]{"1. Elma : 10 TL","2. Portakal : 15 TL","3. Domates : 12 TL","4. Biber : 30 TL","5.Patlıcan : 22 TL"};
    static int [] fiyatListesi={10, 15, 12, 30, 22};
    static int toplam=0;

    public static void main(String[] args) {
        System.out.println("===========SİNEM MANAVI===========");

        urunSec();
    }

    public  static void urunSec() {
        Scanner scan=new Scanner(System.in);

        for (String each:urunListesi
             ) {
            System.out.println(each);
        }
        System.out.println("LÜTFEN ÜRÜN SECİNİZ :");
        int urunSec=scan.nextInt();
        System.out.println("LÜTFEN  MİKTARI GİRİNİZ (KG) :");
        int miktar= scan.nextInt();
        toplam+=(miktar*fiyatListesi[urunSec-1]);

        System.out.println("ALIŞVERİŞE DEVAM ETMEK İSTİYOR MUSUNUZ (E/H)");
        char devamMi=scan.next().toUpperCase().charAt(0);
        if (devamMi=='H'){
            System.out.println("ÖDEMENİZ GEREKEN TOPLAM TUTAR : "+toplam);
            System.exit(0);

        }else urunSec();

    }
}

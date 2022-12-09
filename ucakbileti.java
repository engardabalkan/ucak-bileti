import java.util.Scanner;
public class ucakbileti {
    public static void main(String[] args) {
        int mesafe,yas,select;
        double indirimsiztutar,yasindirimi,toplamtutar;
        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen gidilecek mesafeyi KM cinsinden giriniz:");
        mesafe=inp.nextInt();

        System.out.print("Lütfen yaşınızı giriniz:");
        yas=inp.nextInt();

        System.out.println("Lütfen yolculuk tipini seçiniz: \n1-Tek yön\n2-Gidiş dönüş");
        System.out.print("Seçiminiz:");
        select=inp.nextInt();

        indirimsiztutar=mesafe*(0.10);

        if (select==1){
            if (0<yas && yas<12){
            yasindirimi=indirimsiztutar/2;
                System.out.println("Bilet fiyatı:"+yasindirimi);
            } else if (yas>12 && yas<24) {
            yasindirimi=indirimsiztutar-indirimsiztutar*(0.1);
                System.out.println("Bilet fiyatı:"+yasindirimi);
            } else if (24<yas && yas<65) {
            yasindirimi=indirimsiztutar;
                System.out.println("Bilet fiyatı:"+yasindirimi);
            } else if (yas>65) {
            yasindirimi=indirimsiztutar-indirimsiztutar*(0.3);
                System.out.println("Bilet fiyatı:"+yasindirimi);
            }else {
            System.out.print("Lütfen geçerli bir sayı giriniz.");
            }

        } else if (select==2) {
            indirimsiztutar=indirimsiztutar*2;
            if (0<yas && yas<12){
                yasindirimi=(indirimsiztutar/2)*0.8;
                System.out.println("Bilet fiyatı:"+yasindirimi);
            } else if (yas>12 && yas<24) {
                yasindirimi=((indirimsiztutar-indirimsiztutar*(0.1))*0.8);
                System.out.println("Bilet fiyatı:"+yasindirimi);
            } else if (24<yas && yas<65) {
                yasindirimi=indirimsiztutar*0.8;
                System.out.println("Bilet fiyatı:"+yasindirimi);
            } else if (yas>65) {
                yasindirimi=(indirimsiztutar-indirimsiztutar*(0.3))*0.8;
                System.out.println("Bilet fiyatı:"+yasindirimi);
            }else {
                System.out.print("Lütfen geçerli bir sayı giriniz.");
            }
        }else {
            System.out.println("Lütfen geçerli bir rakam giriniz.");
        }
    }
}


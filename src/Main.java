import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int mat,fizik,kimya,turkce,tarih,muzik;
        boolean bitti = true;
        while(bitti) {
            try {
                Scanner inp = new Scanner(System.in);

                System.out.println("Matematik Notunuz");
                mat = inp.nextInt();
                System.out.println("Fizik Notunuz");
                fizik = inp.nextInt();
                System.out.println("Kimya Notunuz");
                kimya = inp.nextInt();
                System.out.println("Türkçe Notunuz");
                turkce = inp.nextInt();
                System.out.println("Tarih Notunuz");
                tarih = inp.nextInt();
                System.out.println("Müzik Notunuz");
                muzik = inp.nextInt();

                int Ortalama = ((mat + fizik + kimya + turkce + tarih + muzik) / 6);

                System.out.println("Ortalama: " + Ortalama);

                if(Ortalama > 60){
                    System.out.println("Sınıfı Geçti");
                }else{
                    System.out.println("Sınıfta Kaldı");
                }

                bitti = false;
            } catch (Exception e) {
                System.out.println("Lütfen Tam Sayı giriniz '.'ve',' Kullanmayınız");

            }
        }
    }
}
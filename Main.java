import java.util.Scanner;

       /*   *****Vücut Kitle İndeksi Hesaplama*****
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
                    FORMUL
        Vucut Kitle Endeksi= Kilo (kg) / Boy(m) * Boy(m)

        */
public class Main {

    public static void main(String[] args) {
        double vKE, kilo, boy;   //Vucut kitle endeksi


        Scanner scanner = new Scanner(System.in);


        System.out.print("Lutfen Kilonuzu(Kg) Giriniz: ");
        kilo = scanner.nextDouble();

        System.out.print("Lutfen Boyunuzu(m) giriniz(Ornek:1,72): ");
        boy = scanner.nextDouble();


        vKE = kilo / (boy * boy);

        System.out.println("Vucut Kitle Endeksiniz: " + vKE);
    }
}

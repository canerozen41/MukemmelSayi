import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0; // Pozitif bölenlerin toplamı

        // 1'den girilen sayının yarısına kadar döngü (kendisi hariç bölenleri bulmak için)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) { // Eğer i, number'ı tam bölüyorsa
                sum += i; // Toplam değere ekle
            }
        }

        // Mükemmel sayı kontrolü
        if (sum == number && number != 0) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }

        scanner.close();
    }
}

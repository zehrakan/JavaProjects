import java.util.Scanner;

public class ATMSimulasyonu {

    public static void main(String[] args) {
        // ATM başlangıç ayarları
        try (Scanner scanner = new Scanner(System.in)) {
            // ATM başlangıç ayarları
            int pinCode = 5530;  // Belirlenen PIN kodu
            double balance = 5000;  // Başlangıç bakiyesi
            // Kullanıcıdan PIN kodu girmesini isteme
            System.out.print("Lütfen PIN kodunuzu girin: ");
            int userPin = scanner.nextInt();
            // PIN doğrulama
            if (userPin == pinCode) {
                System.out.println("PIN kodu doğrulandı. ATM'ye hoş geldiniz!");
                
                // ATM menüsü döngüsü
                boolean exit = false;
                while (!exit) {
                    // Menüyü göster
                    System.out.println("\nATM Menüsü:");
                    System.out.println("1. Bakiye Görüntüleme");
                    System.out.println("2. Para Yatırma");
                    System.out.println("3. Para Çekme");
                    System.out.println("4. Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçin (1-4): ");
                    int secim = scanner.nextInt();
                    
                    // Seçime göre işlem yapma
                switch (secim) {
                        case 1 -> // Bakiye görüntüleme
                            System.out.println("Mevcut bakiyeniz: " + balance + " TL");
                            
                        case 2 -> {
                            // Para yatırma
                            System.out.print("Yatırmak istediğiniz tutarı girin: ");
                            double deposit = scanner.nextDouble();
                            balance += deposit;
                            System.out.println("Başarıyla " + deposit + " TL yatırıldı. Güncel bakiyeniz: " + balance + " TL");
                        }
                            
                        case 3 -> {
                            // Para çekme
                            System.out.print("Çekmek istediğiniz tutarı girin: ");
                            double withdrawAmount = scanner.nextDouble();
                            
                            // Yeterli bakiye kontrolü
                            if (withdrawAmount <= balance) {
                                balance -= withdrawAmount;
                                System.out.println("Başarıyla " + withdrawAmount + " TL çekildi. Güncel bakiyeniz: " + balance + " TL");
                            } else {
                                System.out.println("Hata: Yetersiz bakiye! Mevcut bakiyeniz: " + balance + " TL");
                            }
                        }
                            
                        case 4 -> {
                            // Çıkış
                            System.out.println("Çıkış yapılıyor... Hoşça kalın!");
                            exit = true;
                        }
                            
                        default -> // Geçersiz seçenek
                            System.out.println("Geçersiz seçenek! Lütfen 1-4 arasında bir seçenek girin.");
                    }
                }
            } else {
                System.out.println("Hatalı PIN kodu! ATM'ye giriş başarısız.");
            }
            // Kaynakları kapatma
        } // Belirlenen PIN kodu
    }
}
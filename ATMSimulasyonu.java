import java.util.Scanner;

public class ATMSimulasyonu {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            int pinCode = 5530;  
            double balance = 5000;  
            System.out.print("Lütfen PIN kodunuzu girin: "); 
             int userPin = scanner.nextInt();
            if (userPin == pinCode) {
                System.out.println("PIN kodu doğrulandı. ATM'ye hoş geldiniz!");       
                boolean exit = false;
                while (!exit) {
                    System.out.println("\nATM Menüsü:");
                    System.out.println("1. Bakiye Görüntüleme");
                    System.out.println("2. Para Yatırma");
                    System.out.println("3. Para Çekme");
                    System.out.println("4. Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçin (1-4): ");
                    int secim = scanner.nextInt();
                    

                switch (secim) {
                        case 1 -> 
                            System.out.println("Mevcut bakiyeniz: " + balance + " TL");
                            
                        case 2 -> {
                            
                            System.out.print("Yatırmak istediğiniz tutarı girin: ");
                            double deposit = scanner.nextDouble();
                            balance += deposit;
                            System.out.println("Başarıyla " + deposit + " TL yatırıldı. Güncel bakiyeniz: " + balance + " TL");
                        }
                            
                        case 3 -> {
                            
                            System.out.print("Çekmek istediğiniz tutarı girin: ");
                            double withdrawAmount = scanner.nextDouble();
                            
                            
                            if (withdrawAmount <= balance) {
                                balance -= withdrawAmount;
                                System.out.println("Başarıyla " + withdrawAmount + " TL çekildi. Güncel bakiyeniz: " + balance + " TL");
                            } else {
                                System.out.println("Hata: Yetersiz bakiye! Mevcut bakiyeniz: " + balance + " TL");
                            }
                        }
                            
                        case 4 -> {
                            
                            System.out.println("Çıkış yapılıyor... Hoşça kalın!");
                            exit = true;
                        }
                            
                        default -> 
                            System.out.println("Geçersiz seçenek! Lütfen 1-4 arasında bir seçenek girin.");
                    }
                }
            } else {
                System.out.println("Hatalı PIN kodu! ATM'ye giriş başarısız.");
            }
           
        }
    }
}
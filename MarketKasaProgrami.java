import java.util.Scanner;

public class MarketKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplamTutar = 0;
        boolean indirimUygulandi = false;

        while (true) {
            System.out.println("Ürün Seçiniz:");
            System.out.println("1 - Elma (20 TL)");
            System.out.println("2 - Süt (15 TL)");
            System.out.println("3 - Ekmek (10 TL)");
            System.out.println("0 - Alışverişi Tamamla");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1 -> {
                    toplamTutar += 20;
                    System.out.println("Elma sepete eklendi.");
                }
                case 2 -> {
                    toplamTutar += 15;
                    System.out.println("Süt sepete eklendi.");
                }
                case 3 -> {
                    toplamTutar += 10;
                    System.out.println("Ekmek sepete eklendi.");
                }
                case 0 -> {
                    System.out.print("İndirim kuponunuz var mı? (Evet: 1 / Hayır: 0): ");
                    int kupon = scanner.nextInt();
                    if (kupon == 1) {
                        toplamTutar *= 0.9; 
                        indirimUygulandi = true;
                    }
                    System.out.println("Toplam tutar: " + toplamTutar + " TL");
                    if (indirimUygulandi) {
                        System.out.println("İndirim kuponu uygulandı!");
                    }
                    System.out.println("Alışverişiniz için teşekkür ederiz!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }
}

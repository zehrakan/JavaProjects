import java.util.Scanner;

public class RestoranSiparis {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;
        double toplamTutar = 0;
        boolean devam = true;

        System.out.println("🍽 RESTORAN MENÜSÜ 🍽");
        System.out.println("1. Pizza - 120 TL");
        System.out.println("2. Hamburger - 100 TL");
        System.out.println("3. Makarna - 80 TL");
        System.out.println("4. Salata - 50 TL");
        System.out.println("5. Çorba - 40 TL");
        System.out.println("0. Siparişi Tamamla");

        do {
            System.out.print("Lütfen bir seçim yapın: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1 -> {
                    toplamTutar += 120;
                    System.out.println("Pizza eklendi! (120 TL)");
                }
                case 2 -> {
                    toplamTutar += 100;
                    System.out.println("Hamburger eklendi! (100 TL)");
                }
                case 3 -> {
                    toplamTutar += 80;
                    System.out.println("Makarna eklendi! (80 TL)");
                }
                case 4 -> {
                    toplamTutar += 50;
                    System.out.println("Salata eklendi! (50 TL)");
                }
                case 5 -> {
                    toplamTutar += 40;
                    System.out.println("Çorba eklendi! (40 TL)");
                }
                case 0 -> devam = false;
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }

        } while (devam);

        System.out.println("\n🛒 Siparişiniz tamamlandı!");
        System.out.println("💰 Toplam Tutar: " + toplamTutar + " TL");
        System.out.println("Afiyet olsun! 😊");

        scanner.close();
    }
}

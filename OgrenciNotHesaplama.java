import java.util.Scanner;

public class OgrenciNotHesaplama {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notlar = new int[5]; // 5 dersin notlarını saklayacak dizi
        int toplam = 0;
        int enYuksek = Integer.MIN_VALUE;
        int enDusuk = Integer.MAX_VALUE;
        boolean dusukNotVar = false;

        // Kullanıcıdan 5 dersin notlarını alıyoruz
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". dersin notunu girin: ");
            notlar[i] = scanner.nextInt();
            toplam += notlar[i];

            // En yüksek ve en düşük notları belirleme
            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
            if (notlar[i] < enDusuk) {
                enDusuk = notlar[i];
            }

            // Eğer herhangi bir not 30’un altındaysa uyarı vereceğiz
            if (notlar[i] < 30) {
                dusukNotVar = true;
            }
        }

        // Ortalama hesaplama
        double ortalama = toplam / 5.0;

        // Sonuçları ekrana yazdırma
        System.out.println("\nDers Notları Analizi:");
        System.out.println("Ortalamanız: " + ortalama);

        if (ortalama >= 50) {
            System.out.println("Tebrikler, geçtiniz!");
        } else {
            System.out.println("Maalesef, kaldınız.");
        }

        if (dusukNotVar) {
            System.out.println("Uyarı: Düşük not aldığınız dersler var!");
        }

        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("En düşük not: " + enDusuk);

        scanner.close();
    }
}

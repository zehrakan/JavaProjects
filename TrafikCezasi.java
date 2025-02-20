import java.util.Scanner;

public class TrafikCezasi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Lütfen hızınızı girin (km/s): ");
            int hiz = scanner.nextInt();
            
            if (hiz > 130) {
                System.out.println("Ehliyetinize el konuldu!");
            } else if (hiz > 110) {
                System.out.println("Cezanız: 2000 TL");
            } else if (hiz > 90) {
                System.out.println("Cezanız: 1000 TL");
            } else {
                System.out.println("Hız sınırına uyuyorsunuz, iyi yolculuklar!");
            }
        }
    }
}


import java.util.Scanner;

public class hitungvolumekuburs {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan sisi kubus ");
            Double sisi = input.nextDouble();
            Double volume = sisi * sisi * sisi;
            System.out.println("volume kubus: " + volume);
        }
    }
}

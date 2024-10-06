import java.util.Scanner;

public class hitungcelcius {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            // konversi celcius ke fahrenheit
            System.out.print("Masukkan suhu dalam Celcius ");
            Double celcius = input.nextDouble();
            Double fahrenheit = (celcius * 9 / 5) + 32;
            System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        }
    }
    
}

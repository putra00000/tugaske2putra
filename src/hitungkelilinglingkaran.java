import java.util.Scanner;

public class hitungkelilinglingkaran {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
    System.out.print("Masukan jari-jari lingkaran ");
    Double jariJari = input.nextDouble();
    Double keliling = 2 * Math.PI * jariJari;
    System.out.println("Keliling lingkaran: " + keliling);

    input.close();
    }

}
}
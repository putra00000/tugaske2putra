import java.util.Scanner;

public class kembaliantelur {

    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("Masukan (kg) telur yang dibeli: ");
            Double KiloTelur = inputan.nextDouble();
            
            System.out.print("Masukan uang bayar: ");
            Double uangBayar = inputan.nextDouble();
            
            Double HargaTelur = KiloTelur * 28000;
            Double Kembalian = uangBayar - HargaTelur;
            
            System.out.printf("uang kembalian : %.2f",Kembalian);
        }
    }
    
}

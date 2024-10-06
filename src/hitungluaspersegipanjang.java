import java.util.Scanner;

public class hitungluaspersegipanjang {
 
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Masukan panjang persegi panjang ");
        Double panjang = input.nextDouble();
        System.out.print("Masukan lebar persegi panjang ");
        Double lebar = input.nextDouble();
        Double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);
    }
    }

}

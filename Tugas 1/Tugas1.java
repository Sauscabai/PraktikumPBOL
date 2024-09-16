import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM Anda: ");
        String nim = scanner.nextLine();
        
        System.out.println("\nOutput:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        
        scanner.close();
    }
}
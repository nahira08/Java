package pbo;

import java.util.Scanner;

public class BookSystem {
    private String nama, noTelp, alamat, email;
    private int[][] room = {{0, 101, 1000000}, {1, 102, 25}};
    
    public void init(Scanner scanner) {
        System.out.println("Masukkan nama : ");
        nama = scanner.nextLine();
        System.out.println("Masukkan noTelp (+62): ");
        noTelp = scanner.nextLine();
        System.out.println("Masukkan alamat: ");
        alamat = scanner.nextLine();
        System.out.println("Masukkan email: ");
        email = scanner.nextLine();
    }

    public void dispPerson() {
        System.out.println("\nData Pemesan:");
        System.out.println("Nama: " + nama);
        System.out.println("No Telp: " + noTelp);
        System.out.println("Alamat: " + alamat);
        System.out.println("Email: " + email);
    }

    public boolean BookRoom(int roomIndex) {
        if (room[roomIndex][0] == 0) {
            System.out.println("Kamar " + room[roomIndex][1] + " berhasil dipesan.");
            room[roomIndex][0] = 1; 
            return true;
        } else {
            System.out.println("Kamar " + room[roomIndex][1] + " sudah ditempati.");
            return false;
        }
    }

    public void doPayment(int roomIndex) {
        System.out.println("Pembayaran kamar " + room[roomIndex][1] + " sebesar Rp " + room[roomIndex][2] + " berhasil. ");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookSystem system = new BookSystem();

        system.init(scanner);
        system.dispPerson();

        System.out.print("\nPilih kamar (0 atau 1): ");
        int roomChoice = scanner.nextInt();
        
        
        if (system.BookRoom(roomChoice)) {
            system.doPayment(roomChoice);
        }

        scanner.close();
    }
}

// nanti tinggal benahin bagian yang kebalik seperti masukkan email baru no telp dll.aini
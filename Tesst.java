import java.util.Scanner;

public class Tesst {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Pilih Jenis Kendaraaan (1 Untuk Sepeda, 2 Untuk Mobil)");
        int jenis = n.nextInt();

        if (jenis == 1) {
            Bicycle sepeda = new Bicycle();
            System.out.println("Jumlah Roda  : ");
            sepeda.numWheels = n.nextInt();
            System.out.println("Harga        : ");
            sepeda.price = n.nextDouble();
            System.out.println("Tipe Sepeda  : ");
            sepeda.bikeType = n.next();
            System.out.println("Diskon Atau Tidak? (1/2)");
            int diskonya = n.nextInt();
            if (diskonya == 1) {
                System.out.println("Masukkan Diskon (%) : ");
                sepeda.discount = n.nextInt();
                System.out.println("---Ini Data Sepeda---");
                sepeda.print();
            } else if (diskonya == 2) {
                System.out.println("---Ini Data Sepeda---");
                sepeda.print();

            }

        } else if (jenis == 2) {
            System.out.println("Convertible Atau Tidak (1/2)");
            int conv = n.nextInt();
            if (conv == 1) {
                Convertible mobil = new Convertible();
                System.out.println("Jumlah Roda  : ");
                mobil.numWheels = n.nextInt();
                System.out.println("Harga        : ");
                mobil.price = n.nextDouble();
                System.out.println("Jumlah Pintu : ");
                mobil.numDoors = n.nextInt();
                System.out.println("Apakah Elektrik? (true/false)");
                mobil.isElectric = n.nextBoolean();
                System.out.println("Jenis Atap   : ");
                mobil.roofType = n.next();
                System.out.println("Diskon Atau Tidak? (1/2)");
                int diskonya = n.nextInt();
                if (diskonya == 1) {
                    System.out.println("Masukkan Diskon (%) : ");
                    mobil.discount = n.nextInt();
                    System.out.println("---Ini Data Mobil---");
                    mobil.print();
                } else if (diskonya == 2) {
                    System.out.println("---Ini Data Mobil---");
                    mobil.print();

                }

            } else if (conv == 2) {
                Car mobil = new Car();
                System.out.println("Jumlah Roda  : ");
                mobil.numWheels = n.nextInt();
                System.out.println("Harga        : ");
                mobil.price = n.nextDouble();
                System.out.println("Jumlah Pintu : ");
                mobil.numDoors = n.nextInt();
                System.out.println("Apakah Elektrik? (true/false)");
                mobil.isElectric = n.nextBoolean();
                System.out.println("Diskon Atau Tidak? (1/2)");
                int diskonya = n.nextInt();
                if (diskonya == 1) {
                    System.out.println("Masukkan Diskon (%) : ");
                    mobil.discount = n.nextInt();
                    System.out.println("---Ini Data Mobil---");
                    mobil.print();
                } else if (diskonya == 2) {
                    System.out.println("---Ini Data Mobil---");
                    mobil.print();

                }
            }

        }

        n.close();
    }
}

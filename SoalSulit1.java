import java.util.Scanner;

public class SoalSulit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        Double rataRataKehadiran = 0.0, totalKehadiran = 0.0;

        // Array untuk menyimpan jumlah hari hadir setiap siswa
        int[] kehadiran = new int[jumlahSiswa];

        // Memasukkan jumlah hari hadir untuk setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir untuk siswa ke-" + (i + 1) + ": ");
            kehadiran[i] = scanner.nextInt();
        }

        // Menghitung rata-rata kehadiran
    
        for (int hadir : kehadiran) {
            totalKehadiran += hadir;
        }
        rataRataKehadiran = (double) (totalKehadiran / jumlahSiswa);

        // Menampilkan hasil
        System.out.println("\nLaporan Kehadiran Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " Hari hadir");
        }
        System.out.printf("Rata-rata kehadiran: %.2f Hari", rataRataKehadiran);

        System.out.println("");
        System.out.println("kesimpulan");
        System.out.println("");
        System.out.println("siswa dengan kehadiran diatas rata-rata = " + rataRataKehadiran);
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRataKehadiran) {
                System.out.println("siswa ke-" + (i + 1) + "memiliki kehadiran diatas rata rata (" + kehadiran [i] + " hari).");
            }
        }
        System.out.println("----------------");
        System.out.println("siswa dengan kehadiran dibawah rata-rata = "  );
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRataKehadiran) {
                System.out.println("siswa ke-" + (i + 1) + "memiliki kehadiran dibawah rata rata (" + kehadiran [i] + " hari).");
            }
        }
        
        scanner.close();
    }
}
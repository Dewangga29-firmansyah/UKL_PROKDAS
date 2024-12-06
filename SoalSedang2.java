import java.util.Scanner;

public class SoalSedang2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("masukkan jari - jari : ");
        int jarijari = Scanner.nextInt();
        System.out.println("masukkan tinggi : ");
        int tinggi = Scanner.nextInt();

        System.out.println("luaspermukaanbola = " + "3.14" + " x " + jarijari + " x " + jarijari);

        hitungvolume(jarijari);

        luaspermukaantabung(jarijari,tinggi);

    }

    public static void hitungvolume(int jarijari) {
        double phi = 3.14;
        System.out.println("luaspermukaanbola = " + (4 * phi * jarijari * jarijari));
    }

    public static void luaspermukaantabung(int jarijari, int tinggi) {
        double phi = 3.14;
        System.out.println("luaspermukaantabung = " + (2 * phi * jarijari * jarijari*tinggi));
    }
}

























































































// import java.util.Scanner;

// public class SoalSedang2 {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("masukkan jari - jari : ");
//         int jarijari = Scanner.nextInt();
//         System.out.println("masukkan tinggi ");
//         int tinggi = Scanner.nextInt();

//         hitungvolumetabung(tinggi, jarijari);

//     }

//     public static void hitungvolumetabung(int tinggi, int jarijari) {
//         double phi = 3.14;
//         System.out.println("volume tabung = " + phi + jarijari + " x " + jarijari + " x " + tinggi);

//         double hitung = phi * jarijari * jarijari * tinggi;
//         System.out.println("volume tabung = " + hitung);
//     }
// }












































































public class SoalMudah3 {
    public static void main(String[] args) {

        for (int i = 50; i > 0; i--) {
            if (i == 50) {
                System.out.println(i + ". Saya Senang");
            }else if (i % 2 == 0) {
                System.out.println(i + ". Saya Anak Moklet");
            } else if (i % 3 == 0) {
                System.out.println(i + ". Saya Angkatan 33");

            } else if (i == 1) {
                System.out.println(i + ". Saya Senang");
                
            } else {
                System.out.println(i + ". Saya Anak Wikusama");
            }
        }
    }
}
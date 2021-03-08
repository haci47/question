package haci.com;

public class Main {

    public static void main(String[] args) {
        int[] TamSayilar = {0, 1,2, 3, 4, 5, 6, 7, 8,  10, 11, 12,};


        boolean bulundumu;

        for (int j = 0; j <= TamSayilar.length; j++) {

            bulundumu = false;
            for (int i = 0; i < TamSayilar.length; i++) {

                if (TamSayilar[i] == j) {
                    bulundumu = true;
                }
            }

            if (bulundumu == false) {

                System.out.println("Olmayan Eleman = " + j);
            }
        }
    }
}
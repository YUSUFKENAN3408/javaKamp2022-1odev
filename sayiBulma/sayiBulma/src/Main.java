public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 6, 5, 7};
        int aranacak = 6;
        boolean varMi = false;


        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {

            System.out.println("Sayı mevcuttur");


        } else {
            System.out.println("Sayı mevcut değildir");
        }

    }


}

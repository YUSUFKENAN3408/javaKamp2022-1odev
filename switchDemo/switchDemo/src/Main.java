public class Main {
    public static void main(String[] args) {

        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("iyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil: Geçtiniz");
                break;
            case 'E':
                System.out.println("Malesef kaldınız");
                break;
            default:
                System.out.println("Yanlış bir not türü girdiniz");

        }


    }
}
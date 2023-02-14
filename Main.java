import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kdv'sinin hesaplanmasını istediğiniz tutarı girin:");

        Scanner input = new Scanner(System.in);
        int sayi=input.nextInt();

        float KDV=18/100f;

        if (sayi>1000){
            KDV=8/100f;
        }


        float kdvTutarı=sayi*KDV;
        float kdvliTutar=sayi+kdvTutarı;

        System.out.println("KDVLI TUTAR ="+kdvliTutar+"  KDV tutarı ="+ kdvTutarı);
    }
}
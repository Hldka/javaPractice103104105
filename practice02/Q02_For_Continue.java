package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q02_For_Continue {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner input=new Scanner(System.in);
        int sum=0;
        for (int i=0;i<5;i++){
            System.out.println("lütfen bir sayi giriniz ");
            int sayi=input.nextInt();
            if (sayi>5&&sayi<10){
                System.out.println("girdiginiz sayi 5 ile 10 arasinda oldugu icin isleme alinmayacak ")
                ;continue;}
            sum=sum+sayi;

        }
        System.out.println(sum);
    }
}

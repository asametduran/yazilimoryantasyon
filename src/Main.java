import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi = -1 , s=0, toplam=0;
        float ort;

        Scanner oku = new Scanner(System.in);
        while (sayi!=0){
            System.out.println("sayi girin = ");
            sayi = oku.nextInt();
            toplam = sayi + toplam;
            s++;
        }
if(sayi == 1)
    System.out.println("sayi girişi yapmadiniz...");
else{
    ort =toplam/(s-1);
    System.out.println((s-1)+"tane sayı girişi yapılmıştır.");
    System.out.println("girilen sayilarin toplamı = "+toplam);
    System.out.println("Ortalama = "+ort);
}

    }
}
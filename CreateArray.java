package siniflar;
import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin Boyutu N :");
        int sayi =input.nextInt();
        int []sayilar =new int[sayi];

        int i=0;
        int j=1;
        while (i<sayilar.length){

            System.out.println(j++ +". elemanı");
            int a =input.nextInt();
            sayilar[i]=a;
            i++;


        }
        Arrays.sort(sayilar);
        System.out.println("Sıralaması :"+Arrays.toString(sayilar));

    }
}

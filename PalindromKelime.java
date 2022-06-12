package siniflar;

import java.util.Scanner;

public class PalindromKelime {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = input.nextLine();

        if (isPalindrome(kelime)==true){
            System.out.println(kelime+ " kelimesş palindrom bir kemilemedir.");
        }
        else {
            System.out.println(kelime+ " kelimesş palindrom bir kemileme degildir.");
        }

    }
}

import java.util.Scanner;
public class ort {
    public static void main(String[] args) {
        System.out.println("Sayı giriniz: ");
        Scanner take = new Scanner(System.in);
        float sayi=0;
        float toplam = 0;
        int i = take.nextInt();
        for (int j = 0; j < i; i++)
        {
            if(j%4==0 && j%3==0)
            {
                toplam+=j;
                sayi++;
            }
        }
        System.out.println("Ort: " + toplam/sayi);
    }
}

package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan dizinin boyutunu alınıyor
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();


        //Kullanıcıdan dizinin elemanları alınır
        int[] dizi = new int[n];
        for(int i = 0 ; i < dizi.length ; i++) {
            System.out.print((i+1) + ". enter number: ");
            dizi[i] = input.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);


        //Sıralı diziyi ekrana yazdırma
        System.out.println("Sorted list: ");
        System.out.print("[");
        for(int i = 0 ; i < dizi.length ; i++) {
            System.out.print(dizi[i] + ", ");
        }
        System.out.println("]");

        System.out.println();  //Yeni satır


        // Tekrar sayılarını bul ve ekrana yazdır
        System.out.println("Repeat numbers: ");
        int count = 1;
        for (int i = 0 ; i < n ; i++) {
            if (i == n-1 || dizi[i] != dizi[i+1]){  //Son eleman veya sıradaki elemana geçildiğinde
                System.out.println(dizi[i] +" sayısı " + count + " kere tekrar edildi");
                count = 1;
            } else {
                count++;
            }
        }

        //Scanner'ı kapat
        input.close();
    }
}

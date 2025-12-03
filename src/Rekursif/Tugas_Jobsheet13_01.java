package Rekursif;
import java.util.Scanner;
public class Tugas_Jobsheet13_01 {
    static int totalIteratif (int[] angkaa){
        int total = 0;
        for (int i = 0; i < angkaa.length; i++) {
            total += angkaa[i];
        }
        return total;
    }
    static int totalRekursif (int[] jml, int a){
    if (a == jml.length){
        return 0;
        }
        else {
            return (jml[a] + totalRekursif(jml, a+1));
        }
    }
    static int totalRekursif (int[] jml){
        return totalRekursif (jml, 0);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan jumlag yang ingin dihitung (N) : ");
        n = sc.nextInt();

        int[] angka = new int[n];
        
        for (int i = 0; i < angka.length; i++){
            System.out.print("Masukkan angka ke-"+(i+1)+" : ");
            angka[i] = sc.nextInt();
        }

        System.out.print("Total dari "+n+" angka yang dimasukkan adalah : ");
        System.out.println(totalIteratif(angka));
        System.out.print("Total dari "+n+" angka yang dimasukkan adalah : ");
        System.out.println(totalRekursif(angka));
    }
}

package semester2.Remidial;

import java.util.Scanner;
public class Hasil {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Rumus R = new Rumus();

        System.out.println("===KALKULATOR BANGUN RUANG===\n\n==Pilih Opsi==\n1.Kubus\n2.Balok\n3.Tabung\n4.Kerucut\n5.Limas Segitiga\n6.Bola");
        System.out.print("\nApa Pilihanmu!: ");
        int opsi = x.nextInt();


        if (opsi == 1) {
            System.out.print("Input Sisi: ");
            R.Kubus(x.nextInt());
        }

        else if(opsi == 2){
            System.out.print("Input Panjang: ");
            int a = x.nextInt();
            System.out.print("Input Lebar: ");
            int b = x.nextInt();
            System.out.print("Input Tinggi: ");
            int c = x.nextInt();
            R.Balok(a, b, c);
        }

        else if(opsi == 3){
            System.out.print("Input Tinggi");
            int a = x.nextInt();
            System.out.print("Input jari-jari: ");
            int b = x.nextInt();
            R.Tabung(a,b);
        }

        else if(opsi == 4){
            System.out.print("Input Tinggi: ");
            int a = x.nextInt();
            System.out.print("Input Jari-Jari: ");
            int b = x.nextInt();
            System.out.println("Input Gatis Pelukis");
            int c = x.nextInt();
            R.Kerucut(a, b, c);
        }

        else if(opsi == 5){
            System.out.println("==Beri Angka '0' Untuk Mencari Angka Tersebut!==");
            System.out.print("Input Tinggi: ");
            int a = x.nextInt();
            System.out.print("Input Volume: ");
            int l = x.nextInt();
            System.out.print("Input Luas Alas: ");
            int h = x.nextInt();
            System.out.print("Input Alas Segitiga 1: ");
            int b =x.nextInt();
            System.out.print("Input Alas Segitiga 2: ");
            int c=x.nextInt();
            System.out.print("Input Alas Segitiga 3: ");
            int d=x.nextInt();
            System.out.print("Input Luas Segitiga 1: ");
            int e=x.nextInt();
            System.out.print("Input Luas Segitiga 2: ");
            int f=x.nextInt();
            System.out.print("Input Luas Segitiga 3: ");
            int g = x.nextInt();
            System.out.print("Input Alas Segitiga (Alas): ");
            int i = x.nextInt();
            System.out.print("Input Tinggi Segitiga (Alas): ");
            int j = x.nextInt();
            R.LimasSegitiga(a, b, c, d, e, f, g, h, i, j, k, l);
        }

        else if(opsi == 6){
            System.out.print("Input Jari-Jari: ");
            int a = x.nextInt();
            R.bola(a);
        }
    }
}

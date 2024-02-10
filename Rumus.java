package semester2.Remidial;
import semester2.Remidial.Hasil;

public class Rumus {
    public void Kubus(int a){
        int volume, luaspermukaan, sisi=a;

        volume = sisi * sisi * sisi;
        luaspermukaan = 6 * sisi * sisi;

        System.out.println("Volume: "+volume+"\nLuas Permukaan: "+luaspermukaan);
    }

    public void Balok(int a, int b, int c){
        double panjang=a, lebar=b, tinggi=c, volume, luaspermukaan;

        luaspermukaan = 2*(panjang*lebar + panjang*lebar + panjang*lebar);
        volume = panjang * lebar * tinggi;
        panjang = ((luaspermukaan/2)-lebar*tinggi)/lebar+tinggi;
        lebar = ((luaspermukaan/2)-panjang*tinggi)/panjang+tinggi;
        if(tinggi==0){
        tinggi = ((luaspermukaan/2)-panjang*lebar)/panjang+lebar;
        }
        System.out.println("\nVolume: "+volume+"\nLuas Permukaan: "+luaspermukaan+"\nPanjang: "+panjang+"\nLebar: "+tinggi);
    }

    public void Tabung(int a, int b){
        double tinggi=a, jarijari=b, diameter=b*2, phi=3.14, volume, luaspermukaan, luasselimut, luasalas, tanpatutup;

        jarijari = diameter/2;
        diameter = jarijari*2;
        volume = phi * jarijari * jarijari * tinggi;
        luaspermukaan = 2 * phi * jarijari * (jarijari+tinggi);
        luasselimut = 2 * phi * jarijari * tinggi;
        luasalas = phi * jarijari * jarijari;
        tanpatutup = luasalas + luasselimut;

        System.out.println("\nVolume: "+volume+"\nLuas Permukaan: "+luaspermukaan+"\nLuas Selimut: "+luasselimut+"\nLuas Alas: "+luasalas+"\nLuas Tanpa Tutup: "+tanpatutup+"\nJari-jari: "+jarijari+"\nDiameter: "+diameter);
    }

    public void Kerucut(int a, int b, int c){
        double tinggi=a, jarijari=b, garislukis=c, volume, luaspermukaan, luasalas, luasselimut, phi=3.14;

        luaspermukaan =(phi*jarijari*jarijari) + (phi*jarijari*garislukis);
        volume =(1/3) *  phi * jarijari * jarijari * tinggi;
        luasalas = phi * jarijari *jarijari;
        luasselimut = phi * jarijari * garislukis;

        System.out.println("\nVolume: "+volume+"\nLuas Permukaan: "+luaspermukaan+"\nLuas Alas: "+luasalas+"\nLuas Selimut: "+luasselimut);
    }

    public void LimasSegitiga(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l){
        double volume=l, luaspermukaan, tinggi=a, alassegitigaalas=i, tinggisegitigaalas=j, luas=k,  luasalas=h, luassegitiga1=e, luassegitiga2=f, luassegitiga3=g, alassegitiga1=b, alassegitiga2=c, alassegitiga3=d;
        luaspermukaan = luasalas + luassegitiga1 + luassegitiga2 + luassegitiga3;
        if (volume == 0){
            volume = 1/3 * luasalas * tinggi;
        }
        else if(tinggi == 0){
            tinggi = (6*volume)/(tinggisegitigaalas);
        }
        else if(luas == 0){
            luas= 1/2*alassegitiga1*tinggi;
            System.out.println("Luas Segitiga 1: "+luas);
        }
        else if(luas == 0){
            luas = 1.2*alassegitiga2*tinggi;
            System.out.println("Luas segitiga 2: "+luas);
        }
        else if(luas == 0 ){
            luas = 1/2 * alassegitiga3*tinggi;
            System.out.println("Luas Segitiga 3: "+luas);
        }
        else if(alassegitiga1 == 0){
            alassegitiga1 = (2*luas)/tinggi;
            System.out.println("Alas Segitiga 1: "+alassegitiga1);
        }
        else if(alassegitiga2==0){
            alassegitiga2= (1/2 *alassegitiga2)/tinggi;
            System.out.println("Alas Segitiga 2: "+alassegitiga2);
        }
        else if(alassegitiga3==0){
            alassegitiga3 = (1/2 * alassegitiga3)/tinggi;
            System.out.println("Alas Segitiga 3: "+alassegitiga3);
        }
        else if(alassegitigaalas==0){
            alassegitigaalas = (6*volume)/(tinggisegitigaalas*tinggi);
        }
        else if(tinggisegitigaalas==0){
            tinggisegitigaalas = (6*volume)/(alassegitigaalas*tinggi);
        }
        else if(luasalas==0){
            luasalas = 1/2 * alassegitigaalas * tinggisegitigaalas;
        }
        else if(luassegitiga1==0){
            luassegitiga1 = 1/2 * alassegitiga1 * tinggi;
        }
        else if(luassegitiga2==0){
            luassegitiga2 = 1/2 * alassegitiga2 * tinggi;
        }
        else if(luassegitiga3==0){
            luassegitiga3 = 1/2 * alassegitiga3 * tinggi;
        }
        System.out.println("\nVolume: "+volume+"\nLuas Permukaan: "+luaspermukaan+"\nTinggi: "+tinggi+"\nAlas Segitiga Alas: "+alassegitigaalas+"\nTinggi Segitiga Alas: "+tinggisegitigaalas+"\nLuas Alas: "+luasalas+"\nLuas Segitiga 1: "+luassegitiga1+"\nLuas Segitiga 2: "+luassegitiga2+"\nLuas Segitiga 3: "+luassegitiga3);

    }

    public void bola(int a){
        double volume, luaspermukaan,phi=3.14,jarijari=a,diameter=0;

        jarijari=diameter/2;
        volume=4/3*phi*jarijari*jarijari*jarijari;
        luaspermukaan=4*phi*jarijari*jarijari;

        System.out.println("\nVolume: "+volume+"\nLuas Permukaan: "+luaspermukaan);
    }
}

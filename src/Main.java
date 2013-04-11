
import java.util.Scanner;

public class Main {

    public static void main(String[] agrs) {
        // TODO code application logic here
        double jari, alas, tinggi, sisi, luas, panjang, lebar = 0;
        Bentuk obj;

        Scanner s = new Scanner(System.in);

        //menghitung persegi panjang
        System.out.println("Masukan Panjang : ");
        panjang = s.nextFloat();
        System.out.println("Masukan Lebar : ");
        lebar = s.nextFloat();
        persegipanjang pp = new persegipanjang(panjang, lebar);
        obj = pp;
        System.out.println("Luas persegi panjang :" + obj.luas() + "\n");

        //menghitung bujur sangkar
        System.out.println("Masukan sisi    : ");
        sisi = s.nextFloat();
        bujursangkar bs = new bujursangkar(sisi);
        obj = bs;
        System.out.println("Luas bujur sangkar  :" + obj.luas() + "\n");

        //menghitung segitiga
        System.out.println("Masukan alas    : ");
        alas = s.nextFloat();
        System.out.println("Masukan tinggi    : ");
        tinggi = s.nextFloat();
        segitiga st = new segitiga(alas, tinggi);
        obj = st;
        System.out.println("Luas segitiga  :" + obj.luas() + "\n");

        //menghitung lingkaran
        System.out.println("Masukan jari -jari    : ");
        jari = s.nextFloat();
        Lingkaran lk = new Lingkaran(jari);
        obj = lk;
        System.out.println("Luas lingkaran  :" + obj.luas() + "\n");
    }
}

import java.util.Scanner;
public class PrismaSegitiga {
    public static void main(String[]args) throws Exception{
        float a,b,t;
        System.out.print("\nPerhitungan Volume dari Prisma Segitiga \n\n");
        Scanner temp = new Scanner (System.in);
        System.out.print("Masukkan alas pertama Prisma Segitiga : ");
        a = temp.nextInt();
        System.out.print("Masukkan alas kedua Prisma Segitiga : ");
        b = temp.nextInt();
        System.out.print("Masukkan tinggi Prisma Segitiga : ");
        t = temp.nextInt();
        float vol = a*b*t*1/2;
        System.out.print("\nPanjang alas pertama Prisma Segitiga adalah : "+a);
        System.out.print("\nPanjang alas kedua Prisma Segitiga adalah : "+b);
        System.out.print("\nTinggi Prisma Segitiga adalah : "+t);
        System.out.print("\nVolume Prisma Segitiga adalah : "+vol);
        temp.close();
    }
}
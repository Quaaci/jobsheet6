import java.util.Scanner;

public class Pemilihan2Percobaan127 {
    public static void main(String[] args) {
        Scanner Input08 = new Scanner(System.in);
        
        int tahun;

        System.out.print("Masukkan tahun = ");
        tahun = Input08.nextInt();

        // if ((tahun % 4) == 0) {
        //     if ((tahun % 100) != 0) 
        //         System.out.println("tahun kabisat");    
        // }else {
        //     System.out.println("Bukan tahun kabisat");
        // }


        // if ((tahun % 4) == 0) {
        //     if ((tahun % 100) != 0) {
        //         System.out.println("tahun kabisat"); 
        //     } else {
        //         System.out.println("Tahun tersebut bukanlah tahun kabisat");
        //     }
        // }else {
        //     System.out.println("Bukan tahun kabisat");
        // }


        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun " + tahun + " merupakan tahun kabisat"); 
            } else if((tahun % 400) == 0) {
                System.out.println("Tahun " + tahun + "  merupakan tahun kabisat");
            } else {
                System.out.println("Tahun " + tahun + "  bukan merupakan tahun kabisat");
            }
                 
        }else {
            System.out.println("Tahun "+ tahun + " Bukan tahun kabisat");
        }
    }
}
import java.util.Scanner;

public class Main {

    static String[][] arrItem;
    static int[] stokItem;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {


    }

    static void pilihMenu(){
        System.out.println("===== MENU INVENTORI KAFE =====");
        System.out.println("1. Tampilkan Inventori");
        System.out.println("2. Tambah Stok untuk Item yang Ada");
        System.out.println("3. Tambah Item Baru");
        System.out.println("5. Keluar");
        int pilihMenu = sc.nextInt();

        if (pilihMenu == 1){
            tampilMenu();
        }
        else if (pilihMenu == 2){
            tambahStok();
        }
        else if (pilihMenu == 3){
            tambahItemBaru();
        }
        else if (pilihMenu == 5){
            System.exit(0);
        }

    }

    static void tampilMenu(){}

    static int tambahStok(){return 0;}
    static void tambahItemBaru(){};
}

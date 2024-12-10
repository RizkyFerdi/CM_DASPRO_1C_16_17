import java.util.Scanner;

public class Main {
    static String[] kolom ={"No","Nama Item","Kategori","Stok"};
    static String[][] arrItem={{ "Kopi","Minuman" },{ "Teh","Minuman" },{ "Susu","Minuman" }};
    static int[] stokItem={3,4,5};
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        pilihMenu();

    }

    static void pilihMenu(){
        System.out.println("===== MENU INVENTORI KAFE =====");
        System.out.println("1. Tampilkan Inventori");
        System.out.println("2. Tambah Stok untuk Item yang Ada");
        System.out.println("3. Tambah Item Baru");
        System.out.println("5. Keluar");
        int pilihMenu = sc.nextInt();

        if (pilihMenu == 1){
            tampilMenu(arrItem,stokItem,kolom);
        }
        else if (pilihMenu == 2){
            tambahStok();
        }
        else if (pilihMenu == 3){
            for (int i = 0; i < arrItem.length; i++) {
                
            }
             tambahItemBaru();
        }
        else if (pilihMenu == 5){
            System.exit(0);
        }

    }

    static void tampilMenu(String[][] arrItem,int[] stokItem,String[] kolom){
        int nomer=0;
        int stok=0;
        System.out.println("No   Nama Item       Kategori       Stok");
        System.out.println("----------------------------------------");
        for (int i = 0; i < kolom.length-1; i++) {
            for (int j = 0; j < arrItem[i].length; j++) {
                if (j==0) {
                    System.out.print((++nomer)+"    ");
                    
                }
                System.out.print(arrItem[i][j]);
                for (int j2 = String.valueOf(arrItem[i][j]).length(); j2 < 16; j2++) {
                    System.out.print(" ");
                }
            }
                System.out.println(stokItem[stok++]);
            
        }
        System.out.println();
        pilihMenu();
    }

    static int tambahStok(){return 0;}
    static void tambahItemBaru(){};
}

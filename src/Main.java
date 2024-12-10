import java.util.Scanner;

public class Main {
    static String[] kolom = { "No", "Nama Item", "Kategori", "Stok" };
    static String[][] arrItem = new String[10][2];
    static {
        arrItem[0] = new String[] { "Kopi Hitam", "Minuman" };
        arrItem[1] = new String[] { "Cappucino", "Minuman" };
        arrItem[2] = new String[] { "Teh Tarik", "Minuman" };
    }
    static int[] stokItem = new int[10];
    static {
        stokItem[0] = 10;
        stokItem[1] = 5;
        stokItem[2] = 8;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        pilihMenu();

    }

    static void pilihMenu() {
        System.out.println("===== MENU INVENTORI KAFE =====");
        System.out.println("1. Tampilkan Inventori");
        System.out.println("2. Tambah Stok untuk Item yang Ada");
        System.out.println("3. Tambah Item Baru");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu: ");
        int pilihMenu = sc.nextInt();

        if (pilihMenu == 1) {
            tampilMenu();
        } else if (pilihMenu == 2) {
            tambahStok();
        } else if (pilihMenu == 3) {
            for (int i = 0; i < arrItem.length; i++) {

            }
            tambahItemBaru();
        } else if (pilihMenu == 5) {
            System.exit(0);
        }

    }

    static void tampilMenu() {
        int nomer = 0;
        int stok = 0;
        System.out.println("No   Nama Item       Kategori        Stok");
        System.out.println("------------------------------------------");
        for (int i = 0; i < arrItem.length; i++) {
            for (int j = 0; j < arrItem[i].length; j++) {
                if (arrItem[i][j] != null) {
                    if (j == 0) {
                        System.out.print((++nomer) + "    ");
                    }
                    System.out.print(arrItem[i][j]);
                    for (int j2 = String.valueOf(arrItem[i][j]).length(); j2 < 16; j2++) {
                        System.out.print(" ");
                    }
                }
            }
            if (arrItem[i][0] != null) {

                System.out.println(stokItem[stok++]);
            }

        }
        System.out.println();
        pilihMenu();
    }

    static int tambahStok() {
        System.out.print("Masukkan Nomor Item: ");
        int noItem = sc.nextInt();
        System.out.print("Masukkan Jumlah Stok yang Ingin Ditambahkan: ");
        int stokBaru = sc.nextInt();
        for (int i = 0; i < arrItem.length; i++) {
            if (noItem - 1 == i && arrItem[i][0] != null && stokBaru > 0) {
                stokItem[i] += stokBaru;
                break;
            } else {
                System.out.println("Item Tidak Ada / Jumlah Stok Tidak Valid");
                break;
            }
        }
        pilihMenu();
        return stokItem[noItem];
    }

    static void tambahItemBaru() {
        if (arrItem[9][0] != null) {
            System.out.println("Jumlah item sudah mencapai batas maksimal");
            pilihMenu();
        }
        System.out.print("Masukkan Nama Item Baru: ");
        String itemBaru = sc.nextLine();
        itemBaru = sc.nextLine();
        System.out.print("Masukkan Kategori Item Baru: ");
        String kategori = sc.nextLine();
        System.out.print("Masukkan Jumlah Stok Awal: ");
        int stokBaru = sc.nextInt();

        if(stokBaru <= 0 ){
            System.out.println("Stok tidak valid");
            pilihMenu();
        }

        for (int i = 0; i < arrItem.length; i++) {
            if (arrItem[i][0] == null ) {
                arrItem[i][0] = itemBaru;
                arrItem[i][1] = kategori;
                stokItem[i] = stokBaru;
                System.out.println("Item berhasil ditambahkan.");
                break;
            } 
        }
        pilihMenu();

    };
}

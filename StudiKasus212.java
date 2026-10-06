import java.util.Scanner;

public class StudiKasus212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine().trim().toLowerCase();

        if (jenisKegiatan.equals("belmawa") || jenisKegiatan.equals("bakorma") || jenisKegiatan.equals("mandiri")) {
            System.out.print("Jumlah dokumen  : ");
            int jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkatJuara = sc.nextInt();
            if (jumlahDokumen >= 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + peringkatJuara + ").");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            } else {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + (4-jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");

            }
        } else if (jenisKegiatan.equals("pkm")) {
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak lolos) : ");
            int lolos = sc.nextInt();
            if (jumlahDokumen >= 4) {
                    if (lolos ==1) {
                        System.out.println("Status : Berhak memperoleh dana penghargaan (PKM diterima).");
                    } else {    
                        System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak diterima).");
                    }
            } else {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + (4-jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else if (jenisKegiatan.equals("lainnya")) {
            System.out.println("Status : tidak memperoleh dana penghargaan (kegiatan tidak termasuk BELMAWA/BAKORMA/MANDIRI/PKM).");
        } else {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }
    }
}
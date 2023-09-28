public class data {
    public static void main(String[] args) {
        String nama = "Muhammad Rahardian Baibaqi";
        int nim = 1237050023;
        double nilaiTugas = 97.5;
        double nilaiUTS = 95.5;
        double nilaiUAS = 92.5;
        double nilaiAkhir = nilaiTugas * 30/100 + nilaiUTS * 30/100 + nilaiUAS * 40/100;

        System.out.println("===== Data Nilai Mahasiswa =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS : " + nilaiUTS);
        System.out.println("Nilai UAS : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("===== SEMANGAT BELAJAR ======");

        if (nilaiAkhir > 85) {
            System.out.println(nama + " LULUS");
        } else {
            System.out.println(nama + " GAGAL");
        }
    }
}

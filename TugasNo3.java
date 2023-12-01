public class TugasNo3{
    public static int jumlahPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return bulan; 
        } else if (bulan == 12) {
            return 144;
        }
        return jumlahPasanganMarmut(bulan - 1) + jumlahPasanganMarmut(bulan - 2);
    }

    public static void main(String[] args) {
        int bulan = 12; 
        int jumlahPasangan = jumlahPasanganMarmut(bulan);
        System.out.println("Pada bulan ke-" + bulan);
        System.out.println("Jumlah pasangan marmut adalah: " + jumlahPasangan);
    }
}
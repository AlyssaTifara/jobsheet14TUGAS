import java.util.Scanner;
public class TugasNo2 {
    public static boolean cekPrimaRekursif(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return cekPrimaRekursif(n, i + 1);
    }
    public static void main(String[] args) {
        int bilangan = 6; 

        boolean hasil = cekPrimaRekursif(bilangan, 2);
        if (hasil) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}
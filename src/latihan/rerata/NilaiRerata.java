package latihan.rerata;
import java.util.Scanner;
public class NilaiRerata {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Masukan Banyaknya Mahasiswa : ");
		int n = reader.nextInt();
		float rerata=0;
		int[] nilai = new int[n];
		for (int i = 0; i < n; i++) 
		{
			System.out.print("Nilai Mahasiswa ke-"+ (i+1) + " : ");
			nilai[i] = reader.nextInt();
			rerata += nilai[i];
		}
		rerata /= n;
		System.out.println("Maka, Rata-rata Nilainya adalah "+rerata);
		System.out.println("Developed by : Wildan Muhammad Fikri");
		reader.close();
	}

}

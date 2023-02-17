*HI

Program segitiga adalah sebuah program komputer yang menghasilkan pola segitiga menggunakan angka-angka atau karakter-karakter tertentu. Pola segitiga yang dihasilkan dapat berupa segitiga Pascal, segitiga Floyd, segitiga bilangan ganjil, segitiga karakter, dan masih banyak lagi.

Program segitiga biasanya dibuat menggunakan bahasa pemrograman, seperti C, C++, Java, Python, dan lain-lain. Program tersebut menerima input dari pengguna, seperti jumlah baris atau jenis segitiga yang diinginkan, dan kemudian menghasilkan output dalam bentuk pola segitiga.

Contoh sederhana dari program segitiga adalah program segitiga bilangan ganjil. Program ini menghasilkan segitiga dengan baris pertama berisi angka ganjil 1, baris kedua berisi angka ganjil 3 dan 5, baris ketiga berisi angka ganjil 7, 9, dan 11, dan seterusnya.

Berikut contoh programnya: 

		import java.util.Scanner;

		public class SegitigaBilanganGanjil {
    			public static void main(String[] args) {
        			Scanner input = new Scanner(System.in);
        
        			System.out.print("Masukkan jumlah baris: ");
        			int n = input.nextInt();
        
        			for (int i = 1; i <= n; i++) {
            				for (int j = 1; j <= i * 2 - 1; j++) {
                				if (j <= i) {
                    					System.out.print(j * 2 - 1 + " ");
                				} else {
                    					System.out.print((i * 2 - j) * 2 - 1 + " ");
                				}
            				}
            				System.out.println();
        			}
    			}
		}


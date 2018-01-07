import java.util.Scanner;
 public class P { 
   public static void main (String [] args) {
	   Scanner masuk = new Scanner (System.in);
	   int JenisEnergi, x;
	   double m,g=9.8,h,v,Ep,Ek,Em;
	   do{
	   System.out.print("================== PERSAMAAN ENERGI ==================\nEnergi adalah kemampuan untuk melakukan usaha dan terdiri dari beberapa jenis:\n1.Energi Potensial\n2.Energi Kinetik \n3.Energi Mekanik\n Silahkan Pilih Jenis Energi yang ingin anda hitung: ");
	   JenisEnergi= masuk.nextInt();
	   switch (JenisEnergi) {
		case 1:
			System.out.println("Energi Potensial, merupakan energi yang dimiliki benda karena kedudukannya, misal berada pada ketinggian tertentu.");
			System.out.print("masukkan massa : ");
			m= masuk.nextDouble();
			System.out.println("gravitasi = 9,8m/s");
			System.out.print("masukkan ketinggian : ");
			h= masuk.nextDouble();
			Ep=m*g*h;		
			System.out.println("Energi Potensial : "+Ep+"joule");
			break;
		case 2:
			System.out.println("Energi kinetik, merupakan energi yang dimiliki benda karena gerakannya.");
			System.out.print("masukkan massa : ");
			m= masuk.nextDouble();
			System.out.print("masukkan kecepatan : ");
			v=masuk.nextDouble();
			Ek=0.5*m*v*v;
			System.out.println("Energi Kinetik : "+Ek+" joule");
			break;
		case 3:
			System.out.println("Energi Mekanik, merupakan energi total yang di	miliki benda sebagai penjumlahan dari energi potensial dan energi kinetik");
			System.out.print("masukkan Ep : ");
			Ep= masuk.nextDouble();
			System.out.print("masukkan Ek: ");
			Ek= masuk.nextDouble();
			Em=Ep+Ek;
			System.out.print("Energi Mekanik : "+Em+" Joule");
			break;
		default :
			System.out.println("\n Maaf Input yang anda masukkan salah");
			} 	

			System.out.print("\n Ingin menghitung lagi?\n tekan 0 jika ya dan tekan sembarangan tombol jika tidak : ");
			x=masuk.nextInt();
			} while (x==0);
			System.out.println("Terima Kasih Sudah Mencoba Kalkulator Energi Saya :)");
	}
 }
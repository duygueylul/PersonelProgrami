package PersonelProgrami;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Çalışanlar Programına Hoşgeldiniz...");
		
		
		
		String islem = "İşlemler...\n" + "1. Programcı İşlemleri..\n" + "2. Yönetici İşlemleri.." + "3. Çıkış İçin x'e Basınız.. " ;
		
		System.out.println("*************************");
		System.out.println(islem);
		System.out.println("*************************");

		
		
		while(true) {
			System.out.println("İşlem Seçiniz: ");
			String görev = scan.nextLine();
			
			
			
			if(görev.equals("x")){
				System.out.println("Programdan Çıkış Yapılıyor...");
				break;
			}
			else if(görev.equals("1")){
				Programci yazilimci = new Programci("Duygu", "Eylül", 508, "C++, Java, Python");
				
				
				String prog_islem = "1. Format At..\n" + "2. Bilgileri Göster..\n" + "Çıkış İçin x'e Basınız..\n";
				System.out.println(prog_islem);
				
				
				while(true) {
					System.out.println("İşlem Seçiniz...");
					String y_islem = scan.nextLine();
					
					
					
					if(y_islem.equals("x")) {
						System.out.println("Programcı İşlemlerinden Çıkılıyor....");
						break;
						
					}
					else if(y_islem.equals("1")){
						System.out.println("İşletim Sistemi: ");
						String i_Sistemi = scan.nextLine();
						yazilimci.formatAt(i_Sistemi);
					}
					else if(y_islem.equals("2")) {
						yazilimci.BilgiGöster();
					    
					}
					else {
						System.out.println("Geçersiz İşem...");
					}
				}
			}
			
			else if(görev.equals("2")) {
				
				Yönetici yönetici = new Yönetici("Ali", "Veli", 321, 96);
				String yönet_islem = "Yönetici İşlemleri\n" + "1. Zam Yap\n" + "2. Bilgileri Göster\n" + "Çıkış Yapmak İçin x'eBasınız...";
				System.out.println(yönet_islem = scan.nextLine());
				
				
				
				while(true) {
					System.out.println("İşem Seçiniz: ");
					String y_islem = scan.nextLine();
					
					
					
					if(y_islem.equals("x")) {
						System.out.println("Yönetici İşlemlerinden Çıkılıyor......");
						break;
					}
					else if(y_islem.equals("1")) {
						System.out.println("Yöneticinin Ne Kadar Zam Yapmasını İstiyorsunuz: ");
						int zamMiktar = scan.nextInt();
						scan.nextLine();
						yönetici.zamYap(zamMiktar);
					}
					else if(y_islem.equals("2")) {
						yönetici.BilgiGöster();
					}
					else {
						System.out.println("Geçersiz İşlem...");
					}
				}
			}
			else {
				System.out.println("Geçersiz İşlemler......");
			}
			
			
		}
		
	
	}

}

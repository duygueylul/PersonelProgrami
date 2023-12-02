package PersonelProgrami;

public class Programci extends Personel {
	
	
	private String diller;
	
	public Programci(String isim, String soyisim, int ID, String diller) {
		super(isim, soyisim, ID);
		this.diller = diller;
	}
	
	public void formatAt(String i_Sistemi) {
		System.out.println(getİsim() + " " +i_Sistemi + " 'ni Yüklüyor...");
	}
	
	public void BilgiGöster() {
		super.BilgiGöster();
		System.out.println("Programcının Bildiği Diller: " + diller);
	}
	

}

package PersonelProgrami;

public class Personel {
	
	private String isim;
	private String soyisim;
	private int ID;
	
	
	
	public  Personel(String isim, String soyisim, int ID) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.ID = ID;
	}
	
	
	public void BilgiGöster() {
		System.out.println("Bilgileri Göster...");
		System.out.println("İsim: " + isim);
		System.out.println("Soyisim: " + soyisim);
		System.out.println("ID: " + ID);
	}
	
	
	public String getİsim() {
		return isim;
	}
	
	
	public void setİsim(String isim) {
		this.isim = isim;
	}
	
	
	public String getSoyisim() {
		return soyisim;
	}
	
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	
	}

package PersonelProgrami;

public class Yönetici extends Personel {
	
	private int sorumlu_Kisi_s;
	
	
	public Yönetici(String isim, String soyisim, int ID, int Sorumlu_Kisi_s) {
		super(isim, soyisim, ID);
		this.sorumlu_Kisi_s = sorumlu_Kisi_s;
		
	}
	
	public void BilgiGöster() {
		super.BilgiGöster();
		System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı: " + sorumlu_Kisi_s);
	}
	
	public void zamYap(int zamMiktar) {
		System.out.println(getİsim() + "Çalışanlara " + zamMiktar + " kadar zam yapılıyot...");
	}

}

public class Mudur {
	public String isim;
	public String soyisim;
	private String TCNo;
	public String sicilNo;
	private double maas;

	private Okul okul;

	public Mudur(String isim, String soyisim, String TCNo, String sicilNo, double maas) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.TCNo = TCNo;
		this.sicilNo = sicilNo;
		this.maas = maas;

	}

	// getter ve setter - accessors
	public void setMaas(double maas) // Maasi ayarla
	{
		this.maas = maas;
	}

	public double getMaas() // Maasi getir
	{
		return this.maas;
	}

	public void setTCNo(String TCNo) // TCNo ayarla
	{
		this.TCNo = TCNo;
	}

	public String getTCNo() // TCNO getir
	{
		return this.TCNo;
	}

	public void setIsim(String isim) // isim ayarla
	{
		if (!isim.matches("((\\w)*(\\d)+(\\w)*)+"))
			this.isim = isim;
		else
			System.out.println("Isimler rakam iceremez");
	}

	public String getIsim() // isim getir
	{
		return this.isim;
	}

	public void setSoyIsim(String soyisim) // isim ayarla
	{
		this.soyisim = soyisim;
	}

	public String getSoyIsim() // isim getir
	{
		return this.soyisim;
	}

	public void setOkul(Okul okul) // isim ayarla
	{
		this.okul = okul;
	}

	public Okul getOkul() // isim getir
	{
		return this.okul;
	}
}

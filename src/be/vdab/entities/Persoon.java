package be.vdab.entities;

public class Persoon {

	public Persoon(String voornaam, String familienaam, int aantalKinderen, boolean gehuwd, Adres adres) {
		setVoornaam(voornaam);
		setFamilienaam(familienaam);
		setAantalKinderen(aantalKinderen);
		setGehuwd(gehuwd);
		setAdres(adres);
	}

	public Persoon() { // default constructor
	}

	private String voornaam;
	private String familienaam;
	private int aantalKinderen;
	private boolean gehuwd;
	private Adres adres;

	public String getVoornaam() {
		return voornaam;
	}

	public String getFamilienaam() {
		return familienaam;
	}

	public int getAantalKinderen() {
		return aantalKinderen;
	}

	public boolean isGehuwd() {
		return gehuwd;
	}
	
	public Adres getAdres() {
		return adres;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}

	public void setAantalKinderen(int aantalKinderen) {
		this.aantalKinderen = aantalKinderen;
	}

	public void setGehuwd(boolean gehuwd) {
		this.gehuwd = gehuwd;
	}
	
	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public String getNaam() {
		return voornaam + ' ' + familienaam;
	}
}
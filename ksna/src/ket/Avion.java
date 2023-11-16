package ket;

public class Avion extends Vozilo {
	public String KlasaAviona;

	public void KlasaAviona() {

	}

	public double NaplataPutarine() {
		if (KlasaAviona.contains("biznis")) {
			CenaPutarine = CenaPutarine * 0.25;
		}
		if (KlasaAviona.contains("ekonomska")) {
			CenaPutarine = CenaPutarine * 0.15;
		}
		return CenaPutarine;
	}

	public String getKlasaAviona() {
		return KlasaAviona;
	}

	public void setKlasaAviona(String klasaAviona) {
		KlasaAviona = klasaAviona;
	}
}

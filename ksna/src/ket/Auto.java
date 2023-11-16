package ket;

public class Auto extends Vozilo {
	public int BrojPutnika;

	public void BrojPutnika() {

	}

	public double NaplataPutarine() {
		return CenaPutarine = CenaPutarine + (BrojPutnika / 10) * CenaPutarine;
	}

	public int getBrojPutnika() {
		return BrojPutnika;
	}

	public void setBrojPutnika(int brojPutnika) {
		BrojPutnika = brojPutnika;
	}
}

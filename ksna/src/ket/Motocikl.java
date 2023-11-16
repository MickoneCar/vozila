package ket;

public class Motocikl extends Vozilo {
	public int BrojVozaca;

	public void BrojVozaca() {

	}

	public double NaplataPutarine() {
		if (BrojVozaca == 1) {
			CenaPutarine = CenaPutarine * 0.8;
		} else {
			CenaPutarine = CenaPutarine * 0.7;
		}

		return CenaPutarine;
	}

	public int getBrojVozaca() {
		return BrojVozaca;
	}

	public void setBrojVozaca(int brojVozaca) {
		BrojVozaca = brojVozaca;
	}
}

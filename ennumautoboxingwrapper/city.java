package ennumautoboxingwrapper;

public enum city {
chennai(11),mumbai(22),hyd(11),vizag(355);
	private int population;

	private city(int population) {
		this.population = population;
	}
	int getpopulation() {
		return population;
	}

}


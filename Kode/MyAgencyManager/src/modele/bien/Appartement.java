package modele.bien;

public class Appartement extends Bien {
	private int nbPiece;
	private int etage;
	private double chargeMensuelles;
	private double surface;
	
	protected Appartement(int id, String Addresse, Orientation o,int nP, int e,double cM, double s) {
		super(id, Addresse, o);
		this.chargeMensuelles = cM;
		this.etage = e;
		this.nbPiece = nP;
		this.surface = s;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public double getChargeMensuelles() {
		return chargeMensuelles;
	}

	public void setChargeMensuelles(double chargeMensuelles) {
		this.chargeMensuelles = chargeMensuelles;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

}

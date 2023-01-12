package day4;

public class Dipendente {

	public int stipendioBase = 1000;
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;

	public Dipendente(int matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}

	public Dipendente( int matricola, double stipendio, double importoOrarioStraordinario,
			Livello livello, Dipartimento dipartimento) {

		
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}

	public int getStipendioBase() {
		return stipendioBase;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {

		return stipendio;
	}

	public double setImportoOrarioStraordinario() {

		return importoOrarioStraordinario;
	}

	public Livello getLivello() {
		return livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	
	public void StampaDatiDipendente() {
		System.out.println("Il dipendente " + this.matricola + " Ha uno stipendio di " + this.stipendio + "");
		System.out.println("Lavora come " + this.livello + "nell'ambito di/delle " + this.dipartimento );
	}
	
	public Livello promuovi() {
		switch(this.livello) {
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio *= 1.2;
		break;
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio *= 1.5;
			break;
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio *=  2;
			break;
			default: 
				System.out.println("Errore non puoi salire di livello!");
		}
		return this.livello;
	}
	
	public static double calcolaPaga(Dipendente dipendente) {
		
		return dipendente.stipendio;
	}
	
	public static double calcolaPagaStraordinari(Dipendente dipendente, int ore) {
		dipendente.stipendio += (ore * dipendente.importoOrarioStraordinario);
		return dipendente.stipendio;
	}
}

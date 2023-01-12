package day4;

public class GestioneDip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dipendente op1 = new Dipendente(123,Dipartimento.PRODUZIONE);
		Dipendente op2 = new Dipendente(254, Dipartimento.PRODUZIONE);
		Dipendente imp3 = new Dipendente(890,1500,25,Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dir4 = new Dipendente(993,2000,25,Livello.DIRIGENTE, Dipartimento.AMMINISTRAZIONE);
		
		op1.StampaDatiDipendente();
		op2.StampaDatiDipendente();
		imp3.StampaDatiDipendente();
		dir4.StampaDatiDipendente();
		
		op2.promuovi();
		System.out.println("Complimenti sei stato promosso a " + op2.getLivello());
		System.out.println(Dipendente.calcolaPagaStraordinari(op2, 5));
		
		imp3.promuovi();
		System.out.println("Complimenti sei stato promosso a " + imp3.getLivello());
		System.out.println(Dipendente.calcolaPagaStraordinari(imp3, 5));
		
		dir4.promuovi();
		System.out.println(dir4.getLivello());
		System.out.println(Dipendente.calcolaPagaStraordinari(dir4, 5));
	}

}

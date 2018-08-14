package cursoCucumber.services;

import java.util.Calendar;

import cursoCucumber.entidades.Filme;
import cursoCucumber.entidades.NotaAluguel;

public class AluguelService {
	
	public NotaAluguel alugar(Filme filme) {
		NotaAluguel nota = new NotaAluguel();
		nota.setPreco(filme.getAluguel());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		nota.setDataEntrega(cal.getTime());
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
		
	}

}

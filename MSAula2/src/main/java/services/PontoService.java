package services;

import org.springframework.stereotype.Component;

import models.Ponto;
import modelsView.FuncionarioViewModel;

@Component
public class PontoService {

	public FuncionarioViewModel funcionario() {
		
		FuncionarioViewModel Funcionario = new FuncionarioViewModel();
		return Funcionario;
	}
	
	public Ponto ponto(FuncionarioViewModel fun) {
		Ponto pt = new Ponto();
		pt.setDate("14/01/2020");
		pt.setTime("13-00-00");
		pt.setFuncionario(fun);
		return pt;
	}

}

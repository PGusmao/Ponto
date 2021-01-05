package models;

import modelsView.FuncionarioViewModel;

public class Ponto {
	
	private String Time;
	private String Date;
	public FuncionarioViewModel funcionario;
	
	
	
	public FuncionarioViewModel getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(FuncionarioViewModel funcionario) {
		this.funcionario = funcionario;
	}


	public String getTime() {
		return Time;
	}


	public void setTime(String time) {
		Time = time;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}

}

package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import models.Ponto;
import modelsView.FuncionarioViewModel;
import services.PontoService;


@RestController
@RequestMapping(value = "/ponto")
public class PontoController {

	@Autowired
	PontoService pontoService;
	
	@GetMapping(value = "/")
	Ponto GetPonto() {
		RestTemplate restT = new RestTemplate();
		FuncionarioViewModel fun = restT.getForObject("http://localhost:9001/funcionarios/1/dados", FuncionarioViewModel.class);
		Ponto pt = pontoService.ponto(fun);
		
		return pt;	
	}
	@GetMapping(value = "/teste")
	String test() {
		return "ok";
	}
	
}

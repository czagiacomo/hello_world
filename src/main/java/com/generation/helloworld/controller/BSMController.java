package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BSMController {
	
	@GetMapping
	public String bsmGeneration() {
		return "<H1> BSM Generation"
				+ "<H2>Mentalidades:"
				+ "<H4>• Orientação ao futuro <br>"
				+ "• Persistência<br>"
				+ "• Responsabilidade Pessoal<br>"
				+ "• Mentabilidade de Crescimento<br>"
				+ "<H2>Competências comportamentais:"
				+ "<H4>• Comunicação<br>"
				+ "• Proatividade<br>"
				+ "• Orientação ao Detalhe<br>"
				+ "• Trabalho em equipe";
	}	

}
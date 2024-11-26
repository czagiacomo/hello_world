package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class ObjetivosController {
	
	@GetMapping
	public String objetivosGeneration() {
		return "<H1> Objetivos da Semana"
				+ "<H2>Profissionais:"
				+ "<H4>• Criar um bom currículo <br>"
				+ "• Me aplicar a vagas de tecnologia<br>"
				+ "• Aprender a criar APIs com Java>"
				+ "<H2>Pessoais:"
				+ "<H4>• Melhorar minha gestão de tempo<br>"
				+ "• Organizar melhor minha rotina diária<br>"
				+ "• Analisar quais pontos posso buscar melhorar";
	}	
	
}

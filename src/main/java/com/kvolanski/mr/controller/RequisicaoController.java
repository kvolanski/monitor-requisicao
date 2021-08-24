package com.kvolanski.mr.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kvolanski.mr.model.RequisicaoModel;

import repositoy.RequisicaoRepository;

@RestController
@RequestMapping("/requisicoes")
public class RequisicaoController {

	@Autowired
	RequisicaoRepository requisicaoRepository;
	
    final static Logger logger = Logger.getLogger(RequisicaoController.class);
    
	@PostMapping
	public String test(@RequestBody String string) {
		
		logger.info(string);
		
		return string;
	}
	
	
	
	
	
	@RequestMapping(value="/nome", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteByNome(@PathVariable String nome) {			
		RequisicaoModel requisicao = requisicaoRepository.findByNome(nome);			
		requisicaoRepository.delete(requisicao);
		return ResponseEntity.noContent().build();
	}
	
}

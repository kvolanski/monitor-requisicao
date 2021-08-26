package com.kvolanski.mr.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvolanski.mr.model.RequisicaoModel;
import com.kvolanski.mr.repositoy.RequisicaoRepository;

@RestController
@RequestMapping("/requisicoes")	
public class RequisicaoController {

	@Autowired
	RequisicaoRepository repository;

	final static Logger logger = Logger.getLogger(RequisicaoController.class);

	@GetMapping
	public List<RequisicaoModel> getAll(){
		return repository.findAll();
	}

	@PostMapping
	public RequisicaoModel insert(@RequestBody RequisicaoModel requisicaoModel) {
		return repository.save(requisicaoModel);
	}

	@GetMapping(path = { "/{nome}" })
	public Optional<RequisicaoModel> find(@PathVariable String nome) {
		return repository.findByNome(nome);
	}
		
	@DeleteMapping(path ={"/{nome}"})
	public ResponseEntity <?> delete(@PathVariable String nome) {		
	   return repository.findById(repository.findByNome(nome).get().getId())
	           .map(record -> {
	               repository.deleteById(repository.findByNome(nome).get().getId());
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}
	



}

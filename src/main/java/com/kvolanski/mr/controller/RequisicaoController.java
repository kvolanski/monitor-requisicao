package com.kvolanski.mr.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
	public ResponseEntity<RequisicaoModel> save(@RequestBody @Valid RequisicaoModel requisicaoModel) {
		return new ResponseEntity<RequisicaoModel>(repository.save(requisicaoModel), HttpStatus.CREATED);
	}

	@GetMapping(path = { "/{nome}" })
	public Optional<RequisicaoModel> find(@PathVariable String nome) {
		return repository.findByNome(nome);
	}
			
	@DeleteMapping(path ={"/{nome}"})
	public ResponseEntity<?> delete(@PathVariable(value="nome") String nome) {
		Optional<RequisicaoModel> req = repository.findByNome(nome);
		if(!req.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			repository.delete(req.get());
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}

	@PutMapping(path ={"/{nome}"})
	public ResponseEntity<RequisicaoModel> update(@PathVariable String nome,
			@RequestBody RequisicaoModel requisicaoModel) {
		Optional<RequisicaoModel> req =  repository.findByNome(nome);
		if(!req.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			requisicaoModel.setId(req.get().getId());
			return new ResponseEntity<RequisicaoModel> (repository.save(requisicaoModel), HttpStatus.OK);
		}
	}




}

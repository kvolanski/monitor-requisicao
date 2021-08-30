package com.kvolanski.mr.repositoy;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.kvolanski.mr.model.RequisicaoModel;

@Repository
public interface RequisicaoRepository extends JpaRepository<RequisicaoModel, Long> {

	Optional<RequisicaoModel> findByNome(String nome);

	ResponseEntity<RequisicaoModel> deleteById(Optional<RequisicaoModel> requisicaoModel);

	RequisicaoModel save(Optional<RequisicaoModel> req);

}

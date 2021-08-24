package repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kvolanski.rest.model.RequisicaoModel;

@Repository
public interface RequisicaoRepository extends JpaRepository<RequisicaoModel, Long> {

	Object deleteByNome(String nome);

	RequisicaoModel findByNome(String nome);

}

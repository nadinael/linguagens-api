package br.com.nadinael.linguagensapi.principal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
    
}

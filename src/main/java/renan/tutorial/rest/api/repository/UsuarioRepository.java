package renan.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import renan.tutorial.rest.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{
}

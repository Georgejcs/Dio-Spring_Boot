package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
	public void save(Usuario usuario) {
		if(usuario.getLogin()==null)
			throw new CampoObrigatorioException("login");
		if(usuario.getPassword()==null)
			throw new CampoObrigatorioException("password");
		if(usuario.getId()==null)
			System.out.println("SAVE = Recebendo o usuário na camada de repositório");
		else
			System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
		
		System.out.println(usuario);
	}
	
	public void deleteById(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
		System.out.println(id);
	}
	
	public List<Usuario> findAll() {
		System.out.println("List - Listando os usuários do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("george", "password"));
		usuarios.add(new Usuario("frank", "masterpass"));
		return usuarios;
	}
	
	public Usuario findById(Integer id) {
		System.out.println(String.format("Find/id - Recebendo o id: %d para localizar um usuário", id));
		return new Usuario("george", "password");
	}
	
	public Usuario findByUsername(String username) {
		System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
		return new Usuario("george", "password");
	}
}

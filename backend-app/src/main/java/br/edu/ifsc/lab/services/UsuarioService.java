package br.edu.ifsc.lab.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifsc.lab.domain.Usuario;
import br.edu.ifsc.lab.repository.UsuarioRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository rep;

	public Usuario find(Integer id) throws ObjectNotFoundException {
		Optional<Usuario> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"" + "Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
	}

}

package br.edu.ifsc.lab.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifsc.lab.domain.Estado;
import br.edu.ifsc.lab.repository.EstadoRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class EstadoService {

	/*
	 * Declarar uma dependencia de um objeto do tipo EstadoRepository Para
	 * instanciar esse repositorio usa @Autowired,com isso essa dependencia vai ser
	 * automaticamente instanciada pelo Spring
	 */

	@Autowired
	private EstadoRepository rep;

	/*
	 * Criar uma operação capaz de buscar uma categoria por código
	 */
	public Estado find(Integer id) throws ObjectNotFoundException {
		Optional<Estado> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"" + "Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}
}

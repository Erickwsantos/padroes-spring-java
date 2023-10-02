package erick.inovation.padroesprojetospring.service;

import org.springframework.stereotype.Repository;

import erick.inovation.padroesprojetospring.model.Cliente;

@Repository
public interface IClienteService {
    Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
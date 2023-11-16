package org.example.services;

import org.example.domain.Cliente;

public interface IClienteService {

    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);


    Boolean cadastrar(Cliente cliente);
}

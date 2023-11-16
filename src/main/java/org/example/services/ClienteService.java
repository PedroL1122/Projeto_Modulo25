package org.example.services;

import org.example.dao.ClienteDAO;
import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;

public class ClienteService implements IClienteService{

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = new ClienteDAO();
    }
    @Override
    public Boolean salvar(Cliente cliente){
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf){
        return clienteDAO.buscarPorCPF(cpf);
    }

    public void excluir(Long cpf){

    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return null;
    }
}

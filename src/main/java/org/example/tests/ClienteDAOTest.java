package org.example.tests;

import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;
import org.example.tests.dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDAO;

    private Cliente cliente;

    public ClienteDAOTest(){
        IClienteDAO dao = new ClienteDaoMock();
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        clienteDAO.salvar(cliente);

    }

    @Test
    public void pesquisarCliente(){
    Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente(){
        Boolean retorno = clienteDAO.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente()
    {
        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente(){
        clienteDAO.alterar(cliente);
    }
}


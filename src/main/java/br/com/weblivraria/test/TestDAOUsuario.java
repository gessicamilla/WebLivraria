package br.com.weblivraria.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;

public class TestDAOUsuario {
	
//	Vamos realizar os testes em todos os métodos que estão
//	na classe DAOUsuario.
	
//	Vamos começar testando o cadastro do usuário
	@Test
	public void testCadastroUsuario() {
//		realizar a instância da classe Usuario e aplicar
//		ficticios para cadastrar. Esta técnica é chamada de dados
//		mockados
		Usuario us = new Usuario();
		us.setNomeusuario("Cardan");
		us.setSenha("123");
		us.setEmail("cardanamaajude@gmail.com");
		us.setTelefone("(70) 97070-7070");
		us.setNomecompleto("Cardan Greenbriar");
		us.setCpf("665375353");
		
//		Instância da classe DAOUsuario
		DAOUsuario daous = new DAOUsuario();
		assertEquals("Cadastro realizado", daous.cadastrar(us));
	}
}

package util;

import dao.DaoBase;
import model.Telefone;
import model.UsuarioPessoa;
import org.junit.Test;

import java.util.List;

public class HibernateTest {
    @Test
    public void testeHibernate() {
        Hibernate.getEntityManager();
    }

    @Test
    public void testeInserir() {
        DaoBase<UsuarioPessoa> daoBase = new DaoBase<UsuarioPessoa>();

        UsuarioPessoa usuarioPessoa = new UsuarioPessoa();
        usuarioPessoa.setEmail("cleiton@admin.com");
        usuarioPessoa.setNome("Cleiton S Barbosa");
        usuarioPessoa.setPass("132");

        daoBase.inserir(usuarioPessoa);
    }

    @Test
    public void testeInserirTelefone() {
        DaoBase<Telefone> daoBase = new DaoBase<Telefone>();

        UsuarioPessoa usuarioPessoa = new UsuarioPessoa();
        usuarioPessoa.setId(2L);

        Telefone telefone = new Telefone();
        telefone.setNumero("61984624081");
        telefone.setUsuarioPessoa(usuarioPessoa);

        daoBase.inserir(telefone);
    }

    @Test
    public void testeBuscar() {
        DaoBase<UsuarioPessoa> daoBase = new DaoBase<UsuarioPessoa>();

        UsuarioPessoa usuarioPessoa = daoBase.get(2L, UsuarioPessoa.class);
        System.out.println(usuarioPessoa.toString());
    }

    @Test
    public void testeBuscarTodos(){
        DaoBase<UsuarioPessoa> daoBase = new DaoBase<UsuarioPessoa>();
        List<UsuarioPessoa> usuarioPessoaList = daoBase.getAll(UsuarioPessoa.class);

        for (UsuarioPessoa usuarioPessoa : usuarioPessoaList) {
            System.out.println(usuarioPessoa.toString());
        }

    }

    @Test
    public void testeNamedQuery() {

    }
}

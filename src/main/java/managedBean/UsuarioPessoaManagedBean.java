package managedBean;

import dao.DaoBase;
import model.UsuarioPessoa;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UsuarioPessoaManagedBean {
    private UsuarioPessoa usuarioPessoa = new UsuarioPessoa();
    private DaoBase<UsuarioPessoa> daoBase = new DaoBase<UsuarioPessoa>();

    public UsuarioPessoa getUsuarioPessoa() {
        return usuarioPessoa;
    }

    public void setUsuarioPessoa(UsuarioPessoa usuarioPessoa) {
        this.usuarioPessoa = usuarioPessoa;
    }
}

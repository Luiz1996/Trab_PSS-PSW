package br.uem.din.bibliotec.config.controller;

import br.uem.din.bibliotec.config.model.M_Usuario;
import br.uem.din.bibliotec.config.model.M_Usuario_DAO;
import javax.faces.bean.ManagedBean;
import java.awt.*;
import java.sql.SQLException;

@ManagedBean(name = "loginBean", eager = true)
public class C_Login {
    M_Usuario_DAO userDAO = new M_Usuario_DAO();
    M_Usuario user = new M_Usuario("","");

    public M_Usuario_DAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(M_Usuario_DAO userDAO) {
        this.userDAO = userDAO;
    }

    public M_Usuario getUser() {
        return user;
    }

    public void setUser(M_Usuario user) {
        this.user = user;
    }

    public String realizarAcesso() throws SQLException, AWTException {
        return userDAO.buscaPermissao(user);
    }
}

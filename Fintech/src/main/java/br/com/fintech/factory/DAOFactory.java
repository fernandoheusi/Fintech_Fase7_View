
// Criação da classe DAOFactory que é responsável por instanciar a classe OracleUsuarioDAO que implementa a interface UsuarioDAO.
// Ela serve como uma fábrica para criar instâncias da implementação da interface UsuarioDAO.


package br.com.fintech.factory;

import br.com.fintech.dao.UsuarioDAO;
import br.com.fintech.dao.impl.OracleUsuarioDAO;

public class DAOFactory {
 
    public static UsuarioDAO getUsuarioDAO() {
        return new OracleUsuarioDAO();
    }

}
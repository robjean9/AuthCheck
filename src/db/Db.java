package db;

/**
 * Created by rafael on 01/08/15.
 */
import java.sql.*;
public class Db {
    private Connection con;
    private String driver;
    private String url;
    private String usuario;
    private String senha;
    private String erro;
    public Db() {
        this.setDriver ("com.mysql.jdbc.Driver");
        this.setUrl ("jdbc:mysql://breus.com.br:3306/breuscom_erp");
        this.setUsuario ("breuscom_erp");
        this.setSenha ("erp12345");
        this.setErro("");
        this.setCon(null);
    }
    public void conexao () throws Exception {
        try{
            Class.forName (this.getDriver());
            this.setCon (DriverManager.getConnection (this.getUrl(),this.getUsuario(),this.getSenha()));
        } catch (Exception e){
            this.setErro("erro na conexao|n"+e.getMessage());
            throw e;
        }
    }
    public void fecha () {
        try {
            getCon().close();
        } catch (SQLException e){
            this.setErro("erro a conexão|n"+e. getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}

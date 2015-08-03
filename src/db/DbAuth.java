package db;

import vo.Auth;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by rafael on 01/08/15.
 */
public class DbAuth extends db.Db {

        public DbAuth(){
            try{
                conexao();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }

    public Auth getAuth_Code(String id){
        String sql="select * from service_auth where service_id='" + id +"'";
        Auth registro=new Auth();
        try{
            Statement st=getCon().createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                //registro.setService_id(rs.getString("service_id"));
                registro.setService_auth_code(rs.getInt("service_auth_code"));

            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
        return registro;
    }


}

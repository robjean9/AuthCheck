package main;

import db.DbAuth;
import util.BCrypt;
import util.IniRW;
import vo.Values;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by rafael on 01/08/15.
 */
public class Loader {

    public static void main(String[] args) {
        DbAuth dba = new DbAuth();
        String o;
        Values v = null;




try {
    int b = (dba.getAuth_Code("1").getService_auth_code());
    System.out.println(b);
    if (b == 1) {
        System.out.println("Autorizado");
    } else {
        System.out.println("Bloqueado");

        String hashed = BCrypt.hashpw("1", BCrypt.gensalt());

        try {
            IniRW.write(new Values(hashed));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            v = (Values) IniRW.read();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        if (BCrypt.checkpw("1",v.getHash()))
        {
            System.out.println("It matches");
        }
        else
            System.out.println("It does not match");

    }
}catch(Exception e){
    System.out.println("Erro na comunicação");

}











    }
}




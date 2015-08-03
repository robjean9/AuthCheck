package util;

import vo.Values;

import java.io.*;

/**
 * Created by rafael on 01/08/15.
 */
public class IniRW {

    public static void write(Values v) throws FileNotFoundException, IOException{
        FileOutputStream w = new FileOutputStream("auth.l2rp");
        ObjectOutputStream stream = new ObjectOutputStream(w);
        stream.writeObject(v);
        stream.close();
    }

    public static Object read() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object object = null;
        FileInputStream restFile = new FileInputStream("auth.l2rp");
        ObjectInputStream stream = new ObjectInputStream(restFile);
        object = stream.readObject();
        stream.close();

        return object;
    }


}

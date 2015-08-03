package vo;

import java.io.Serializable;

/**
 * Created by rafael on 01/08/15.
 */
public class Values implements Serializable {
    private String hash;
    public Values (String hs){
        this.hash = hs;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}

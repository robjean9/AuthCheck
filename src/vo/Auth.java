package vo;

/**
 * Created by rafael on 01/08/15.
 */
public class Auth {
    private int service_id;
    private int service_auth_code;

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getService_auth_code() {
        return service_auth_code;
    }

    public void setService_auth_code(int service_auth_code) {
        this.service_auth_code = service_auth_code;
    }
}

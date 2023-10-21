package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {
    private String message = "";
    private String messageError = null;
    private ArrayList<String> users = null;

    public ClearState() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUserDeleted(ArrayList<String> userDeleted) {
        this.users = userDeleted;
    }

    public ArrayList<String> getUserDeleted() {
        return this.users;
    }

    public void setMessageError(String error) {
        this.messageError = error;
    }
}

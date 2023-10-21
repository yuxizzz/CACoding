package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private final String message;
    private boolean useCaseFailed;
    private ArrayList<String> userDeleted;

    public ClearOutputData(String message, ArrayList<String> userDeleted, boolean useCaseFailed) {
        this.message = message;
        this.useCaseFailed = useCaseFailed;
        this.userDeleted = userDeleted;

    }

    public String getMessage() {
        return message;
    }

    public ArrayList<String> getUserDeleted() {
        return userDeleted;
    }
}

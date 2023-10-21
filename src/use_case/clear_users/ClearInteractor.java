package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;
import java.util.Set;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {

        ArrayList<String> deletedUsers = userDataAccessObject.clearAllUser();
        String message = "Cleared all users.";
        ClearOutputData clearOutputData = new ClearOutputData(message, deletedUsers, false);
        userPresenter.prepareSuccessView(clearOutputData);

        //ask dataAccessinterface for info on my users?/call it to delete all users?

    }
}

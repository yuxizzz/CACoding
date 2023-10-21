package use_case.clear_users;

// TODO Complete me

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData message);

    void prepareFailView(String error);
}

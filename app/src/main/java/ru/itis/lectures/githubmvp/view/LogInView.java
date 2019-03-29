package ru.itis.lectures.githubmvp.view;


public interface LogInView extends LoadingView {

    void openRepositoriesScreen();

    void showLoginError();

    void showPasswordError();

}

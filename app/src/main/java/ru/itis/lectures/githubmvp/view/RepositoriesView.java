package ru.itis.lectures.githubmvp.view;

import android.support.annotation.NonNull;
import ru.itis.lectures.githubmvp.content.Repository;

import java.util.List;

public interface RepositoriesView extends LoadingView {

    void showRepositories(@NonNull List<Repository> repositories);

    void showCommits(@NonNull Repository repository);
}

package ru.itis.lectures.githubmvp.repository;

import android.support.annotation.NonNull;
import ru.itis.lectures.githubmvp.content.Repository;
import rx.Observable;

import java.util.List;


public interface RepositoriesRepository {

    @NonNull
    Observable<List<Repository>> cachedRepositories();

    void saveRepositories(@NonNull List<Repository> repositories);
}

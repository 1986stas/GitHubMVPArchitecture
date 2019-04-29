package ru.itis.lectures.githubmvp.testutils;

import android.support.annotation.NonNull;
import ru.itis.lectures.githubmvp.api.ApiProvider;
import ru.itis.lectures.githubmvp.api.GithubService;

public class IntegrationProviderImpl implements ApiProvider {

    private final GithubService mService;

    public IntegrationProviderImpl(@NonNull GithubService service) {
        mService = service;
    }

    @NonNull
    @Override
    public GithubService provideGithubService() {
        return mService;
    }

    @NonNull
    @Override
    public String provideToken() {
        return "";
    }
}

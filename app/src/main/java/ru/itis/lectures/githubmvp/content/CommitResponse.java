package ru.itis.lectures.githubmvp.content;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

public class CommitResponse {

    @SerializedName("commit")
    private Commit mCommit;

    @NonNull
    public Commit getCommit() {
        return mCommit;
    }
}
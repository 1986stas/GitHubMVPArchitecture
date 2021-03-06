package ru.itis.lectures.githubmvp.widget;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.v13.app.FragmentStatePagerAdapter;
import ru.itis.lectures.githubmvp.content.Benefit;
import ru.itis.lectures.githubmvp.fragment.WalkthroughBenefitFragment;

import java.util.List;

public class WalkthroughAdapter extends FragmentStatePagerAdapter {

    private final List<Benefit> mBenefits;

    public WalkthroughAdapter(FragmentManager fm, @NonNull List<Benefit> benefits) {
        super(fm);
        mBenefits = benefits;
    }

    @Override
    public Fragment getItem(int position) {
        return WalkthroughBenefitFragment.create(mBenefits.get(position));
    }

    @Override
    public int getCount() {
        return mBenefits.size();
    }
}

package com.exambo.examenpmdm.ui.frmanager;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.exambo.examenpmdm.fr.mainactivity.Primerfragment;
import com.exambo.examenpmdm.fr.mainactivity.Segundofragment;
import com.exambo.examenpmdm.fr.mainactivity.Tercerfragment;

public class PaginadorMainActivity extends FragmentPagerAdapter {

    private final Context mContext;

    public PaginadorMainActivity(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Primerfragment();
            case 1:
                return new Segundofragment();
            case 2:
                return new Tercerfragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() { return 3; }


}
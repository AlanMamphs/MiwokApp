package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alisher on 7/12/16.
 */
public class SimpleFragmentPageAdapter extends FragmentPagerAdapter{
    private String tabs[] = new String[]{"Numbers", "Family", "Colors", "Phrases"};

    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new NumbersFragment();
        }
        else if(position==1){
            return new FamilyFragment();
        }
        else if(position==2){
            return new ColorFragment();
        }
        else{
            return new PhrasesFragment();
        }

    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}

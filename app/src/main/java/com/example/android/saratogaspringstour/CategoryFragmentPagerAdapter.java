package com.example.android.saratogaspringstour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {
    final private int PAGE_COUNT = 4;
    private Context context;

    public CategoryFragmentPagerAdapter(android.support.v4.app.FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ParksFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new ShopFragment();
            case 3:
                return new SitesFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getResources().getString(R.string.intro_fragment_name);
            case 1:
                return context.getResources().getString(R.string.food_fragment_name);
            case 2:
                return context.getResources().getString(R.string.shop_fragment_name);
            case 3:
                return context.getResources().getString(R.string.sites_fragment_name);
            default:
                return null;
        }
    }
}
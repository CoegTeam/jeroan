package codelabs.or.id.tamanbandung;

import android.support.v4.app.FragmentStatePagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.Fragment;
/**
 * Created by taufi on 17/02/2016.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Login login = new Login();
            return login;
        } else {
            Register register = new Register();
            return  register;
        }

    }


    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip


    @Override
    public int getCount() {
        return NumbOfTabs;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */

}
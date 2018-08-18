package com.addressapp.umu.kickstartercopy.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.addressapp.umu.kickstartercopy.TabLayouts.arts;
import com.addressapp.umu.kickstartercopy.TabLayouts.comics_illustrations;
import com.addressapp.umu.kickstartercopy.TabLayouts.design_tech;
import com.addressapp.umu.kickstartercopy.TabLayouts.endingsoon;
import com.addressapp.umu.kickstartercopy.TabLayouts.film;
import com.addressapp.umu.kickstartercopy.TabLayouts.food_craft;
import com.addressapp.umu.kickstartercopy.TabLayouts.games;
import com.addressapp.umu.kickstartercopy.TabLayouts.home;
import com.addressapp.umu.kickstartercopy.TabLayouts.music;
import com.addressapp.umu.kickstartercopy.TabLayouts.newest;
import com.addressapp.umu.kickstartercopy.TabLayouts.popular;
import com.addressapp.umu.kickstartercopy.TabLayouts.publishing;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int NoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.NoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:
                home hme = new home();
                        return hme;

            case 1:
                popular poplr = new popular();
                return poplr;

            case 2:
                newest nwst = new newest();
                return nwst;

            case 3:
                endingsoon endngsoon = new endingsoon();
                return endngsoon;

            case 4:
                arts ats = new arts();
                return ats;

            case 5:
                comics_illustrations cmcs_illstratons = new comics_illustrations();
                return cmcs_illstratons;

            case 6:
                design_tech dsgn_tch = new design_tech();
                return dsgn_tch;

            case 7:
                film flm = new film();
                return flm;

            case 8:
                food_craft fd_crft = new food_craft();
                return fd_crft;

            case 9:
                games gms = new games();
                return gms;

            case 10:
                music msc = new music();
                return msc;

            case 11:
                publishing pblshng = new publishing();
                return pblshng;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NoOfTabs;
    }
}

package com.addressapp.umu.kickstartercopy.Main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.addressapp.umu.kickstartercopy.Adapters.PagerAdapter;
import com.addressapp.umu.kickstartercopy.BottomNavigation.account;
import com.addressapp.umu.kickstartercopy.BottomNavigation.activity;
import com.addressapp.umu.kickstartercopy.BottomNavigation.kickstarter;
import com.addressapp.umu.kickstartercopy.BottomNavigation.search;
import com.addressapp.umu.kickstartercopy.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener{

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottom_nav = findViewById(R.id.bottom_navigation);
        bottom_nav.setOnNavigationItemSelectedListener(this);

        loadFragment(new kickstarter());

        TabLayout tablayout = findViewById(R.id.tablayout);
        tablayout.addTab(tablayout.newTab().setText("Home"));
        tablayout.addTab(tablayout.newTab().setText("Popular"));
        tablayout.addTab(tablayout.newTab().setText("Newest"));
        tablayout.addTab(tablayout.newTab().setText("Ending Soon"));
        tablayout.addTab(tablayout.newTab().setText("Arts"));
        tablayout.addTab(tablayout.newTab().setText("Comics&Illustration"));
        tablayout.addTab(tablayout.newTab().setText("Design&Technology"));
        tablayout.addTab(tablayout.newTab().setText("Films"));
        tablayout.addTab(tablayout.newTab().setText("Food&Craft"));
        tablayout.addTab(tablayout.newTab().setText("Games"));
        tablayout.addTab(tablayout.newTab().setText("Music"));
        tablayout.addTab(tablayout.newTab().setText("Publishing"));

        final ViewPager viewpager = findViewById(R.id.viewpager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tablayout.getTabCount());
        viewpager.setAdapter(adapter);
        viewpager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment = null;

            switch (menuItem.getItemId()) {
                case R.id.bottom_navigation_kickstarter:
                    fragment = new kickstarter();
                    break;

                case R.id.bottom_navigation_activity:
                    fragment = new activity();
                    break;

                case R.id.bottom_navigation_search:
                    fragment = new search();
                    break;

                case R.id.bottom_navigation_account:
                    fragment = new account();
                    break;
            }

            return loadFragment(fragment);
        }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.email_button:
                Toast.makeText(getApplicationContext(),"Sign in with E-mail",Toast.LENGTH_LONG).show();
                break;
            case R.id.sign_up_button:
                Toast.makeText(getApplicationContext(),"Sign Up With E-mail",Toast.LENGTH_LONG).show();
                break;
            case R.id.activity_button:
                Toast.makeText(getApplicationContext(),"Clicked Explore Projects",Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void dialogButtonClicked(View view){

       //LayoutInflater inflater = LayoutInflater.from(this);
       //@SuppressLint("InflateParams") View dialogLayout = inflater.inflate(R.layout.dialog_layout, null);

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
       // dialog.setView(dialogLayout);
        dialog.create();
        dialog.show();

        Toast.makeText(getBaseContext(),"Drop Down List",Toast.LENGTH_LONG).show();
    }
}
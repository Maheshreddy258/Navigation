package com.example.mahesh.navigation;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    private DrawerLayout dl;
    private ActionBarDrawerToggle Toggle;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbr);
        setSupportActionBar(toolbar);


        dl = (DrawerLayout) findViewById(R.id.Drawerlayout);
        Toggle = new ActionBarDrawerToggle(this, dl, R.string.open, R.string.close);

        dl.addDrawerListener(Toggle);
        Toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.account:
                fragment = new com.example.mahesh.navigation.Account();
                loadFragment(fragment);

                setTitle(item.getTitle());
                break;
            case R.id.settings:

                fragment = new com.example.mahesh.navigation.Account();
                loadFragment(fragment);

                setTitle(item.getTitle());

                break;
            case R.id.grid:

                fragment = new com.example.mahesh.navigation.Account();
                loadFragment(fragment);

                setTitle(item.getTitle());
                break;
            case R.id.general:
                fragment = new com.example.mahesh.navigation.Account();
                loadFragment(fragment);

                setTitle(item.getTitle());

                break;

        }
        return true;
    }

    private void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fcontent, fragment);
        transaction.commit();

    }


}

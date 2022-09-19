package com.example.foodalix;

import static com.example.foodalix.R.color.back;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {
    
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        
        if( actionBarDrawerToggle.onOptionsItemSelected(item)) {
            
            return true;
            
        }
        
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SearchView searchView = findViewById(R.id.search);
        ImageView icon = searchView.findViewById(androidx.appcompat.R.id.search_button);
        ImageViewCompat.setImageTintList(icon, ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white)));
        searchView.setQueryHint("Search for foods");
        
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(back)));
        
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                
                switch (item.getItemId()) {
                    
                    case R.id.nav_home:
                        Toast.makeText(HomeActivity.this, "Home Clicked", Toast.LENGTH_SHORT);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_profile:
                        Toast.makeText(HomeActivity.this, "Profile Clicked", Toast.LENGTH_SHORT);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                        
                    case R.id.burger:
                        Toast.makeText(HomeActivity.this, "Burger Clicked", Toast.LENGTH_SHORT);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                        
                    case R.id.drinks:
                        Toast.makeText(HomeActivity.this, "Drink Clicked", Toast.LENGTH_SHORT);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.pizza:
                        Toast.makeText(HomeActivity.this, "Pizza Clicked", Toast.LENGTH_SHORT);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.salad:
                        Toast.makeText(HomeActivity.this, "Salad Clicked", Toast.LENGTH_SHORT);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.chicken:
                        Toast.makeText(HomeActivity.this, "Chicken Clicked", Toast.LENGTH_SHORT);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.fish:
                        Toast.makeText(HomeActivity.this, "Fish Clicked", Toast.LENGTH_SHORT);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                
                return true;
            }
        });
    }
}
package com.codewithanukul.foodoholic.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.codewithanukul.foodoholic.Activity.Adapter.CategoryAdapter;
import com.codewithanukul.foodoholic.Activity.Adapter.PoplurarAdapter;
import com.codewithanukul.foodoholic.Activity.Domain.CategoryDomain;
import com.codewithanukul.foodoholic.Activity.Domain.FoodDomain;
import com.codewithanukul.foodoholic.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private RecyclerView.Adapter adapter,adapter2;
private RecyclerView recyclerViewCategoryList,recyclerViewPopularlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();
        bottomNavigation();


    }
    private void bottomNavigation(){
        FloatingActionButton floatingActionButton=findViewById(R.id.cartBtn);
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout profileBtn=findViewById(R.id.profileBtn);
        LinearLayout supportBtn=findViewById(R.id.supportBtn);
        LinearLayout settingsBtn=findViewById(R.id.settingsBtn);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CartListActivity.class));
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ProfileActivity.class));
            }
        });
        supportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SupportActivity.class));
            }
        });
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SettingsActivity.class));
            }
        });
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);


        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Pizza","ic_pizza"));
        category.add(new CategoryDomain("Burger","ic_burger"));
        category.add(new CategoryDomain("Hotdog","ic_hotdog"));
        category.add(new CategoryDomain("Drink","ic_drink"));
        category.add(new CategoryDomain("Donut","ic_donut"));
        category.add(new CategoryDomain("Noodles","ic_noodles"));


        adapter =new CategoryAdapter(category);
        recyclerViewCategoryList.setAdapter(adapter);

    }
    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularlist=findViewById(R.id.recyclerView2);
        recyclerViewPopularlist.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList =new ArrayList<>();
        foodList.add(new FoodDomain("Pepperoni pizza","ic_pizza2","slices pepperoni,mozzerella cheese,fresh oregano, ground black pepper,pizza sauce",9));
        foodList.add(new FoodDomain("Cheese Burger","ic_cheese_burger2","chicken,cheese,Special Sauce,lettuce,tomato",8));
        foodList.add(new FoodDomain("Vegetable pizza","ic_pizza","olive oil, vegetable oil, pitted kalamata, cherry tomatoes,fresh oregano,basil",9));

        adapter2=new PoplurarAdapter(foodList);
        recyclerViewPopularlist.setAdapter(adapter2);

    }
}
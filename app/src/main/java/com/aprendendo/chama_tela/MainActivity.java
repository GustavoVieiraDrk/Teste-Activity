package com.aprendendo.chama_tela;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok = (Button) findViewById(R.id.BtnNewScreen);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("Gustavo", "JojoTodinho@gmail.com");

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("user", user);
                startActivity(intent);
            }
        });

        Button btnFrag = (Button) findViewById(R.id.BtnFragment);
        btnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final View view = getLayoutInflater().inflate(R.layout.fragment_blank, findViewById(R.id.localFrag), false);

                ((FrameLayout)findViewById(R.id.localFrag)).addView(view);

//                FragmentTransaction transaction;
//                Fragment testeFragment;
//
//
//                testeFragment = new BlankFragment();
//
//                getSupportFragmentManager().beginTransaction().add(R.id.localFrag, testeFragment).commit();
//                transaction = getSupportFragmentManager().beginTransaction();
//                switch (v.getId()){
//                    case R.id.BtnFragment: transaction.replace(R.id.localFrag,testeFragment).commit();
//                        break;
//                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
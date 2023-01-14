package br.com.myzap.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.com.myzap.R;
import br.com.myzap.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               abrirAuntenticacao();
           }
       }, 400);
    }

    private void abrirAuntenticacao(){
        Intent abrir = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(abrir);
        finish();
    }
}

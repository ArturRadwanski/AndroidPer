package com.example.person.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.person.R;
import com.example.person.databinding.ActivityMainBinding;
import com.example.person.viewmodel.PersonViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PersonViewModel personViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());

        this.personViewModel = new ViewModelProvider(MainActivity.this).get(PersonViewModel.class);
        this.personViewModel.setUpPerson();

    }
}
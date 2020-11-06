package com.example.oop05102020;

import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    abstract int getLayout();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
    }
    public void showError(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

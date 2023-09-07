package ir.yasinlib.yasinlibtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ir.yasinlib.ylibtest.MyLogCat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLogCat myLogCat = new MyLogCat(getApplicationContext());
        myLogCat.printMyLogCatMessage("Test", "I have a message");


    }
}
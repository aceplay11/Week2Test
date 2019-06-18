package com.example.week2test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         class SortArray {
            public  void arraySort(int x[]) {

                int[] ray = {1, 4, 5, 3, 5, 4, 7, 1, 5, 4, 3, 3, 8, 5, 9, 8, 9, 8, 9};
                for (int i = 0; i <ray.length - 1 ; i++) {
                    Log.d("RAYTAG", Arrays.toString(ray));

                    Arrays.sort(ray);

                    Log.d("RAYTAGSORTED", Arrays.toString(ray));

                }

            }

        }
    }
}

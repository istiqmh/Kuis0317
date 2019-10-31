package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentActivity extends Fragment {

    public FragmentActivity(){

    }

    @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

       return inflater.inflate(R.layout.activity_fragment, container,false);
    }
}

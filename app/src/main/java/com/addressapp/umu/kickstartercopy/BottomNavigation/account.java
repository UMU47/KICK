package com.addressapp.umu.kickstartercopy.BottomNavigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.addressapp.umu.kickstartercopy.R;


public class account extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.email_button:
            Toast.makeText(getContext(),"Clicked Sign In with Email",Toast.LENGTH_LONG).show();
            break;
            case R.id.sign_up_button:
                Toast.makeText(getContext(),"Clicked Sign In with Email",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
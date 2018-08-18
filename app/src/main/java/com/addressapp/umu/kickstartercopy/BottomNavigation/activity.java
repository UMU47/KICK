package com.addressapp.umu.kickstartercopy.BottomNavigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.addressapp.umu.kickstartercopy.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class activity extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activity, container, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_button:
                Toast.makeText(getContext(), "Clicked Explore projects", Toast.LENGTH_LONG).show();
                break;
        }
    }
}

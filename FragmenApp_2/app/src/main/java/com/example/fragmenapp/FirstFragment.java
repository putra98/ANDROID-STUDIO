package com.example.fragmenapp;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;
import androidx.fragment.app.FragmentTransaction;


public class FirstFragment extends Fragment {
    Button btnSwitch;
    boolean dual;
    public FirstFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater, ViewGroup container,
                            Bundle savedInstanceState){
        return inflater.inflater(R.layout.fragment_fragment, container, attachToRoot: false);
    }
    @TargetApi(build.VERSION_CODES.HONEYCOMB)
    @Override

    public void onActivityCreated(View view, Bundle savedInstenceState);
        super.onActivityCreated(savedInstanceSate);

        dual = false;
        View details = getActivity().findViewById(R.id.details);
        if (details != null && details.getVisibility() == View.VISIBLE){

        dual = true;
        }
    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onViewCreate(View view, Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        btnSwitch = (Button)getView().findViewBy(R.id.btnSwitchOne);
        btnSwitch.setOnClickListener(new View.OnClickListener(){
            @TargetApi(build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(View view){
                if (dual){
                    FragmentTransaction ft = getActivity().getFragmentManager().beginTransaction();
                    SecondFragment sf = (SecondFragment)getFragmentManager().findFragmentById(R.id.details);
                    if (df == null) {
                        sf=new SecondFragment();
                        ft.replace(R.id.details, sf);
                        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                        ft.commit();

                    }
                }else {
                    Intent i = new Intent();
                    i.setClass(getActivity()= SecondActivity.class);
                    startActivity(i);
                }
        }
    });
}

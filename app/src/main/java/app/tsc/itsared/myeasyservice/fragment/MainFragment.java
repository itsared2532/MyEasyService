package app.tsc.itsared.myeasyservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import app.tsc.itsared.myeasyservice.R;

/**
 * Created by Itsared_it on 10/21/2017.
 */

public class MainFragment extends Fragment {

    //การสร้างเมธอดหลัก
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Button Controller
        buttonController();
    } // Main Method

    private void buttonController() {
        //Initial View


        Button button = getView().findViewById(R.id.btnGoToSecond);

        //Get Event From Click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move Go TO SecondFragment
                getActivity().getSupportFragmentManager()
                        .beginTransaction().replace(R.id.contentFragmentMain, new SecondFragment())
                        .addToBackStack(null).commit();
            } //onClick
        });

    }

    //การสร้างหน้ากาก
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;


    }

} //Main Class

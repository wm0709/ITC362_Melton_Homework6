package com.example.stoplight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RightFragment extends Fragment {

    private int status;

    public RightFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    public void onStart(){
        super.onStart();

        View fragmentView = getView();
        TextView lightTV = (TextView) fragmentView.findViewById(R.id.lightTV);
        MainActivity fragmentActivity = (MainActivity) getActivity();
        lightTV.setText("RED LIGHT");
        lightTV.setBackgroundColor(getResources().getColor(R.color.red));
        setStatus(-1);
    }

    public String statusCheck(){
        switch (status){
            case -1:
                return "RED";
            case 0:
                return "GREEN";
            case 1:
                return "YELLOW";
            default:
                throw new IllegalStateException("Unexpected value: " + status);
        }
    }

    public void setStatus(int statusChange){
        status = statusChange;
    }
}

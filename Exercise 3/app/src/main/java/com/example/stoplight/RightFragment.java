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
        TextView redTV = (TextView) fragmentView.findViewById(R.id.redTV);
        TextView yellowTV = (TextView) fragmentView.findViewById(R.id.yellowTV);
        TextView greenTV = (TextView) fragmentView.findViewById(R.id.greenTV);

        MainActivity fragmentActivity = (MainActivity) getActivity();
        redTV.setAlpha(1);
        yellowTV.setAlpha(.2f);
        greenTV.setAlpha(.2f);
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

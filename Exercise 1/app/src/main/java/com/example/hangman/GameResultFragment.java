package com.example.hangman;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GameResultFragment extends Fragment {
    private TextView gameResultTV;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setUpFragmentGui(container);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void setUpFragmentGui(ViewGroup container){
        if(gameResultTV == null){
            gameResultTV = new TextView(getActivity());
            gameResultTV.setGravity(Gravity.CENTER);
            gameResultTV.setTextAppearance(R.style.textStyle);
            container.addView(gameResultTV);
        }
    }

    public void onStart(){
        super.onStart();
        gameResultTV.setText("GOOD LUCK");
    }

    public void setResult(String result){
        gameResultTV.setText(result);
    }
}

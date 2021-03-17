package com.example.hangman;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GameStateFragment extends Fragment {

    public GameStateFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_game_state, container,false);
    }

    public void onStart(){
        super.onStart();
        View fragmentView = getView();
        TextView gameStateTV = (TextView) fragmentView.findViewById(R.id.state_of_game);
        MainActivity fragmentActivity = (MainActivity) getActivity();
        gameStateTV.setText(fragmentActivity.getGame().currentIncompleteWord());
    }
}

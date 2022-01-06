package moin.miley.cse489.stock_prediction_project.ui.News;

//https://www.arthosuchak.com/
//https://sunbd24.com/
//http://www.sharebazarnews.com/
//https://www.sharenews24.com/
//https://businesshour24.com/

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import moin.miley.cse489.stock_prediction_project.R;

public class NewsFragment extends Fragment {
    CardView cardView1, cardView2, cardView3, cardView4, cardView5;
    private ActionBar toolbar;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cardView1 = (CardView) getView().findViewById(R.id.cardview1);
        cardView2 = (CardView) getView().findViewById(R.id.cardview2);
        cardView3 = (CardView) getView().findViewById(R.id.cardview3);
        cardView4 = (CardView) getView().findViewById(R.id.cardview4);
        cardView5 = (CardView) getView().findViewById(R.id.cardview5);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment someFragment = new NewsChannel1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.relativeLayoutNews, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
                getView().findViewById(R.id.cardview1).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview2).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview3).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview4).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview5).setVisibility(View.INVISIBLE);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment someFragment = new NewsChannel2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.relativeLayoutNews, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
                getView().findViewById(R.id.cardview1).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview2).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview3).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview4).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview5).setVisibility(View.INVISIBLE);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment someFragment = new NewsChannel3();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.relativeLayoutNews, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
                getView().findViewById(R.id.cardview1).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview2).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview3).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview4).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview5).setVisibility(View.INVISIBLE);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment someFragment = new NewsChannel4();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.relativeLayoutNews, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
                getView().findViewById(R.id.cardview1).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview2).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview3).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview4).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview5).setVisibility(View.INVISIBLE);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment someFragment = new NewsChannel5();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.relativeLayoutNews, someFragment ); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
                getView().findViewById(R.id.cardview1).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview2).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview3).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview4).setVisibility(View.INVISIBLE);
                getView().findViewById(R.id.cardview5).setVisibility(View.INVISIBLE);
            }
        });
    }
}

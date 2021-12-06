package moin.miley.cse489.stock_prediction_project.ui.StockList;
//Stock List = Profile page

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import moin.miley.cse489.stock_prediction_project.R;

public class StockListFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slist, container, false);

    }

}
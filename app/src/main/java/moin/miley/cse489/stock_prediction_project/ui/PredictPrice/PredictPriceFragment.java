package moin.miley.cse489.stock_prediction_project.ui.PredictPrice;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import moin.miley.cse489.stock_prediction_project.MainActivity;
import moin.miley.cse489.stock_prediction_project.R;

public class PredictPriceFragment extends Fragment {
    EditText editText;
    Button button;
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_predict, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Spinner spinner = getView().findViewById(R.id.spinner1);
        editText = getView().findViewById(R.id.enterDate);
        button = getView().findViewById(R.id.predictButton);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.stock, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        String text = spinner.getSelectedItem().toString();
        System.out.println(text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double increase,tot;
                textView = getActivity().findViewById(R.id.PredictionOutput);
                textView.setText("Null");
                Date date1 = new Date();
                editText = getActivity().findViewById(R.id.enterDate);
                String date2 = editText.getText().toString();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dateSelected = null;
                try {
                    dateSelected = dateFormat.parse(date2);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                long diff = dateSelected.getTime() - date1.getTime();
                long seconds = diff / 1000;
                long minutes = seconds / 60;
                long hours = minutes / 60;
                long days = hours / 24;
                int spinner_pos = spinner.getSelectedItemPosition();
                if(spinner_pos==0){
                    increase = days*(1.74/100);
                    tot = 143.58+increase;
                    String text = "The predicted stock price on the selected date is " +String.format("%.2f",tot) + " dollars";
                    textView.setText(text);
                }
                if(spinner_pos==1){
                    increase = days*(0.40/100);
                    tot = 23.75+increase;
                    String text = "The predicted stock price on the selected date is " +String.format("%.2f",tot) + " dollars";
                    textView.setText(text);
                }
                if(spinner_pos==2){
                    increase = days*(-0.53/100);
                    tot = 174+increase;
                    String text = "The predicted stock price on the selected date is " +String.format("%.2f",tot) + " dollars";
                    textView.setText(text);
                }
            }
        });
    }
}

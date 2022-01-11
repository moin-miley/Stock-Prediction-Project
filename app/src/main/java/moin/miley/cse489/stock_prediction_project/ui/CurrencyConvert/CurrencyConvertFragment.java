package moin.miley.cse489.stock_prediction_project.ui.CurrencyConvert;

import static java.lang.Double.parseDouble;

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

import moin.miley.cse489.stock_prediction_project.R;

public class CurrencyConvertFragment extends Fragment {
    EditText enterAmount;
    TextView message;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myInflatedView = inflater.inflate(R.layout.fragment_cc, container, false);
        return myInflatedView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Spinner spinner1 = getView().findViewById(R.id.spinner1_cc);
        Spinner spinner2 = getView().findViewById(R.id.spinner2_cc);
        Button button = getView().findViewById(R.id.convertButton);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.currency, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        String text = spinner1.getSelectedItem().toString();
        System.out.println(text);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.currency, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        String text2 = spinner2.getSelectedItem().toString();
        System.out.println(text2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                enterAmount = getActivity().findViewById(R.id.enterAmount);
                Double amt = parseDouble(enterAmount.getText().toString());
                message = getActivity().findViewById(R.id.output);
                message.setText("Null");
                if(enterAmount==null){
                    message.setText("Enter an amount first!");
                }
                int spinner_pos1 = spinner1.getSelectedItemPosition();
                int spinner_pos2 = spinner2.getSelectedItemPosition();
                if(spinner_pos1==0 && spinner_pos2==0)
                {
                    String test = "The value is the same.";
                    message.setText(test);
                }
                if(spinner_pos1==0 && spinner_pos2==1)
                {
                    tot = amt * 0.012;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==0 && spinner_pos2==2)
                {
                    tot = amt * 0.010;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==0 && spinner_pos2==3)
                {
                    tot = amt * 1.35;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==0 && spinner_pos2==4)
                {
                    tot = amt * 0.87;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==1 && spinner_pos2==0)
                {
                    tot = amt * 85.95;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==1 && spinner_pos2==1)
                {
                    String test = "The value is the same.";
                    message.setText(test);
                }
                if(spinner_pos1==1 && spinner_pos2==2)
                {
                    tot = amt * 0.88;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==1 && spinner_pos2==3)
                {
                    tot = amt * 115.71;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==1 && spinner_pos2==4)
                {
                    tot = amt * 74.47;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==2 && spinner_pos2==0)
                {
                    tot = amt * 97.24;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==2 && spinner_pos2==1)
                {
                    tot = amt * 1.13;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==2 && spinner_pos2==2)
                {
                    String test = "The value is the same.";
                    message.setText(test);
                }
                if(spinner_pos1==2 && spinner_pos2==3)
                {
                    tot = amt * 130.89;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==2 && spinner_pos2==4)
                {
                    tot = amt * 84.20;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==3 && spinner_pos2==0)
                {
                    tot = amt * 0.74;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==3 && spinner_pos2==1)
                {
                    tot = amt * 0.0086;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==3 && spinner_pos2==2)
                {
                    tot = amt * 0.0076;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==3 && spinner_pos2==3)
                {
                    String test = "The value is the same.";
                    message.setText(test);
                }
                if(spinner_pos1==3 && spinner_pos2==4)
                {
                    tot = amt * 0.64;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==4 && spinner_pos2==0)
                {
                    tot = amt * 1.16;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==4 && spinner_pos2==1)
                {
                    tot = amt * 0.013;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==4 && spinner_pos2==2)
                {
                    tot = amt * 0.012;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==4 && spinner_pos2==3)
                {
                    tot = amt * 1.55;
                    String test = "The value is " + tot;
                    message.setText(test);
                }
                if(spinner_pos1==4 && spinner_pos2==4)
                {
                    String test = "The value is the same.";
                    message.setText(test);
                }
            }
        });
    }
}

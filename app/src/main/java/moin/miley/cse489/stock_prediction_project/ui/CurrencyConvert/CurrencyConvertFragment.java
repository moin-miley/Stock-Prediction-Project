package moin.miley.cse489.stock_prediction_project.ui.CurrencyConvert;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import moin.miley.cse489.stock_prediction_project.R;

public class CurrencyConvertFragment extends Fragment {
    EditText enterAmount;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cc, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        enterAmount = getView().findViewById(R.id.enterAmount);
        TextView message = getView().findViewById(R.id.output);
        Spinner spinner1 = getView().findViewById(R.id.spinner1_cc);
        Spinner spinner2 = getView().findViewById(R.id.spinner2_cc);
        Button button = getView().findViewById(R.id.convertButton);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.currency, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.currency, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        int spinner_pos = spinner1.getSelectedItemPosition();
        String[] size_values = getResources().getStringArray(R.array.currency);
        int size = Integer.valueOf(size_values[spinner_pos]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amt = Double.parseDouble(enterAmount.getText().toString());

                if(spinner1.getSelectedItem().toString() == "Taka" && spinner2.getSelectedItem().toString() == "USD")
                {
                    tot = amt * 0.012;
                    String test = amt + " " + spinner1.getSelectedItem().toString() + " to " + spinner2.getSelectedItem().toString() + " is" + tot;
                    message.setText(test);
                }
            }
        });
    }
}

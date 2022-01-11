package moin.miley.cse489.stock_prediction_project.ui.slideshow;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import moin.miley.cse489.stock_prediction_project.R;

public class SlideshowFragment extends Fragment {
    Button button;
    String price;
    TextView tv;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slideshow, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Spinner spinner = getView().findViewById(R.id.spinner1);
        button = getView().findViewById(R.id.button1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.stock, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        String text = spinner.getSelectedItem().toString();
        tv = getActivity().findViewById(R.id.textView2);
        System.out.println(text);
        String print = ReadStocksData();
        String print2 = ReadFordData();
        String print3 = ReadAppleData();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(null);
                int spinner_pos = spinner.getSelectedItemPosition();
                if(spinner_pos==0){
                    tv.setText(print);
                }
                if(spinner_pos==1){
                    tv.setText(print2);
                }
                if(spinner_pos==2){
                    tv.setText(print3);
                }
            }
        });
        tv.setText("");
    }
    private List<Stockdata> priceList1= new ArrayList<>();
    private List<Stockdata> priceList2= new ArrayList<>();
    private List<Stockdata> priceList3= new ArrayList<>();
    //Nestle
    private String ReadStocksData(){
        InputStream is = getResources().openRawResource(R.raw.nestle);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try{
            while((line= reader.readLine())!=null){
                String[] tokens = line.split(",");
                Stockdata sample = new Stockdata();
                sample.setDate(tokens[0]);
                sample.setOpen(Double.parseDouble(tokens[1]));
                sample.setHigh(Double.parseDouble(tokens[2]));
                sample.setLow(Double.parseDouble(tokens[3]));
                sample.setClose(Double.parseDouble(tokens[4]));
                sample.setVolume(Double.parseDouble(tokens[5]));
                priceList1.add(sample);

                price = priceList1.toString();
            }
        }
        catch (IOException e){
            Log.wtf("SlideshowFragment","Error reading data on line" + line,e);
            e.printStackTrace();
        }
        return price;
    }
    //Ford Motors
    private String ReadFordData(){
        InputStream is = getResources().openRawResource(R.raw.ford);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try{
            while((line= reader.readLine())!=null){
                String[] tokens = line.split(",");
                Stockdata sample = new Stockdata();
                sample.setDate(tokens[0]);
                sample.setOpen(Double.parseDouble(tokens[1]));
                sample.setHigh(Double.parseDouble(tokens[2]));
                sample.setLow(Double.parseDouble(tokens[3]));
                sample.setClose(Double.parseDouble(tokens[4]));
                sample.setVolume(Double.parseDouble(tokens[5]));
                priceList2.add(sample);

                price = priceList2.toString();
            }
        }
        catch (IOException e){
            Log.wtf("SlideshowFragment","Error reading data on line" + line,e);
            e.printStackTrace();
        }
        return price;
    }
    //Apple
    private String ReadAppleData(){
        InputStream is = getResources().openRawResource(R.raw.apple);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try{
            while((line= reader.readLine())!=null){
                String[] tokens = line.split(",");
                Stockdata sample = new Stockdata();
                sample.setDate(tokens[0]);
                sample.setOpen(Double.parseDouble(tokens[1]));
                sample.setHigh(Double.parseDouble(tokens[2]));
                sample.setLow(Double.parseDouble(tokens[3]));
                sample.setClose(Double.parseDouble(tokens[4]));
                sample.setVolume(Double.parseDouble(tokens[5]));
                priceList3.add(sample);

                price = priceList3.toString();
            }
        }
        catch (IOException e){
            Log.wtf("SlideshowFragment","Error reading data on line" + line,e);
            e.printStackTrace();
        }
        return price;
    }
}
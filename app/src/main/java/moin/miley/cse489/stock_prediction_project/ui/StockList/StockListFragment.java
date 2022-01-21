package moin.miley.cse489.stock_prediction_project.ui.StockList;
//Stock List = Profile page

import android.os.AsyncTask;
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

public class StockListFragment extends Fragment {
    Button enter;
    String output;
    TextView tv;
    readCSV readfile = new readCSV();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slist, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Spinner spinner = getView().findViewById(R.id.spinner1);
        enter = getView().findViewById(R.id.predictButton);
        tv = getActivity().findViewById(R.id.PredictionOutput);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.stockCode, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        String text = spinner.getSelectedItem().toString();
        System.out.println(text);
        StringBuilder print = ReadStocksSample_Spinner0();
        StringBuilder print2 = ReadStocksSample_Spinner1();
        StringBuilder print3 = ReadStocksSample_Spinner2();
        //StringBuilder print4 = ReadStocksSample_Spinner3();


        enter.setOnClickListener(new View.OnClickListener() {
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
                if(spinner_pos==3){
                    new readCSV().execute();
                }
            }
        });
        tv.setText("");
    }
    private List<StockSamples> priceList1= new ArrayList<>();
    private List<StockSamples> priceList2= new ArrayList<>();
    private List<StockSamples> priceList3= new ArrayList<>();
    private List<StockSamples> priceList4= new ArrayList<>();

    private StringBuilder ReadStocksSample_Spinner0(){
        InputStream is = getResources().openRawResource(R.raw.stocklist);
        StringBuilder sb = new StringBuilder(100);
        sb.append("List of Symbols:\n");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try{
            while((line= reader.readLine())!=null){
                String[] tokens = line.split(",");
                StockSamples sample = new StockSamples();
                sample.setSymbol(tokens[0]);
                priceList1.add(sample);
                sb.append(sample.getSymbol());
                sb.append("\n");
            }
        }
        catch (IOException e){
            Log.wtf("SlideshowFragment","Error reading data on line" + line,e);
            e.printStackTrace();
        }
        return sb;
    }
    private StringBuilder ReadStocksSample_Spinner1(){
        InputStream is = getResources().openRawResource(R.raw.stocklist);
        StringBuilder sb = new StringBuilder(100);
        sb.append("List of Symbols and Names:\n");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try{
            while((line= reader.readLine())!=null){
                String[] tokens = line.split(",");
                StockSamples sample = new StockSamples();
                sample.setSymbol(tokens[0]);
                sample.setName(tokens[1]);
                priceList2.add(sample);
                sb.append(sample.getSymbol() + " \t" + sample.getName());
                sb.append("\n");
            }
        }
        catch (IOException e){
            Log.wtf("SlideshowFragment","Error reading data on line" + line,e);
            e.printStackTrace();
        }
        return sb;
    }
    private StringBuilder ReadStocksSample_Spinner2(){
        InputStream is = getResources().openRawResource(R.raw.stocklist);
        StringBuilder sb = new StringBuilder(100);
        sb.append("List of Symbols and Close Price:\n");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try{
            while((line= reader.readLine())!=null){
                String[] tokens = line.split(",");
                StockSamples sample = new StockSamples();
                sample.setSymbol(tokens[0]);
                sample.setLast_Sale(tokens[2]);
                priceList3.add(sample);
                sb.append(sample.getSymbol() + " \t" + sample.getLast_Sale());
                sb.append("\n");
            }
        }
        catch (IOException e){
            Log.wtf("SlideshowFragment","Error reading data on line" + line,e);
            e.printStackTrace();
        }
        return sb;
    }
    private StringBuilder ReadStocksSample_Spinner3(){
        InputStream is = getResources().openRawResource(R.raw.stocklist);
        StringBuilder sb = new StringBuilder(300);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try{
            while((line= reader.readLine())!=null){
                String[] tokens = line.split(",");
                StockSamples sample = new StockSamples();
                sample.setSymbol(tokens[0]);
                sample.setName(tokens[1]);
                sample.setLast_Sale(tokens[2]);
                sample.setNet_Change(tokens[3]);
                sample.setChance_percent(tokens[4]);
                sample.setMarket_cap(tokens[5]);
                sample.setIpo_year(tokens[6]);
                sample.setVolume(tokens[7]);
                sample.setSector(tokens[8]);
                sample.setSector(tokens[9]);
                priceList4.add(sample);
                sb.append(sample.getName());
                sb.append("\n");
                sb.append("Symbol: " + sample.getSymbol() + "\n");
                sb.append("Close Price: " + sample.getLast_Sale() + "\n");
                sb.append("Net Change: " + sample.getNet_Change() + "\n");
                sb.append("Change in %: " + sample.getChance_percent() + "\n");
                sb.append("Market Capital: " + sample.getMarket_cap() + "\n");
                sb.append("IPO Year: " + sample.getIpo_year() + "\n");
                sb.append("Volume: " + sample.getVolume() + "\n");
                sb.append("Sector: " + sample.getSector() + "\n");
                sb.append("Industry: " + sample.getIndustry() + "\n");
                sb.append("\n\n");
            }
        }
        catch (IOException e){
            Log.wtf("SlideshowFragment","Error reading data on line" + line,e);
            e.printStackTrace();
        }
        return sb;
    }
    private class readCSV extends AsyncTask<Void, Void, StringBuilder> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected StringBuilder doInBackground(Void... voids) {
            InputStream is = getResources().openRawResource(R.raw.stocklist);
            StringBuilder sb = new StringBuilder(400);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is, Charset.forName("UTF-8"))
            );
            String line = "";
            try{
                while((line= reader.readLine())!=null){
                    String[] tokens = line.split(",");
                    StockSamples sample = new StockSamples();
                    sample.setSymbol(tokens[0]);
                    sample.setName(tokens[1]);
                    sample.setLast_Sale(tokens[2]);
                    sample.setNet_Change(tokens[3]);
                    sample.setChance_percent(tokens[4]);
                    sample.setMarket_cap(tokens[5]);
                    sample.setIpo_year(tokens[6]);
                    sample.setVolume(tokens[7]);
                    sample.setSector(tokens[8]);
                    sample.setSector(tokens[9]);
                    priceList4.add(sample);
                    sb.append(sample.getName());
                    sb.append("\n");
                    sb.append("Symbol: " + sample.getSymbol() + "\n");
                    sb.append("Close Price: " + sample.getLast_Sale() + "\n");
                    sb.append("Net Change: " + sample.getNet_Change() + "\n");
                    sb.append("Change in %: " + sample.getChance_percent() + "\n");
                    sb.append("Market Capital: " + sample.getMarket_cap() + "\n");
                    sb.append("IPO Year: " + sample.getIpo_year() + "\n");
                    sb.append("Volume: " + sample.getVolume() + "\n");
                    sb.append("Sector: " + sample.getSector() + "\n");
                    sb.append("Industry: " + sample.getIndustry() + "\n");
                    sb.append("\n\n");
                }
            }
            catch (IOException e){
                Log.wtf("SlideshowFragment","Error reading data on line" + line,e);
                e.printStackTrace();
            }
            return sb;
        }

        @Override
        protected void onPostExecute(StringBuilder stringBuilder) {
            super.onPostExecute(stringBuilder);
            tv.setText(stringBuilder);
        }
    }
}
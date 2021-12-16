package moin.miley.cse489.stock_prediction_project.ui.AboutUs;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import moin.miley.cse489.stock_prediction_project.R;

public class AboutUsFragment extends Fragment {
    private Button button1, button2, button3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_aboutus, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        button1 = (Button) getView().findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                String[] recipients = new String[]{"2018-3-60-047@std.ewubd.edu", "",};
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Test");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "This is email's message");
                emailIntent.setType("text/plain");
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            }
        });
        button2 = (Button) getView().findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                String[] recipients = new String[]{"2018-3-60-099@std.ewubd.edu", "",};
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Test");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "This is email's message");
                emailIntent.setType("text/plain");
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            }
        });
        button3 = (Button) getView().findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                String[] recipients = new String[]{"stockpredictionapp.cse489@gmail.com", "",};
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Test");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "This is email's message");
                emailIntent.setType("text/plain");
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            }
        });
    }
}

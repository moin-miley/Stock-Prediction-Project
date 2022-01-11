package moin.miley.cse489.stock_prediction_project.ui.gallery;
//Gallery = Profile page

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import moin.miley.cse489.stock_prediction_project.R;
import moin.miley.cse489.stock_prediction_project.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
    private TextView dateTimeDisplay, timedisplay;
    private Calendar calendar;
    private SimpleDateFormat dateFormat, dateFormat2;
    private String date, date2;
    TextView fullname_field,email_field,fullname,email_info,phoneNum;
    private FragmentGalleryBinding binding;
    private SharedPreferences sharedPreferences;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sharedPreferences = this.getActivity().getSharedPreferences("LoginSharedPrefs", Context.MODE_PRIVATE);
        fullname_field = getView().findViewById(R.id.fullname_field);
        email_field = getView().findViewById(R.id.email_field);
        fullname = getView().findViewById(R.id.fullname);
        email_info = getView().findViewById(R.id.email_info);
        phoneNum = getView().findViewById(R.id.phoneNumber);

        String FirstName = sharedPreferences.getString("FIRST_NAME",null);
        String LastName = sharedPreferences.getString("LAST_NAME",null);
        String FullName = FirstName + " " + LastName;
        String emailID = sharedPreferences.getString("EMAIL",null);
        String phone = sharedPreferences.getString("PHONE",null);

        fullname_field.setText(FullName);
        fullname.setText(FullName);
        email_field.setText(emailID);
        email_info.setText(emailID);
        phoneNum.setText(phone);

        calendar = Calendar.getInstance();
        dateTimeDisplay = getView().findViewById(R.id.textDate);
        timedisplay = getView().findViewById(R.id.texttime);
        dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dateFormat2 = new SimpleDateFormat("hh:mm aaa");
        date = dateFormat.format(calendar.getTime());
        date2 = dateFormat2.format(calendar.getTime());
        dateTimeDisplay.setText(date);
        timedisplay.setText(date2);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
package moin.miley.cse489.stock_prediction_project.ui.News;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import moin.miley.cse489.stock_prediction_project.R;

public class NewsChannel3 extends Fragment{
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.news_channel_1, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        WebView myWebView = (WebView) getView().findViewById(R.id.webviewNew1);
        myWebView.loadUrl("http://www.sharebazarnews.com/");
    }
}


package moin.miley.cse489.stock_prediction_project.ui.StockList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StockListViewModel extends ViewModel{

    private MutableLiveData<String> mText;

    public StockListViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public static LiveData<String> getText() {
        return mText;
    }
}

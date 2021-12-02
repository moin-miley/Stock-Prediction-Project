package moin.miley.cse489.stock_prediction_project.ui.StockList;
//Stock List = Profile page

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import moin.miley.cse489.stock_prediction_project.R;
import moin.miley.cse489.stock_prediction_project.databinding.FragmentGalleryBinding;
import moin.miley.cse489.stock_prediction_project.databinding.FragmentSlideshowBinding;
import moin.miley.cse489.stock_prediction_project.ui.gallery.GalleryViewModel;

public class StockListFragment extends Fragment {

    private StockListViewModel SLViewModel;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SLViewModel =
                new ViewModelProvider(this).get(StockListViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        StockListViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
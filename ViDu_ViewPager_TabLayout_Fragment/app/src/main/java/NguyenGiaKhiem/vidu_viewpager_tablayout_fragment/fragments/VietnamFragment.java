package NguyenGiaKhiem.vidu_viewpager_tablayout_fragment.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import NguyenGiaKhiem.vidu_viewpager_tablayout_fragment.R;

public class VietnamFragment extends Fragment {

    public VietnamFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vietnam, container, false);
    }
}
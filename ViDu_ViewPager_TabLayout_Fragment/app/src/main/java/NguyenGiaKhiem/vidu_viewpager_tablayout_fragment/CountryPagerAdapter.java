package NguyenGiaKhiem.vidu_viewpager_tablayout_fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

// Sửa lại đường dẫn import đúng theo package của bạn
import NguyenGiaKhiem.vidu_viewpager_tablayout_fragment.fragments.JapanFragment;
import NguyenGiaKhiem.vidu_viewpager_tablayout_fragment.fragments.USAFragment;
import NguyenGiaKhiem.vidu_viewpager_tablayout_fragment.fragments.VietnamFragment;

public class CountryPagerAdapter extends FragmentStateAdapter {

    public CountryPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new VietnamFragment();
            case 1:
                return new JapanFragment();
            case 2:
                return new USAFragment();
            default:
                return new VietnamFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3; // Số lượng fragment trong ViewPager
    }
}

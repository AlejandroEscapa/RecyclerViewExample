package es.master.p9_recyclerview.ViewPager.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import es.master.p9_recyclerview.Fragments.HomeFragment;
import es.master.p9_recyclerview.Fragments.OneFragment;
import es.master.p9_recyclerview.Fragments.ThreeFragment;
import es.master.p9_recyclerview.Fragments.TwoFragment;

public class PageAdapter extends FragmentStateAdapter {

    public PageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            default:
            case 0:
                return new HomeFragment();
            case 1:
                return new OneFragment();
            case 2:
                return new TwoFragment();
            case 3:
                return new ThreeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

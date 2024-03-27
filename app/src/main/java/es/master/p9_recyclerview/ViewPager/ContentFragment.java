package es.master.p9_recyclerview.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import es.master.p9_recyclerview.R;
import es.master.p9_recyclerview.ViewPager.Adapter.PageAdapter;
import es.master.p9_recyclerview.databinding.FragmentContentBinding;

public class ContentFragment extends Fragment {

    ViewPager2 viewPager2;
    TabLayout tabLayout;
    FragmentContentBinding binding;
    ViewPager2.OnPageChangeCallback listenerPage = new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }

        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            super.onPageScrollStateChanged(state);
        }
    };

    public ContentFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        PageAdapter adapter = new PageAdapter(requireActivity());
        binding.viewPager2.setAdapter(adapter);

        viewPager2 = binding.viewPager2;
        tabLayout = binding.tabLayout;

        new TabLayoutMediator(tabLayout, viewPager2, (tab, i) -> {
            switch (i) {
                case 0:
                    tab.setIcon(R.drawable.photo_camera_icon);
                    tab.view.setBackgroundColor(Color.parseColor("#5B4FC3F7"));
                    break;
                case 1:
                    tab.setIcon(R.drawable.car_icon);
                    tab.view.setBackgroundColor(Color.parseColor("#799575CD"));
                    break;
                case 2:
                    tab.setIcon(R.drawable.mountain_icon);
                    tab.view.setBackgroundColor(Color.parseColor("#65F06292"));
                    break;
                case 3:
                    tab.setIcon(R.drawable.face_icon);
                    tab.view.setBackgroundColor(Color.parseColor("#72FFF176"));
                    break;
            }
        }).attach();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (getContext() != null) {
                    tab.getIcon().setTintList(ContextCompat.getColorStateList(getContext(),
                            R.color.white));
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setTintList(ContextCompat.getColorStateList(getContext(),
                        R.color.black));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        binding.viewPager2.registerOnPageChangeCallback(listenerPage);
    }

    @Override
    public void onStop() {
        super.onStop();
        binding.viewPager2.unregisterOnPageChangeCallback(listenerPage);
    }
}
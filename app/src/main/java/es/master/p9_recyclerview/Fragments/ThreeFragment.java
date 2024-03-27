package es.master.p9_recyclerview.Fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import es.master.p9_recyclerview.LoginActivity;
import es.master.p9_recyclerview.R;
import es.master.p9_recyclerview.databinding.FragmentThreeBinding;

public class ThreeFragment extends Fragment {

    FragmentThreeBinding binding;

    public ThreeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThreeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() != null) {
            binding.btnSkip.setOnClickListener(view1 -> {
                //Nos desplazamos a la activity Login
                Intent goLogin = new Intent(getActivity(), LoginActivity.class);
                startActivity(goLogin);
            });
        }
    }
}
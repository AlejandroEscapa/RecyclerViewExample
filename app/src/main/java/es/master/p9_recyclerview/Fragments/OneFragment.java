package es.master.p9_recyclerview.Fragments;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import es.master.p9_recyclerview.R;
import es.master.p9_recyclerview.Vehiculo;
import es.master.p9_recyclerview.VehiculoAdapter;
import es.master.p9_recyclerview.databinding.FragmentOneBinding;

public class OneFragment extends Fragment {

    FragmentOneBinding binding;
    List<Vehiculo> vehiculos;

    public OneFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        llenarListaCoches();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOneBinding.inflate(inflater, container, false);

        Log.i("depurando",vehiculos.toString());

        binding.rvVistaDatos.setAdapter(new VehiculoAdapter(vehiculos));
        binding.rvVistaDatos.setLayoutManager(new LinearLayoutManager(requireContext(),
                LinearLayoutManager.VERTICAL, false));
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void llenarListaCoches() {

        //Añado la lista de vehiculos y asigno sus colores.
        vehiculos = new ArrayList<>();

        Vehiculo classicCar = new Vehiculo("Classic Car", 34,
                R.drawable.avatar_classicar, Color.parseColor("#C6984F38"));

        Vehiculo sportCar = new Vehiculo("Sport Car", 65,
                R.drawable.avatar_sportcar, Color.parseColor("#FF4FC3F7"));

        Vehiculo flyingCar = new Vehiculo("Flying Car", 500,
                R.drawable.avatar_flyingcar, Color.parseColor("#852731F4"));

        Vehiculo electricCar = new Vehiculo("Electric Car", 45,
                R.drawable.avatar_electricar, Color.parseColor("#FF070F2B"));

        Vehiculo motorHome = new Vehiculo("Motorhome", 23,
                R.drawable.avatar_motorhome, Color.parseColor("#C1409377"));

        Vehiculo pickupCar = new Vehiculo("Pickup Car", 10,
                R.drawable.avatar_pickupcar, Color.parseColor("#D5914730"));

        Vehiculo airplane = new Vehiculo("Airplane", 11,
                R.drawable.avatar_airplane, Color.parseColor("#D5852421"));

        Vehiculo bus = new Vehiculo("Bus", 14,
                R.drawable.avatar_bus, Color.parseColor("#ADCFA213"));

        vehiculos.add(classicCar);
        vehiculos.add(sportCar);
        vehiculos.add(flyingCar);
        vehiculos.add(electricCar);
        vehiculos.add(motorHome);
        vehiculos.add(pickupCar);
        vehiculos.add(airplane);
        vehiculos.add(bus);
    }
}
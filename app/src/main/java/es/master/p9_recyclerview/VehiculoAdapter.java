package es.master.p9_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.master.p9_recyclerview.databinding.VehiculoLayoutBinding;

public class VehiculoAdapter extends RecyclerView.Adapter {
    List<Vehiculo> vehiculos;

    public VehiculoAdapter(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.vehiculo_layout, parent, false);
        return new VehiculoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VehiculoViewHolder vehiculoViewHolder = (VehiculoViewHolder) holder;
        vehiculoViewHolder.binding.setVehiculo(vehiculos.get(position));

        //Al seleccionar un item despliego un Toast con la información.
        holder.itemView.setOnClickListener(view -> {
            Toast.makeText(view.getContext(), vehiculos.get(position).mostrarInfo(),
                    Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return vehiculos.size();
    }


    static class VehiculoViewHolder extends RecyclerView.ViewHolder {

        VehiculoLayoutBinding binding;

        public VehiculoViewHolder(@NonNull View view) {
            super(view);
            binding = VehiculoLayoutBinding.bind(view);
        }
    }
}

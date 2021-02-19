package com.example.suresales;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CarRecViewAdapter extends RecyclerView.Adapter<CarRecViewAdapter.ViewHolder> {
    private static final String TAG = "CarRecViewAdapter";

    private ArrayList<Car> cars = new ArrayList<>();
    private Context mContext;

    public CarRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_cars, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: Called");
        holder.carName.setText(cars.get(position).getName());
        holder.stoke.setText((int) cars.get(position).getStoke());
        holder.vin.setText((int) cars.get(position).getVin());
        holder.color.setText(cars.get(position).getColor());
        holder.mileage.setText((int) cars.get(position).getMileage());
        holder.dateTime.setText((int) cars.get(position).getDate());
        Glide.with(mContext)
                .asBitmap()
                .load(cars.get(position).getImageUrl())
                .into(holder.imgCar);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, cars.get(position).getName() + "Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cars.size();

    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private CardView parent;
        private ImageView imgCar;
        private TextView carName;
        private CheckBox isPassed;
        private TextView stoke;
        private TextView vin;
        private TextView color;
        private TextView mileage;
        private TextView dateTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            imgCar = itemView.findViewById(R.id.carName);
        }
    }
}

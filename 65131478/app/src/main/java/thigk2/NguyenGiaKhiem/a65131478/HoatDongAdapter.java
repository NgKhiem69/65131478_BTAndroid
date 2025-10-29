package thigk2.NguyenGiaKhiem.a65131478;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HoatDongAdapter extends RecyclerView.Adapter<HoatDongAdapter.ViewHolder> {
    ArrayList<HoatDong> list;
    Context context;

    public HoatDongAdapter(ArrayList<HoatDong> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hoatdong, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HoatDong hd = list.get(position);
        holder.tvTieuDe.setText(hd.getTieude());
        holder.tvThoigian.setText(hd.getThoigian());
        holder.imgAnh.setImageResource(hd.getAnh());

        holder.itemView.setOnClickListener(v -> {
            Intent i = new Intent(context, Item4Activity.class);
            i.putExtra("tieude", hd.getTieude());
            i.putExtra("thoigian", hd.getThoigian());
            context.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTieuDe, tvThoigian;
        ImageView imgAnh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTieuDe = itemView.findViewById(R.id.tvTieuDe);
            tvThoigian = itemView.findViewById(R.id.tvThoigian);
            imgAnh = itemView.findViewById(R.id.imgAnh);
        }
    }
}

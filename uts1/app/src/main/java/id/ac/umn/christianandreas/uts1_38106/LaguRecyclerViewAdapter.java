package id.ac.umn.christianandreas.uts1_38106;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class LaguRecyclerViewAdapter extends RecyclerView.Adapter<LaguRecyclerViewAdapter.LaguViewHolder> {
    ArrayList<Lagu> arrayListLagu;

    public LaguRecyclerViewAdapter(ArrayList<Lagu> arrayListLagu) {
        this.arrayListLagu = arrayListLagu;
    }

    @NonNull
    @Override
    public LaguRecyclerViewAdapter.LaguViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listlagu, parent, false);
        return new LaguViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaguRecyclerViewAdapter.LaguViewHolder holder, int position) {
        final Lagu lagu = arrayListLagu.get(position);

        holder.textViewJudul.setText(lagu.getJudul());
        holder.textViewPenyanyi.setText(lagu.getPenyanyi());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), MainActivity5.class);
            intent.putExtra("LAGU", lagu);
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return arrayListLagu.size();
    }

    public class LaguViewHolder extends RecyclerView.ViewHolder {
        TextView textViewJudul, textViewPenyanyi;
        ImageView delete;

        public LaguViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewJudul = itemView.findViewById(R.id.tvJudul);
            textViewPenyanyi = itemView.findViewById(R.id.tvPenyanyi);

            delete = itemView.findViewById(R.id.delete);
            delete.setOnClickListener(view -> delete(getPosition()));

        }

        public void delete(int delete) {
            arrayListLagu.remove(delete);
            notifyItemRemoved(delete);
            notifyItemRangeChanged(delete, arrayListLagu.size());
        }
    }

}

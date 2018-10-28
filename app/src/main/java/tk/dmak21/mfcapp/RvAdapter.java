package tk.dmak21.mfcapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {

    private List<RvItem> rvItems;
    private Context context;

    public RvAdapter(List<RvItem> rvItems, Context context) {
        this.rvItems = rvItems;
        this.context = context;
    }

    //    will be called whenever our viewholder is created
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rv_item, viewGroup, false);
        return new ViewHolder(v);
    }

//    will be called after onCreateViewHolder.. will bind the data to RV
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        RvItem rvItem = rvItems.get(i);

        viewHolder.data.setText(rvItem.getData());
    }

    @Override
    public int getItemCount() {
        return rvItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView data;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            data = (TextView) itemView.findViewById(R.id.rv_item);
        }
    }
}

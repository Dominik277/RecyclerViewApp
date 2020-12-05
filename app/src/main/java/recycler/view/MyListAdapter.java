package recycler.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {

    public MyListData[] listData;

    public MyListAdapter(MyListData[] listData){
        this.listData = listData;
    }

    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.jedan_redak,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {
        final MyListData myListData = listData[position];
        holder.drzava.setText(listData[position].getDrzava());
        holder.kontinent.setText(listData[position].getKontinent());
        holder.slika.setImageResource(listData[position].getSlika());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Click on item: "
                + myListData.getDrzava(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView slika;
        public TextView drzava;
        public TextView kontinent;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.slika = itemView.findViewById(R.id.slika);
            this.drzava = itemView.findViewById(R.id.drzava);
            this.kontinent = itemView.findViewById(R.id.kontinent);
            this.linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }

}

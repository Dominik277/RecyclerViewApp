package recycler.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.jedan_redak,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

        ViewModel drzave = mDrzave.get(position);

        TextView imeDrzave = holder.imeDrzave;
        imeDrzave.setText(drzave.getDrzava());

        TextView imeKontinenta = holder.imeKontinenta;
        imeKontinenta.setText(drzave.getKontinent());

    }

    @Override
    public int getItemCount() {
        return mDrzave.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView imeDrzave;
        public TextView imeKontinenta;
        public ImageView slika;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imeDrzave = itemView.findViewById(R.id.imeDrzave);
            imeKontinenta = itemView.findViewById(R.id.imeKontinenta);
            slika = itemView.findViewById(R.id.slika);
        }
    }

    private List<ViewModel> mDrzave;
    public RecyclerViewAdapter(List<ViewModel> drzave){
        this.mDrzave = drzave;
    }

}

package recycler.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


//nasa custom klasa RecyclerViewAdapter koja nasljeđuje RecyclerView.Adapter
//posto nasa klasa je podklasa ona mora implementirati sve metode koje se nalaze u nadklasi
//a to su metode onCreateViewHolder,onBindViewHolder i getItemCount
//adapter objekti sluzi za "data management",oni reguliraju opskrrbljivanje
//recyclerviewa podacima
//zadaca adaptera objekta je da dokuci podatke iz modela, procesuira te podatke
// te ih onda posalje RecyclerView-u preko ViewHolder objekata koji onda "bindaju" te
//podatke na pojedine UI elemente u retku
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    //ova metoda se poziva kada je adapter kreiran i koristi se
    //kada zelimo inicijalizirati ViewHolder objekt
    //ova metoda vraca viewHolder objekt za svaki redak
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }


    //ova metoda se poziva za svaki ViewHolder objekt
    //u parametrima predajemo podatke za ViewHolder
    //"binda" podatke iz modela u pojedine UI elemente na specificnoj poziciji
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }


    //vraca ukupan broj elemenata, a ti elementi sadrzavaju
    //item-e koje mi zelimo prikazati
    @Override
    public int getItemCount() {
        return 0;
    }

    //nasa custom ViewHolder klasa koja nam omogucava pristup svim nasim
    //view-ovima koji se nalaze unutar jednog retka
    //glavna zadaca ViewHolder-a je da "displeya" pojedine view-ove
    //pojedinog retka s podacima koji se nalaze u adapter objektu
    //ViewHolder objekti sluze za "bindanje" informacija u pojedini UI element
    public class ViewHolder extends RecyclerView.ViewHolder{

        //ovdje smo direktno referencirali imena s kojima
        //cemo pristupati pojedinim view-ovima koje smo
        //definirali unutar XML-a
        public TextView imeDrzave;
        public TextView imeKontinenta;
        public ImageView slika;

        //automatski smo implementirali ViewHolder konstruktor
        //koji prihvaca cijeli redak
        //preko public membera itemView mozemo pristupati
        //root view-ovima ViewHolder-a
        //ovaj konstruktor uzima parent View layouta od jednog retka
        //koji nam dopusta da postavimo sve view-ove koje trebamo
        //kako bi prikazali podatke
        public ViewHolder(@NonNull View itemView) {

            //
            super(itemView);


            //onim varijablama koje smo definirali izvan ovog konstruktora
            //sada dodjeljujemo vrijednosti, a to zamisljamo kao da spajamo
            //imena varijabli sa imenima view-ova koji se nalaze u XML-u
            imeDrzave = itemView.findViewById(R.id.imeDrzave);
            imeKontinenta = itemView.findViewById(R.id.imeKontinenta);
            slika = itemView.findViewById(R.id.slika);
        }
    }

}

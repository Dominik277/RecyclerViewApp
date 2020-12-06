package recycler.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MojCustomAdapter extends RecyclerView.Adapter<MojCustomAdapter.ViewHolder> {

    //varijabla listaPodataka tipa MojaListaPodatak je array
    //ovdje smo ju samo stvoriili,nismo jos nista u nju spremili
    public MojaListaPodataka[] mojaListaPodataka;


    //ovo je custom konstruktor koji mi pravimo,kao parametar uzima objekt
    //klase MojaLista podataka,ovo smo implementirali u main klasi, kada pravimo
    //objekt od ove klase kao parametar mu dajemo objekt od POJO klase koji u sebi
    //sadrzi sve podatke vezane za aplikaciju, u nasem slucaju objekt koji opskrbljujemo
    //konstruktoru sadrzi dva String atributa drzava i kontinent, i int za sliku
    public MojCustomAdapter(MojaListaPodataka[] mojaListaPodataka){
        this.mojaListaPodataka = mojaListaPodataka;
    }



    //kada pravimo adapter klasu,ta klasa mora nasljediti RecyclerView.Adapter klasu koja u sebi ima tri
    //metode koje se obavezno moraju implementirati, a to su onCreateViewHolder,onBindViewHolder i getItemCount
    //parent -->
    //viewType -->
    @NonNull
    @Override
    public MojCustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //LayoutInflater-ova zadaca je da uzme datoteke iz XML-a i pretvori ih u
        //objekte View tipa.Tako smo u ovom slucaju stvorili varijablu layoutInflater
        //tipa LayoutInflater u koju smo spremili vrijednosti koju smo dobili sa desne strane jednađbe
        //ako neki view postoji u XML- datotekama onda ga dohvacamo preko metode findViewById()
        //a ako view jos ne postoji onda ga kreiramo sa LayouInflater-om
        //??????????
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());


        //napravili smo varijablu listItem tipa View u koju pohranjujemo sve sto se odredi
        //na desnoj strani.Na desnoj strani nakon znaka jednako imamo objekt layoutInflater tipa
        //LayoutInflater koji na sebe poziva metodu inflate.Metoda inflate
        //??????????
        View listItem = layoutInflater.inflate(R.layout.jedan_redak,parent,false);


        //na lijevoj strani smo stvorili samo referencu preko koje cemo pristupati objektu
        //na desnoj strani smo stvorili objekt u memoriji koji.Ako pogledamo na dnu ovog koda
        //vidimo da samo napravili jos jednu klasu ViewHolder koja kao konstruktor prima
        //objekt tipa View.U nasem slucaju kao objekt tipa View smo konstruktor opskrbili sa
        //objektom listItem koji u sebi ima pohranjen layout jedan_redak.xml,parent i false.
        //???????????
        ViewHolder viewHolder = new ViewHolder(listItem);


        //return naredba nam samo govori da onCreateViewHolder vraca u svoje ime objekt viewHolder
        //i sve ono sto je u njega pohranjeno,svi podaci
        return viewHolder;
    }

    //

    @Override
    public void onBindViewHolder(@NonNull MojCustomAdapter.ViewHolder holder, int position) {

        //
        final MojaListaPodataka mojaListaPodataka = this.mojaListaPodataka[position];

        //
        holder.drzava.setText(this.mojaListaPodataka[position].getDrzava());

        //
        holder.kontinent.setText(this.mojaListaPodataka[position].getKontinent());

        //
        holder.slika.setImageResource(this.mojaListaPodataka[position].getSlika());

        //
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {

            //ovo je metoda koja je pozvana kada je jedan od jedana pritisnut
            //u njenom tijelu govorimo sta ce se desiti kada kliknemo bilo koji
            //redak u RecyclerView-u
            //View v --> ??????????
            @Override
            public void onClick(View v) {

                //u ovoj metodi smo naveli da prilikom klika na bilo koji od redaka
                //cemo izbaciti Toast poruku, metoda koja nam to omogucuje je makeText
                //v.getContext --> ??????????
                //mojaListaPodataka.getDrzava() --> mojaListaPodataka je objekt koji u sebi sadrzi sve podatke potrebne za aplikaciju.
                //                                  mojaListaPodataka se inicijalizira preko konstruktora koji ima tri parametra koji
                //                                  smo naveli u MojaListaPodataka POJO klasi.Da bi izvukli vrijednsti iz pojedinog objekt
                //                                  to moramo pomocu get metode jer su atributi sa private access specifierom.Tako da nam
                //                                  getDrzava vraca ime drzave onog reda na koji je kliknut
                //mojaListaPodataka.getKontinent -->isto sve se odnosi i na ovaj redak,jedina je razlika u tome da getKontinent vraca
                //                                  ime kontinenta koji je pohranjen u pojedinom objektu
                //Toast.LENGHT_LONG --> ovaj dio nam samo govori hoce li se Toast poruka na ekranu zadrzati dugo ili malo
                Toast.makeText(v.getContext(),"Drzava: "
                + mojaListaPodataka.getDrzava() + "\n"+ "Kontinent: " + mojaListaPodataka.getKontinent(),Toast.LENGTH_LONG).show();
            }
        });
    }


    //ova metoda bi trebala vratiti broj list item-a
    //u nasem slucaju mi vracamo mojaListaPodataka.lenght
    //varijabla lista podataka je array u u nju smo spremili sve one vrijednosti
    //koje smo naveli unutar MainActivity-a.Znaci mojaListaPodataka u sebi sadrzi
    //12 objekata koji u sebi sadrze imena drzava,kontinata i slike.Metoda lenght
    //izracunava koliko ima elemeneta u tom array-u unutar objekta mojaLista podataka.
    //kada izracuna da u tom objektu ima 12 elemenata ona vraca broj 12 u ime metode
    //jer je metoda tipa int
    @Override
    public int getItemCount() {
        return mojaListaPodataka.length;
    }


    //klasa ViewHolder koja nasljeđuje RecyclerView.ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder{

        //ovdje su samo navedena imena varijabli i tipovi tih varijabli
        //nismo u njih jos nista spremili ali smo ih napisali ovdje samo kao referencu
        public ImageView slika;
        public TextView drzava;
        public TextView kontinent;
        public LinearLayout linearLayout;


        //ovo je konstruktor koji kao parametar prima varijablu itemView tipa View
        //
        //itemView --> ??????
        public ViewHolder(@NonNull View itemView) {

            //???????????
            super(itemView);


            //u ovom dijelu smo definirali da one varijable koje smo na vrhu klase stvorili
            //i u kojima do sada nije bila spremljena nikakva vrijednost, de cemo sada u njih
            //spremiti neke vrijednosti.Naredbe na desnoj strani mozemo shvatiti kao to da
            //odemo u XML datoteku i trazimo id-ove od elemenata skroz dok ne nademo
            //id-ove slika,drzava i kontinent.Kada ih nađemo onda te elemente iz XML-a
            //spremamo u te varijable koje smo naveli na pocetku klase.Te varijable skroz
            //do dolaska konstruktora su bile prazne,a nakon pozivanja konstruktora u njih se
            //pohranjuju podaci
            this.slika = itemView.findViewById(R.id.slika);
            this.drzava = itemView.findViewById(R.id.drzava);
            this.kontinent = itemView.findViewById(R.id.kontinent);
            this.linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }

}

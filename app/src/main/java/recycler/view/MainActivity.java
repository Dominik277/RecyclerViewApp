package recycler.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //stvorili smo objekt tipa MojaListaPodataka kojeg cemo pozivati preko imena mojaListaPodataka
        //ovaj objekt je zapravo array jer smo to naveli pomocu viticastih zagrada
        //mi cim smo stvorili ovaj objekt on je u sebe pohranio sve ove vrijednosti koje se nalaze
        //unutar viticaste zagrade
        MojaListaPodataka mojaListaPodataka[] = new MojaListaPodataka[]{

                //sve ove linije koda,svaka linija predstavlja jedan objekt u memoriji koji se napravio
                //a ime mojaListaPodataka je samo ime preko kojeg cemo ga zvati,sto znaci da mi 12 objekata
                //referenciramo preko jednog imena, oni se razlikuju po tome jer smo naveli drugacije
                //vrijednosti unutar konstruktora.Posto je mojaListaPodataka array, on ce objekte spremati
                //kao elemente
                new MojaListaPodataka("Hrvatska", R.drawable.croatia,"Europa"),
                new MojaListaPodataka("Brazil", R.drawable.brazil,"Južna Amerika"),
                new MojaListaPodataka("Bosna i Hercegovina", R.drawable.bih,"Europa"),
                new MojaListaPodataka("Danska", R.drawable.dennmark,"Europa"),
                new MojaListaPodataka("Gana", R.drawable.ghana,"Afrika"),
                new MojaListaPodataka("Japan", R.drawable.japan,"Azija"),
                new MojaListaPodataka("Novi Zeland", R.drawable.newzealand,"Australija"),
                new MojaListaPodataka("Portugal", R.drawable.portugal,"Europa"),
                new MojaListaPodataka("Estonia", R.drawable.estonia,"Europa"),
                new MojaListaPodataka("Dialer", R.drawable.thailand,"Azija"),
                new MojaListaPodataka("SAD", R.drawable.sad,"Sjeverna Amerika"),
                new MojaListaPodataka("Kanada", R.drawable.canada,"Sjeverna Amerika"),
        };

        //u ovoj naredbi smo napravili varijablu recyclerView tipa RecyclerView koju smo izjednacili
        //s desnim dijelom.Desni dio ove naredbe odlazi u XML i trazi sta smo mi to imenovali recyclerView
        //kada nađe to on to dovlaci i sprema u varijablu pod imenom recyclerView i sada je u toj
        //varijabli spremljena ta referenca
        RecyclerView recyclerView = findViewById(R.id.recyclerView);


        //desna strana ove naredbe je zasluzena za pravljenje objekta u memoriji tipa MojCustomAdapter
        //koji u sebe prima referencu na objekt tipa MojaListaPodataka jer smo to tako naveli u nasem
        //custom konstruktoru kojeg smo napravili.To sto je kao parametar u konstruktoru naveden
        //objekt mojaListaPodataka znaci da je pri kreaciji objekta tipa MojCustomAdapter potrebno
        //tom objektu opskrbiti objekt koji sadrzava sve podatke koje on mora prikazati a to su vrijednosti
        //koje se nalaze u mojaListaPodataka objektu
        MojCustomAdapter adapter = new MojCustomAdapter(mojaListaPodataka);


        //velicina jednog retka u RecyclerView-u ce se promjeniti "no matter what" ako mu dodamo
        //ili oduzmemo neki view, zbog toga metoda setHasFixedSize osigurava da jedan redak u
        //RecyclerView-u bude uvijek jednakih dimenzija dodavali mi ili brisali view-ove iz njega
        recyclerView.setHasFixedSize(true);


        //Layoutmanager je klasa koja adapteru govori na koji nacin da poslozi podatke
        //adapter u sebi ima podatke koje treba pospremiti dok Layoutmanager govori
        //adapteru na koji nacin da prikaze podatke.Imamo vise vrsta Layout managera
        //a neki su GridLayoutManager,LinearLayoutManager...
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //naveo sam gore da je u varijablu recyclerView spremljen id iz XML-a
        //pa je on zapravo sada objekt, metoda setAdapter nam sama govori da ona
        //postavlja adapter na neki objekt, u nasem slucaju imamo objekt recyclerView od naseg
        //RecyclerView-a u activity_main-u, na njega saljemo objekt tipa MojCustom adapter
        //koji u sebi ima pohranjene sve podakte koji su potrebni za prikazivanje podataka u
        //RecyclerView-u.U konstruktoru gore je navedeno da u adapter objektu su pohranjeni svi
        //podaci koje treba prikazati a to je objekt mojaListaPodataka
        recyclerView.setAdapter(adapter);

    }
}
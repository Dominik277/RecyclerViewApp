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

        MojaListaPodataka[] myListData = new MojaListaPodataka[]{

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

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MojCustomAdapter adapter = new MojCustomAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
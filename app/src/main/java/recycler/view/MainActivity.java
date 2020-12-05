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

        MyListData[] myListData = new MyListData[]{

                new MyListData("Hrvatska", R.drawable.croatia,"Europa"),
                new MyListData("Brazil", R.drawable.brazil,"Južna Amerika"),
                new MyListData("Bosna i Hercegovina", R.drawable.bih,"Europa"),
                new MyListData("Danska", R.drawable.dennmark,"Europa"),
                new MyListData("Gana", R.drawable.ghana,"Afrika"),
                new MyListData("Japan", R.drawable.japan,"Azija"),
                new MyListData("Novi Zeland", R.drawable.newzealand,"Australija"),
                new MyListData("Portugal", R.drawable.portugal,"Europa"),
                new MyListData("Estonia", R.drawable.estonia,"Europa"),
                new MyListData("Dialer", R.drawable.thailand,"Azija"),
                new MyListData("SAD", R.drawable.sad,"Sjeverna Amerika"),
                new MyListData("Kanada", R.drawable.canada,"Sjeverna Amerika"),
        };

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
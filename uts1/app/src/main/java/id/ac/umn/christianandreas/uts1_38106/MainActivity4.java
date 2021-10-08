package id.ac.umn.christianandreas.uts1_38106;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    RecyclerView recyclerView;
    LaguRecyclerViewAdapter adapter;
    ArrayList<Lagu> objLagu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        recyclerView = findViewById(R.id.recyclerView);

        objLagu.add(new Lagu("Blue Jeans",
                "Gangga Kusuma",
                "lagu1"));
        objLagu.add(new Lagu("Couldn’t Save You",
                "Ardhito Pramono ft. Aurélie ",
                "lagu2"));
        objLagu.add(new Lagu("It’s You",
                "Sezairi",
                "lagu3"));
        objLagu.add(new Lagu("Sudah",
                "Ardhito Pramono",
                "lagu4"));
        objLagu.add(new Lagu("Cigarettes of Ours",
                "Ardhito Pramono",
                "lagu5"));
        objLagu.add(new Lagu("keepyousafe",
                "Yahya",
                "lagu6"));
        objLagu.add(new Lagu("Cryin' in My Room",
                "Arash Buana, Raissa Anggiani",
                "lagu7"));
        objLagu.add(new Lagu("Closure",
                "Pamungkas",
                "lagu8"));
        objLagu.add(new Lagu("Fine Today",
                "Ardhito Pramono",
                "lagu9"));
        objLagu.add(new Lagu("Pelangi",
                "HIVI!",
                "lagu10"));

        adapter = new LaguRecyclerViewAdapter(objLagu);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity4.this));
    }
}
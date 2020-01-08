package id.ac.poliban.mi.renaldykambayu.desainaplikasifriendlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<String> friends = new ArrayList<>();
    {
        friends.add("Ahmad irfan");
        friends.add("Akhmad Indrawan");
        friends.add("Andre Ramadandhi");
        friends.add("Andri Sudarman");
        friends.add("Diana");
        friends.add("Ginna Melati Adini");
        friends.add("Iffa Nafiatul Nissa");
        friends.add("Lidya Lusiana");
        friends.add("Mellisa Ariani");
        friends.add("Muhamad Ade Setiawan");
        friends.add("Purnama");
        friends.add("Raf'i Hidayat Noor");
        friends.add("Radika Ramadhani");
        friends.add("Renaldy Kambayu");
        friends.add("Sarwan");
        friends.add("Tasya Ismayanti Novianda");
        friends.add("Yunita Rahmah");
        friends.add("Rezal Nob alfansyah");
        friends.add("Agustya Fajriati");
        friends.add("Ratu Hana Yunita");
        friends.add("M Rizky Maulana");
        friends.add("Radiansyah");
        friends.add("Taudan Ryanda Utama");
        friends.add("Magfirah Maulidya");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    if (getSupportActionBar()!=null)
        setTitle("Aplikasi Friend List");
    
    ListView listView = findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
               R.layout.item_rows_friend, R.id.tv_item_friend, friends );
        
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(((parent, view, position, id) -> Toast.makeText(this, "anda mengklik " +
                friends.get(position), Toast.LENGTH_SHORT).show()));
    }
}

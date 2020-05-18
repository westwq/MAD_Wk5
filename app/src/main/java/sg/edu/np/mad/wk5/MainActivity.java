package sg.edu.np.mad.wk5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> data =  new ArrayList<>();
//        data.add("Samsung");
//        data.add("LG");
//        data.add("Acer");
        for(int i=0; i<100; i++)
        {
            data.add("#" + i);
        }

        RecyclerView rv = findViewById(R.id.recyclerView);

        BrandsAdapter adapter = new BrandsAdapter(data);
        rv.setAdapter(adapter);

        LinearLayoutManager layout = new LinearLayoutManager(this);
        //layout.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv.setLayoutManager(layout);
        //rv.setItemAnimator(new DefaultItemAnimator());

    }
}

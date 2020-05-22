package sg.edu.np.mad.wk5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import sg.edu.np.mad.wk5.BrandsRecyclerView.BrandsAdapter;
import sg.edu.np.mad.wk5.BrandsRecyclerView.Post;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Post> data =  new ArrayList<>();
//        data.add("Samsung");
//        data.add("LG");
//        data.add("Acer");
        for(int i=0; i<100; i++)
        {
            Post post = new Post();
            post.title = "title "+ i;
            post.username = "username " + i;

            data.add(post);
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

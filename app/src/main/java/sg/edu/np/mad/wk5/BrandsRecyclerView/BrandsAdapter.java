package sg.edu.np.mad.wk5.BrandsRecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import sg.edu.np.mad.wk5.R;

class PostViewHolder extends RecyclerView.ViewHolder {
    TextView txtTitle;
    TextView txtUsername;

    public PostViewHolder(View v) {
        super(v);
        txtTitle = v.findViewById(R.id.username);
        txtUsername = v.findViewById(R.id.textView2);
    }
}

public class BrandsAdapter extends RecyclerView.Adapter<BrandViewHolder> {
    ArrayList<Post> data;

    public BrandsAdapter(ArrayList<Post> inputData)
    {
        data = inputData;
    }

    @NonNull
    @Override
    public BrandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("RV","viewtype " + viewType);

        View v = null;
        if(viewType == 0)
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_post, parent, false);
        else
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_post2, parent, false);

        Log.d("RV", "onCreate");
        return new BrandViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandViewHolder holder, final int position) {
        Post information = data.get(position);
        holder.txtTitle.setText(information.title);
        holder.txtUsername.setText(information.username);
        //information/text/image to be displayed on to ViewHolder

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("RV", "print " + position);
            }
        });

        Log.d("RV", "onBind " + position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        Post information = data.get(position);
        //char c = information.username.charAt(information.username.length()-1);


        return position % 2;
    }
}

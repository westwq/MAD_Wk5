package sg.edu.np.mad.wk5;

import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BrandsAdapter extends RecyclerView.Adapter<BrandViewHolder> {
    ArrayList<String> data;

    public BrandsAdapter(ArrayList<String> inputData)
    {
        data = inputData;
    }

    @NonNull
    @Override
    public BrandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, null);

        Log.d("RV", "onCreate");
        return new BrandViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandViewHolder holder, int position) {
        String information = data.get(position);
        holder.txt.setText(information);
        //information/text/image to be displayed on to ViewHolder

        Log.d("RV", "onBind " + position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

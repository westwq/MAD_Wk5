package sg.edu.np.mad.wk5.BrandsRecyclerView;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import sg.edu.np.mad.wk5.R;

public class BrandViewHolder extends RecyclerView.ViewHolder {
    TextView txtTitle;
    TextView txtUsername;
    View view;

    public BrandViewHolder(View v) {
        super(v);
        view = v;
        txtTitle = v.findViewById(R.id.username);
        txtUsername = v.findViewById(R.id.textView2);
    }
}

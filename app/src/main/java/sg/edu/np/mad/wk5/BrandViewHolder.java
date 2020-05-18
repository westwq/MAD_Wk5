package sg.edu.np.mad.wk5;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BrandViewHolder extends RecyclerView.ViewHolder {
    TextView txt;

    public BrandViewHolder(View v) {
        super(v);
        txt = v.findViewById(android.R.id.text1);
    }
}

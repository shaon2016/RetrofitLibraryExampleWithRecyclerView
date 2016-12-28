package shaoniiuc.com.recyclerviewwithretrofit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import shaoniiuc.com.recyclerviewwithretrofit.R;
import shaoniiuc.com.recyclerviewwithretrofit.model.User;
import shaoniiuc.com.recyclerviewwithretrofit.viewholders.RecyclerViewHolder;

/**
 * Created by Shaon on 4/17/2016.
 */
public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerViewHolder> {

    private List<User> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context,
                               List<User> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row, null);
        RecyclerViewHolder rcv = new RecyclerViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.name.setText(itemList.get(position).getName());
        holder.hobby.setText(itemList.get(position).getHobby());

    }

    @Override
    public int getItemCount() {

        return this.itemList.size();
    }


}
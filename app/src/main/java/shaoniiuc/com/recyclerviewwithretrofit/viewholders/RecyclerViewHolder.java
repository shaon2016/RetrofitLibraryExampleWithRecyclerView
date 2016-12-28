package shaoniiuc.com.recyclerviewwithretrofit.viewholders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import shaoniiuc.com.recyclerviewwithretrofit.R;
import shaoniiuc.com.recyclerviewwithretrofit.model.User;

/**
 * Created by Shaon on 4/17/2016.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder implements
    View.OnClickListener{



    public TextView name, hobby;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        // listener must be here
        itemView.setOnClickListener(this);

        name = (TextView)itemView.findViewById(R.id.name);
        hobby = (TextView)itemView.findViewById(R.id.hobby);
    }



    @Override
    public void onClick(View v) {

    }
}

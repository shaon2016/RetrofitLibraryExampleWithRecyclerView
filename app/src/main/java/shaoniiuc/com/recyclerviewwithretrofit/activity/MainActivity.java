package shaoniiuc.com.recyclerviewwithretrofit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import shaoniiuc.com.recyclerviewwithretrofit.R;
import shaoniiuc.com.recyclerviewwithretrofit.adapter.RecyclerViewAdapter;
import shaoniiuc.com.recyclerviewwithretrofit.model.User;
import shaoniiuc.com.recyclerviewwithretrofit.network.ApiClinet;
import shaoniiuc.com.recyclerviewwithretrofit.service.APIService;

public class MainActivity extends AppCompatActivity {
    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserList();
    }

    private void getUserList() {

        try {
            APIService service = ApiClinet.getClient().create(APIService.class);

            Call<List<User>> call = service.getData();

            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {



                    List<User> rowListItem = response.body();
                    lLayout = new LinearLayoutManager(MainActivity.this);

                    RecyclerView rView = (RecyclerView)
                            findViewById(R.id.recyclerView);
                    rView.setLayoutManager(lLayout);

                    RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);

                    rView.setAdapter(rcAdapter);

                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {
                    Log.d("onFailure", t.toString());
                    //hidepDialog();
                }
            });
        } catch (Exception e) {
            Log.d("onResponse", "There is an error");
            e.printStackTrace();
            //hidepDialog();
        }

    }
}

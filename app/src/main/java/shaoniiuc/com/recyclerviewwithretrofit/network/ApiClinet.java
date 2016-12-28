package shaoniiuc.com.recyclerviewwithretrofit.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Shaon on 11/7/2016.
 */

public class ApiClinet {

    public static final String BASE_URL = "http://www.shaoniiuc.com/";
    private static Retrofit retrofit = null;
    public static int unique_id;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

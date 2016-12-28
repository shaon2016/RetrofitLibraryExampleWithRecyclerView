/*
 * Created by Shaon on 8/15/16 8:06 PM
 * Copyright (c) 2016. This is free to use in any software.
 * You must provide developer name on your project.
 */

package shaoniiuc.com.recyclerviewwithretrofit.service;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import shaoniiuc.com.recyclerviewwithretrofit.model.User;

/**
 * Created by Shaon on 8/15/2016.
 */
public interface APIService {


    @GET("json_bangla")
    Call<List<User>> getData();


}

package raphael.br.com.retrofitjson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Raphael on 08/03/2017.
 */

public interface DataInterface {
    String url = "https://s3-sa-east-1.amazonaws.com";

    @GET("/pontotel-docs/data.json")
    Call<DataContainer> getData();

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
            .create();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

}

package raphael.br.com.retrofitjson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Raphael on 08/03/2017.
 */

public class DataModel {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("pwd")
    private String pwd;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
}

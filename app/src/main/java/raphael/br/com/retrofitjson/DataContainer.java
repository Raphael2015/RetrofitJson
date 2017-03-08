package raphael.br.com.retrofitjson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raphael on 08/03/2017.
 */

public class DataContainer {
    @SerializedName("data")
    private List<DataModel> dataModelList = new ArrayList<>();

    public List<DataModel> getDataModelList() {
        return dataModelList;
    }
}

package chann.vincent.cidemo;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import chann.vincent.cidemo.data.POI;

/**
 * Created by vchann on 16/06/2017.
 */

public class MainProvider {

    private Context context;

    public MainProvider(Context context) {
        this.context = context;
    }

    public List<POI> getPOIs() {
        List<POI> result = new ArrayList<>();
        result.add(new POI("title POI 1"));
        result.add(new POI("title POI 2"));
        result.add(new POI("title POI 3"));
        result.add(new POI("title POI 4"));
        return result;
    }
}

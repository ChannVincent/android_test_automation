package chann.vincent.cidemo;

import java.util.Collections;
import java.util.List;

import chann.vincent.cidemo.data.POI;

/**
 * Created by vchann on 16/06/2017.
 */

public class MainPresenter {

    private MainActivity activity;
    private MainProvider provider;

    public MainPresenter(MainActivity activity, MainProvider provider) {
        this.activity = activity;
        this.provider = provider;
    }

    public void showAllPOIs() {
        activity.showPOIs(provider.getPOIs());
    }

    public void showAllRandomPOIs() {
        List<POI> result = provider.getPOIs();
        Collections.shuffle(result);
        activity.showPOIs(result);
    }
}

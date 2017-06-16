package chann.vincent.cidemo.data;

import java.io.Serializable;

/**
 * Created by vchann on 16/06/2017.
 */

public class POI implements Serializable {

    public String title;
    public String subtitle;

    public POI() {}

    public POI (String title) {
        this.title = title;
    }
}

package chann.vincent.cidemo.data;

import java.io.Serializable;

/**
 * Created by vchann on 16/06/2017.
 */

public class POI implements Serializable, Comparable<POI> {

    public String title;
    public String subtitle;

    public POI() {}

    public POI (String title) {
        this.title = title;
    }

    public String toJson() {
        return "{\"title\":\"" + title + "\"}";
    }

    @Override
    public String toString() {
        return "{\"title\":\"" + title + "\"}";
    }

    @Override
    public int compareTo(POI poi) {
        return this.title.compareTo(poi.title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        POI poi = (POI) obj;
        if (title != null ? !title.equals(poi.title) : poi.title != null) return false;

        return true;
    }
}

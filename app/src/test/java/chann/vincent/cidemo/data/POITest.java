package chann.vincent.cidemo.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vchann on 16/06/2017.
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class POITest {

    @Test
    public void should_be_parsable_to_json() {
        POI poi = new POI("MyTitle");
        String result = poi.toJson();
        assertThat(result).isEqualTo("{\"title\":\"MyTitle\"}");
    }

    @Test
    public void is_equal() {
        POI poi1 = new POI("title1");
        POI poi2 = new POI("title1");
        assertThat(poi1).isEqualTo(poi2);
    }

    @Test
    public void is_comparable() {
        POI poi1 = new POI("title1");
        POI poi2 = new POI("title2");
        assertThat(poi2).isGreaterThan(poi1);
    }
}

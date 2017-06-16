package chann.vincent.cidemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

import chann.vincent.cidemo.data.POI;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by vchann on 16/06/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    @Mock MainActivity activity;
    @Mock MainProvider provider;
    @InjectMocks MainPresenter presenter;

    @Test
    public void should_show_all_pois() throws Exception {
        // Given
        when(provider.getPOIs()).thenReturn(Arrays.asList(new POI("titre1"), new POI("titre2")));

        // When
        presenter.showAllPOIs();

        // Then
        verify(activity).showPOIs(Arrays.asList(new POI("titre1"), new POI("titre2")));
    }

    @Test
    public void should_show_all_random_pois() throws Exception {
        /*
        Cannot test randomness ...
         */
        // Given
        when(provider.getPOIs()).thenReturn(Arrays.asList(new POI("titre1")));

        // When
        presenter.showAllRandomPOIs();

        // Then
        verify(activity).showPOIs(Arrays.asList(new POI("titre1")));
    }
}

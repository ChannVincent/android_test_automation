package chann.vincent.cidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import chann.vincent.cidemo.data.POI;

public class MainActivity extends AppCompatActivity {

    private MainPresenter presenter;
    protected TextView textView;
    protected Button buttonRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this, new MainProvider(this));
        textView = (TextView) findViewById(R.id.feedback_text);
        buttonRandom = (Button) findViewById(R.id.button_randomize);
        buttonRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.showAllRandomPOIs();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.showAllPOIs();
    }

    public void showPOIs(List<POI> poiList) {
        String result = "";
        for (POI poi : poiList) {
            result += poi.title + ", ";
        }
        textView.setText(result);
    }
}

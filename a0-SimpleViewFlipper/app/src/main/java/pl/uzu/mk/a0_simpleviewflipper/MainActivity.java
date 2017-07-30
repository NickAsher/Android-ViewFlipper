package pl.uzu.mk.a0_simpleviewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper mViewFlipper ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViewFlipper() ;



    }


    private void setupViewFlipper(){
        mViewFlipper = (ViewFlipper) findViewById(R.id.activityMain_ViewFlipper_flipper) ;
        mViewFlipper.setAutoStart(true);
        mViewFlipper.setFlipInterval(1000);
        mViewFlipper.startFlipping();
    }
}

package pl.uzu.mk.a1_animatedviewflipper;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper mViewFlipper ;
    Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext() ;

        setupViewFlipper() ;
        setAnimationsForViewFlipper() ;
    }

    private void setupViewFlipper(){
        mViewFlipper = (ViewFlipper) findViewById(R.id.activityMain_ViewFlipper_flipper) ;
        mViewFlipper.setAutoStart(true);
        mViewFlipper.setFlipInterval(2000);
        mViewFlipper.startFlipping();


    }

    private void setAnimationsForViewFlipper(){
        mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(context,R.anim.in_from_left));
        mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(context,R.anim.out_from_right));
    }
}

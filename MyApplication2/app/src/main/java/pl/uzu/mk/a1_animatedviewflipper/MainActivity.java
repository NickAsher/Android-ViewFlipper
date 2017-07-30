package pl.uzu.mk.a1_animatedviewflipper;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ViewFlipper mViewFlipper ;
    Context context ;
    ImageView im1, im2, im3, im4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext() ;

        setImages() ;
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

    private void setImages(){
        im1 = (ImageView)findViewById(R.id.image1) ;
        im2 = (ImageView)findViewById(R.id.image2) ;
        im3 = (ImageView)findViewById(R.id.image3) ;
        im4 = (ImageView)findViewById(R.id.image4) ;

        Glide.with(context).load(R.drawable.a1).centerCrop().into(im1) ;
        Glide.with(context).load(R.drawable.a2).centerCrop().into(im2) ;
        Glide.with(context).load(R.drawable.a3).centerCrop().into(im3) ;
        Glide.with(context).load(R.drawable.a4).centerCrop().into(im4) ;


    }
}

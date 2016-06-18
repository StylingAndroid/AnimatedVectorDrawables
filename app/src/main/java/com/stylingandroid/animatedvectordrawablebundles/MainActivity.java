package com.stylingandroid.animatedvectordrawablebundles;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.image_view1);
        startImageAnimation(imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.image_view2);
        startImageAnimation(imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.image_view3);
        startImageAnimation(imageView3);
    }

    private void startImageAnimation(ImageView imageView) {
        if (imageView != null) {
            startDrawableAnimation(imageView);
        }
    }

    private void startDrawableAnimation(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null && drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}

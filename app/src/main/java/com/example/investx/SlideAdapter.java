package com.example.investx;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.jetbrains.annotations.NotNull;

public class SlideAdapter extends PagerAdapter {

    int[] images;
    LayoutInflater layoutInflater;
    Context context;

    public SlideAdapter(int[] images, Context context) {
        this.images = images;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public void destroyItem(@NonNull @NotNull ViewGroup container, int position, @NonNull @NotNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull @NotNull ViewGroup container, int position) {
        View myImageLayout = layoutInflater.inflate(R.layout.slide_images, container, false);
        ImageView imageView = myImageLayout.findViewById(R.id.imageview);
        TextView textView = myImageLayout.findViewById(R.id.labeltext);

        if (position == 0)
            textView.setText("Tips on Stock Investment");
        else if (position == 1)
            textView.setText("Tips on Real Estate Investment");
        else
            textView.setText("Tips on Bond Investment");


        imageView.setImageDrawable(context.getDrawable(images[position]));
        container.addView(myImageLayout);

        return myImageLayout;
    }

    @Override
    public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object o) {
        return view.equals(o);
    }
}

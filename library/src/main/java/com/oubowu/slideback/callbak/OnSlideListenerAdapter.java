package com.oubowu.slideback.callbak;

import android.support.annotation.FloatRange;
import android.view.View;

/**
 * Created by Oubowu on 2016/9/23 0:05.
 */
public class OnSlideListenerAdapter implements OnSlideListener {
    @Override
    public void onSlide(View changedView, @FloatRange(from = 0.0,
            to = 1.0) float percent) {

    }

    @Override
    public void onOpen() {

    }

    @Override
    public void onClose() {

    }
}

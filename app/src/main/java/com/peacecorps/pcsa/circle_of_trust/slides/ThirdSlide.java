package com.peacecorps.pcsa.circle_of_trust.slides;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peacecorps.pcsa.R;

/*
 * Third Slide of circle of trust introduction
 *
 * @author calistus
 * @since 2015-08-18
 */
public class ThirdSlide extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.intro3, container, false);
        return v;
    }
}

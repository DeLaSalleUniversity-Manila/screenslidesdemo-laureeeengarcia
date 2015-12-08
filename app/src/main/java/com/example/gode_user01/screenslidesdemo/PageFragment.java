package com.example.gode_user01.screenslidesdemo;

/**
 * Created by gode_user01 on 12/8/2015.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {

    public static final String ARG_PAGE = "page";


    private int mPageNumber;

    public static PageFragment create(int pageNumber) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.activity_screenslide, container, false);

        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                getString(R.string.title_template_step, mPageNumber + 1));

        return rootView;
    }


    public int getPageNumber() {
        return mPageNumber;
    }
}
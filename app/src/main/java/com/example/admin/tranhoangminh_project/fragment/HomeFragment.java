package com.example.admin.tranhoangminh_project.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.admin.tranhoangminh_project.R;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class HomeFragment extends Fragment {
    public static final String EXTRA_RAW_NAME = "extraRawID";
    public static final String EXTRA_STRING_ICON = "extraStringIcon";

    private ArrayList<Subject> mSubjects = new ArrayList<>();
    private GridView gridSubject;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);



    }



}

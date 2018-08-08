package com.example.admin.tranhoangminh_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;

import com.example.admin.tranhoangminh_project.R;

import java.util.ArrayList;

public class ExamActivity extends AppCompatActivity {

    public static String rawName;
    public static String icon;

    private ArrayList<Exam> mExams = new ArrayList<>();
    private ArrayList<ArrayList<HighScore>> mArrHighScores = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        Toolbar toolbar = findViewById(R.id.exam_toolBar);
        setSupportActionBar(toolbar);

        Intent getIntent = getIntent();
        rawName = getIntent.getStringExtra(Home);
    }
}

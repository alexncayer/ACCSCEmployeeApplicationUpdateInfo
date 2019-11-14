package com.example.accsc250hwp13application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EmployeeEntryList extends AppCompatActivity
{
    private TextView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_entry_list);

        this.list = this.findViewById(R.id.employeeentrylist);

        Intent intent = getIntent();

        String text = intent.getStringExtra(Intent.EXTRA_TEXT);

        // a TextView is utilized for the text.
        list.setText(text);

    }
}

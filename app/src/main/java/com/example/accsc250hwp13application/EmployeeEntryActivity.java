package com.example.accsc250hwp13application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EmployeeEntryActivity extends AppCompatActivity {

    private EditText fnameET, lnameET, height_feetET, height_inchesET, weightET, ageET;
    private Employee theEmployee = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_entry);

        this.fnameET = this.findViewById(R.id.fnameET);
        this.lnameET = this.findViewById(R.id.lnameET);
        this.weightET = this.findViewById(R.id.weightET);
        this.ageET = this.findViewById(R.id.ageET);
        this.height_feetET = this.findViewById(R.id.height_feetET);
        this.height_inchesET = this.findViewById(R.id.height_inchesET);
    }

    //Sets information on each id (as shown down below)(was supposed to, but then moved to Employee class)

    public void onCreateEmployeeButtonClicked(View v)
    {
        if(this.theEmployee == null) // this is a new employee
        {
            String fname = this.fnameET.getText().toString();
            String lname = this.lnameET.getText().toString();
            double weight = Double.parseDouble(this.weightET.getText().toString());
            int age = Integer.parseInt(this.ageET.getText().toString());
            int height_feet = Integer.parseInt(this.height_feetET.getText().toString());
            int height_inches = Integer.parseInt(this.height_inchesET.getText().toString());
            this.theEmployee = new Employee(fname, lname, height_feet, height_inches, age, weight);
        }

        else //allows information on the employee to be updated when necessary
        {
            //allow the create button to also update the current employee object
            //note that you only have getters for your private employee fields
            //currently. You many need to change that :)

            this.theEmployee.setFname(this.fnameET.getText().toString());
            this.theEmployee.setLname(this.lnameET.getText().toString());
            this.theEmployee.setHeight_feet(Integer.parseInt(this.height_feetET.getText().toString()));
            this.theEmployee.setHeight_inches(Integer.parseInt(this.height_inchesET.getText().toString()));
            this.theEmployee.setAge(Integer.parseInt(this.ageET.getText().toString()));
            this.theEmployee.setWeight(Double.parseDouble(this.weightET.getText().toString()));

        }

    }

    public void onClickButton(View vw)
    {
        //utilizes the text to be passable
        String info = this.theEmployee.getString();
        //The SecondActivity begins
        Intent intent = new Intent(this, EmployeeEntryList.class);
        intent.putExtra(Intent.EXTRA_TEXT, info); //sends the extra text to different page and class
        startActivity(intent);
    }


}

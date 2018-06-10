package com.brillica_services.database_shubham;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class display extends AppCompatActivity {
    /*
     * ArrayList of Student class will be used
     * to store the data of individual student.*/
    ArrayList<StudentModel> studentArrayList = new ArrayList<>();
    DatabaseHelper databaseHelper;
    TextView displayStudentsResultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        displayStudentsResultTV=(TextView)findViewById(R.id.display_student_details_text_view);
        databaseHelper = new DatabaseHelper(this);
        studentArrayList.addAll(databaseHelper.allStudentsDetails());
        for (int i = 0; i < studentArrayList.size(); i++) {

            /*
             * Displaying the results in the displayStudentsResultTV Text View.
             * get the reference of the value by studentArrayList.get(i) - object stored at current location
             * .studentName, .studentCollege will give us the value of each variable
             * in that particular object.*/

            displayStudentsResultTV.setText(displayStudentsResultTV.getText() +
                    "Student ID is: " + studentArrayList.get(i).getId() + "\n");
            displayStudentsResultTV.setText(displayStudentsResultTV.getText() +
                    "Student Name is: " + studentArrayList.get(i).getName() + "\n");
            displayStudentsResultTV.setText(displayStudentsResultTV.getText() +
                    "Student College is: " + studentArrayList.get(i).getCollegeName() + "\n");
            displayStudentsResultTV.setText(displayStudentsResultTV.getText() +
                    "Student Phone Number is: " + studentArrayList.get(i).getPhoneNumber() + "\n");
            displayStudentsResultTV.setText(displayStudentsResultTV.getText() +
                    "Student Address is: " + studentArrayList.get(i).getAddress() + "\n");
            displayStudentsResultTV.setText(displayStudentsResultTV.getText() + "****************\n\n");
        }
    }
}

package in.org.verkstad.hospitalapp;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Register extends AppCompatActivity {
    Spinner select_category_register,country_code_p,country_code_d;
    Calendar myCalendar;
    EditText birth_date_p,birth_date_d;
    DatePickerDialog.OnDateSetListener date;
    LinearLayout patient_registration,doctor_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        select_category_register = (Spinner) findViewById(R.id.select_category_register);
        country_code_p = (Spinner) findViewById(R.id.country_code_p);
        country_code_d = (Spinner) findViewById(R.id.country_code_d);
        birth_date_p= (EditText) findViewById(R.id.birth_date_p);
        birth_date_d = (EditText) findViewById(R.id.birth_date_d);
        patient_registration = (LinearLayout) findViewById(R.id.patient_registration);
        doctor_registration = (LinearLayout) findViewById(R.id.doctor_registration);
        myCalendar = Calendar.getInstance();

        //Select category for registration
        String[] categories = {"Select Category","Patient","Doctor"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(Register.this, R.layout.spinner_textview,categories);
        select_category_register.setAdapter(arrayAdapter);

       select_category_register.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               String item = parent.getItemAtPosition(position).toString();
               if(item.equals("Select Category")){
                   return;
               }

               else if(item.equals("Patient")){
                   select_category_register.setVisibility(View.GONE);
                   patient_registration.setVisibility(View.VISIBLE);
               }

               else {
                   select_category_register.setVisibility(View.GONE);
                   doctor_registration.setVisibility(View.VISIBLE);
               }
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

        //Select country code in patient registration form
        String[] countrycode = {"+91","+62","+98"};
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(Register.this, R.layout.spinner_textview,countrycode);
        country_code_p.setAdapter(arrayAdapter2);
        country_code_d.setAdapter(arrayAdapter2);

        //Selecting birth date in patient registration form
         date= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR,year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }
        };
    }
    public void birth_date(View view){
        new DatePickerDialog(Register.this, date, myCalendar
                .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show();
    }
    private void updateLabel() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        birth_date_p.setText(sdf.format(myCalendar.getTime()));
        birth_date_d.setText(sdf.format(myCalendar.getTime()));
    }
}

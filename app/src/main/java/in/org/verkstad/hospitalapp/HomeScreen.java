package in.org.verkstad.hospitalapp;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;

public class HomeScreen extends AppCompatActivity {
    LinearLayout doctor_home_screen,patient_home_screen;
    String selected_category;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        doctor_home_screen = (LinearLayout) findViewById(R.id.doctor_home_screen);
        patient_home_screen = (LinearLayout) findViewById(R.id.patient_home_screen);


        Intent intent = getIntent();
        if(intent.getStringExtra("selected_category").equals("Patient")){
            doctor_home_screen.setVisibility(View.GONE);
            patient_home_screen.setVisibility(View.VISIBLE);
        }
        else {
            patient_home_screen.setVisibility(View.GONE);
            doctor_home_screen.setVisibility(View.VISIBLE);
        }

    }

    public void PatientProfile(View view){
        Intent intent = new Intent(HomeScreen.this,PatientProfile.class);
        startActivity(intent);
    }

    public void AddDoctor(View view){
        Intent intent = new Intent(HomeScreen.this,AddDoctor.class);
        startActivity(intent);
    }
}

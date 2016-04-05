package in.org.verkstad.hospitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner select_category;
    String selected_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        select_category = (Spinner) findViewById(R.id.select_category);
        String[] categories = {"Select Category","Patient","Doctor"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.spinner_textview,categories);
        select_category.setAdapter(arrayAdapter);

        select_category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                selected_category=item;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void register(View view){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }

    public void SignIn(View view){
        if (selected_category.equals("Select Category")){
            Toast.makeText(getApplicationContext(),"Select category",Toast.LENGTH_LONG).show();
        }
        else {
           // Toast.makeText(getApplicationContext(),selected_category,Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,HomeScreen.class);
            intent.putExtra("selected_category",selected_category);
            startActivity(intent);
        }

    }
}

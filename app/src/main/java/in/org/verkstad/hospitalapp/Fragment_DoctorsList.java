package in.org.verkstad.hospitalapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by anu on 4/5/2016.
 */
public class Fragment_DoctorsList extends Fragment {
    ArrayList<String> doctor_name,qualification,speciality,email,contact,status;
    RecyclerView recyclerView_doctore_list;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_doctors_list,container,false);
        recyclerView_doctore_list = (RecyclerView) view.findViewById(R.id.recylerview_doctors_list);
        doctor_name = new ArrayList<>();
        qualification = new ArrayList<>();
        speciality = new ArrayList<>();
        email = new ArrayList<>();
        contact = new ArrayList<>();
        status = new ArrayList<>();

        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");
        doctor_name.add("Dr. Nilesh");qualification.add("MBBS");speciality.add("Arthritis");email.add("nilesh@gmail.com");contact.add("8754632367");status.add("Non Register Doctor");

        recyclerView_doctore_list.setLayoutManager(new LinearLayoutManager(Fragment_DoctorsList.this.getActivity()));
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(Fragment_DoctorsList.this.getActivity(),doctor_name,qualification,speciality,email,contact,status);
        recyclerView_doctore_list.setAdapter(recyclerViewAdapter);

        return view;
    }
}

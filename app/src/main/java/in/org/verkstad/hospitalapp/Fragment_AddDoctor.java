package in.org.verkstad.hospitalapp;

import android.animation.Animator;
import android.app.DatePickerDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Calendar;

/**
 * Created by anu on 4/5/2016.
 */
public class Fragment_AddDoctor extends Fragment {
    Calendar myCalendar;
    DatePickerDialog.OnDateSetListener date;
    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        return super.onCreateAnimator(transit, enter, nextAnim);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_doctor,container,false);
        return view;
    }
}

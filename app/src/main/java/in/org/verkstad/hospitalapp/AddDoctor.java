package in.org.verkstad.hospitalapp;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AddDoctor extends AppCompatActivity {
    ViewPager add_doctor_view_pager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_doctor);
        add_doctor_view_pager = (ViewPager) findViewById(R.id.adddoctor_viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

        List<android.app.Fragment> fragmentList = new ArrayList<>();
        List<String> fragmenttitlelist = new ArrayList<>();
        fragmentList.add(new Fragment_AddDoctor());
        fragmentList.add(new Fragment_DoctorsList());
        fragmenttitlelist.add("Add Doctor");
        fragmenttitlelist.add("Doctor's List");
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getFragmentManager(),fragmentList,fragmenttitlelist);
        add_doctor_view_pager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(add_doctor_view_pager);

    }

    class ViewPageAdapter extends android.support.v13.app.FragmentPagerAdapter {
        List<android.app.Fragment> fragmentList;
        List<String> fragmenttitlelist;

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmenttitlelist.get(position);
        }

        public ViewPageAdapter(android.app.FragmentManager fm,List<android.app.Fragment> fragmentList,List<String> fragmenttitlelist) {
            super(fm);
            this.fragmentList=fragmentList;
            this.fragmenttitlelist=fragmenttitlelist;
        }

        @Override
        public android.app.Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }


}

package in.org.verkstad.hospitalapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anu on 4/5/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<String> doctor_name,qualification,speciality,email,contact,status;
    public RecyclerViewAdapter(Context context,ArrayList<String> doctor_name,ArrayList<String> qualification,ArrayList<String> speciality,ArrayList<String> email,ArrayList<String> contact,ArrayList<String> status){
        inflater = LayoutInflater.from(context);
        this.doctor_name = doctor_name;
        this.qualification=qualification;
        this.speciality=speciality;
        this.email=email;
        this.contact=contact;
        this.status=status;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.doctors_list_row,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.row1.setText(doctor_name.get(position));
        holder.row2.setText(qualification.get(position));
        holder.row3.setText(speciality.get(position));
        holder.row4.setText(email.get(position));
        holder.row5.setText(contact.get(position));
        holder.row6.setText(status.get(position));

    }

    @Override
    public int getItemCount() {
        return doctor_name.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView row1,row2,row3,row4,row5,row6;
        public ViewHolder(View itemView) {
            super(itemView);
            row1 = (TextView) itemView.findViewById(R.id.row1);
            row2 = (TextView) itemView.findViewById(R.id.row2);
            row3 = (TextView) itemView.findViewById(R.id.row3);
            row4 = (TextView) itemView.findViewById(R.id.row4);
            row5 = (TextView) itemView.findViewById(R.id.row5);
            row6 = (TextView) itemView.findViewById(R.id.row6);
        }
    }
}

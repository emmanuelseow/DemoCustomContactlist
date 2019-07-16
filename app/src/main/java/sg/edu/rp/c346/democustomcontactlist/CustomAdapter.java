package sg.edu.rp.c346.democustomcontactlist;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactsList;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactsList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);

        ImageView ivGender = rowView.findViewById(R.id.imageViewGender);

        Contact currentItem = contactsList.get(position);
        tvName.setText(currentItem.getName());
        tvCode.setText("+"+currentItem.getCountrycode());
        tvNum.setText(currentItem.getPhonenum()+"");

        char check = currentItem.getGender();
        if(check=='M'){
            ivGender.setImageResource(R.drawable.male);
        } else{
            ivGender.setImageResource(R.drawable.female);
        }

        return rowView;
    }
}
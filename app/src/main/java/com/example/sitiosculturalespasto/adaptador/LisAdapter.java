package com.example.sitiosculturalespasto.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sitiosculturalespasto.Post;
import com.example.sitiosculturalespasto.R;

import java.util.ArrayList;

public class LisAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Post> arrayList;

    public LisAdapter(Context context, ArrayList<Post> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Post item = (Post) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item_list,null);
        TextView entidad_cargo = convertView.findViewById(R.id.nombresit);
        TextView representante = convertView.findViewById(R.id.repres);
        TextView direccion = convertView.findViewById(R.id.direc);
        TextView correo = convertView.findViewById(R.id.corre);

        entidad_cargo.setText(item.getEntidad_cargo());
        representante.setText(item.getRepresentante());
        direccion.setText(item.getDireccion());
        correo.setText(item.getCorreo());

        return convertView;
    }
}

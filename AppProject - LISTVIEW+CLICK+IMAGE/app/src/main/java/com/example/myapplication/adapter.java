package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter extends ArrayAdapter<modelo> {
    private List<modelo> items;

    public adapter(Context context, int textViewResourceId, List<modelo> items) {
        super(context, textViewResourceId, items);
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            Context ctx = getContext();
            LayoutInflater vi = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.linha, null);
        }
        modelo comida = items.get(position);
        if (comida != null) {
            ((TextView) v.findViewById(R.id.textView)).setText(comida.getNome());
            ((ImageView) v.findViewById(R.id.imageView)).setImageResource(comida.getIdImagem());
            ((TextView) v.findViewById(R.id.textView3)).setText(comida.getPreco());
        }
        return v;
    }
}
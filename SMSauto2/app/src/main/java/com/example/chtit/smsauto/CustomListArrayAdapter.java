package com.example.chtit.smsauto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chtit on 21/10/2015.
 */
public class CustomListArrayAdapter extends ArrayAdapter<Song>{
    Context context;
    private int layoutResourceId;
    List<Song> songList;
    public CustomListArrayAdapter(Context context, int resource, List<Song> list) {
        super(context, resource, list);
        this.context = context;
        this.songList = list;
        this.layoutResourceId = resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layoutResourceId, parent, false);
        }
        TextView auteur = (TextView) view.findViewById(R.id.auteurText);
        TextView titre = (TextView) view.findViewById(R.id.titreText);
        ImageView image = (ImageView) view.findViewById(R.id.imageAlbum);
        Song songItem = songList.get(position);
        auteur.setText(songItem.getAuteur());
        titre.setText(songItem.getTitre());
        image.setImageResource(songItem.getImage());
        return view;
    }
}
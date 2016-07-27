package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by alisher on 7/7/16.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> words, int ColorResourceId){
        super(context, 0, words);
        mColorResourceId = ColorResourceId;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWordAdapter = getItem(position);
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        if(currentWordAdapter.hasImage()){

            iconView.setImageResource(currentWordAdapter.getmImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.list_item_text1);

        defaultTextView.setText(currentWordAdapter.getmDefaultTranlation());

        TextView mMiwokTextView = (TextView) listItemView.findViewById(R.id.list_item_text2);

        mMiwokTextView.setText(currentWordAdapter.getmMiwokTranslation());

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.textContainer);
        View playbutton = listItemView.findViewById(R.id.playicon);
        //Set Background color to the color the resource Id maps to
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceId));
        playbutton.setBackgroundColor(ContextCompat.getColor(getContext(),mColorResourceId));


        return listItemView;
    }
}

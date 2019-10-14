package com.zhoubrian.biwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.zhoubrian.biwok.models.Word;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private Context mContext;
    private List<Word> wordList = new ArrayList<Word>();

    public WordAdapter(Context context, List<Word> wordList) {
        super(context,0,wordList);
        mContext = context;
        this.wordList = wordList;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        View listItem = convertView;

        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        Word currentWord=wordList.get(position);

        TextView DefaultWord = (TextView) listItem.findViewById(R.id.english_word);
        DefaultWord.setText(currentWord.getDefaultWord());

        TextView TransWord = (TextView) listItem.findViewById(R.id.translation_word);
        TransWord.setText(currentWord.getTranslationWord());
        return listItem;
    }
}//end of WordAdapetr..






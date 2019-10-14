package com.zhoubrian.biwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import com.zhoubrian.biwok.models.Word;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    ArrayList<Word> myWordsList=new ArrayList<>();
    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        myWordsList=fillData();
        myListView=(ListView)findViewById(R.id.list);

        WordAdapter itemsAdapter=new WordAdapter(this,myWordsList);
        myListView.setAdapter(itemsAdapter);
    }//end of onCreate..

    public ArrayList<Word> fillData(){
      ArrayList<Word> temp_list=new ArrayList<Word>();
      temp_list.add(new Word("one","un",1));
      temp_list.add(new Word("two","deux",2));
      temp_list.add(new Word("three","trois",3));
      temp_list.add(new Word("four","quatre",4));
      temp_list.add(new Word("five","cinq",5));
      temp_list.add(new Word("six","six",6));
      temp_list.add(new Word("seven","sept",7));
      temp_list.add(new Word("eight","huit",8));
      temp_list.add(new Word("nine","neuf",9));
      temp_list.add(new Word("ten","dix",10));
      temp_list.add(new Word("eleven","onze",11));
        temp_list.add(new Word("twelve","douze",12));
        temp_list.add(new Word("thirteen","treize",13));
        temp_list.add(new Word("forteen","quatorze",14));
        temp_list.add(new Word("fifteen","quinze",15));
        temp_list.add(new Word("sixteen","seize",16));
        temp_list.add(new Word("seventeen","dix-sept",17));
        temp_list.add(new Word("eighteen","dix-huit",18));
        temp_list.add(new Word("nineteen","dix-neuf",19));
        temp_list.add(new Word("twenty","vingt",20));
        temp_list.add(new Word("twentyone","vingt et un",21));
        temp_list.add(new Word("twentytwo","vingt-deux",22));
        temp_list.add(new Word("twentythree","vingt-trois",23));
        temp_list.add(new Word("twentyfour","vingt-quatre",24));
        temp_list.add(new Word("twentyfive","vingt-cinq",25));
        temp_list.add(new Word("twentysix","vingt-six",26));
        temp_list.add(new Word("twentyseven","vingt-sept",27));
        temp_list.add(new Word("twentyeight","vingt-huit",28));
        temp_list.add(new Word("twentynine","vingt-neuf",29));
        temp_list.add(new Word("thirty","trente",30));
      return temp_list;
    };

}//end of NumbersActivity...

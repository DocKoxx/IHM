package com.example.chtit.smsauto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private enum States {E1, E2, E3, E4};
    private States CurrentState;
    Button bouton1, bouton2, bouton3, bouton4;

    public Song david = new Song("David Guetta", "Memories", R.drawable.david_guetta);
    public Song nirvana = new Song("Nirvana", "Smells Like Teen Spirit", R.drawable.nirvana);
    public Song robin = new Song("Robin Des Bois", "Ne Renoncez Jamais", R.drawable.robin_des_bois);
    public Song sean = new Song("Sean Paul", "She Doesn't Mind", R.drawable.sean_paul);

    public ArrayList<Song> listSong = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*bouton1 = (Button) findViewById(R.id.bouton1);
        bouton2 = (Button) findViewById(R.id.bouton2);
        bouton3 = (Button) findViewById(R.id.bouton3);
        bouton4 = (Button) findViewById(R.id.bouton4);

        CurrentState = States.E1;

        bouton1.setOnClickListener(new View.OnClickListener() {
            //@override
            public void onClick(View v) {
                bouton1ClickEventHandler();
            }
        });

        bouton2.setOnClickListener(new View.OnClickListener() {
            //@override
            public void onClick(View v) {
                bouton2ClickEventHandler();
            }
        });

        bouton3.setOnClickListener(new View.OnClickListener() {
            //@override
            public void onClick(View v) {
                bouton3ClickEventHandler();
            }
        });

        bouton4.setOnClickListener(new View.OnClickListener() {
            //@override
            public void onClick(View v) {
                bouton4ClickEventHandler();
            }
        });*/

        mListView = (ListView) findViewById(R.id.listView);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, prenoms);*/

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                R.layout.element_list_layout, R.id.imageAlbum);

        listSong.add(david);
        listSong.add(nirvana);
        listSong.add(robin);
        listSong.add(sean);
        CustomListArrayAdapter mListAdapter1 = new CustomListArrayAdapter(this, R.layout.element_list_layout, listSong);
        mListView.setAdapter(mListAdapter1);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                R.layout.element_list_layout, R.id.textView1, prenoms);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                R.layout.element_list_layout, R.id.textView2);*/

        //mListView.setAdapter(adapter);
    }
    /*private void bouton1ClickEventHandler(){

        switch(CurrentState){
            case E1 :
                CurrentState = States.E2;
                bouton1.setEnabled(false);
                bouton2.setEnabled(true);
                bouton3.setEnabled(false);
                bouton4.setEnabled(false);
                break;
            case E2 :case E3 :case E4 :
            //interdit
            break;
        }
    }

    private void bouton2ClickEventHandler(){

        switch(CurrentState){
            case E2 :
                CurrentState = States.E3;
                bouton1.setEnabled(false);
                bouton2.setEnabled(false);
                bouton3.setEnabled(true);
                bouton4.setEnabled(false);
                break;
            case E1 :case E3 :case E4 :
                //interdit
                break;
        }
    }

    private void bouton3ClickEventHandler(){

        switch(CurrentState){
            case E3 :
                CurrentState = States.E4;
                bouton1.setEnabled(false);
                bouton2.setEnabled(false);
                bouton3.setEnabled(false);
                bouton4.setEnabled(true);
                break;
            case E1 :case E2 :case E4 :
                //interdit
                break;
        }
    }

    private void bouton4ClickEventHandler(){

        switch(CurrentState){
            case E4 :
                CurrentState = States.E1;
                bouton1.setEnabled(true);
                bouton2.setEnabled(false);
                bouton3.setEnabled(false);
                bouton4.setEnabled(false);
                break;
            case E1 :case E2 :case E3 :
                //interdit
                break;
        }
    }*/

    ListView mListView;
    String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
            "Yann", "Zoé"
    };

    /*@Override
    protected void onCreate(Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
        //Contenant une TextView avec comme identifiant "@android:id/text1"

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);

        pour creer son propre layout : simple_list_item_1
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                R.layout.element_list_layout, R.id.textView999, prenoms);

    }*/



}

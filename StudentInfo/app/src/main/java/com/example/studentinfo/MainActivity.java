package com.example.studentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText enternum;
    EditText entername;
    EditText enteradd;
    Button buttonadd;
    Button buttondel;
    Button buttonup;
    Button buttonview;
    DatabaaseHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        enternum = findViewById (R.id.enternum);
        entername= findViewById (R.id.entername);
        enteradd = findViewById (R.id.enteradd);
        buttonadd= findViewById (R.id.buttonadd);
        buttondel= findViewById (R.id.buttondel);
        buttonup= findViewById (R.id.buttonup);
        buttonview= findViewById (R.id.buttonview);
        db = new DatabaaseHelper (this);

        buttonadd.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String idtext = enternum.getText () .toString ();
                String nametext = entername.getText () .toString ();
                String adddtext = enteradd.getText () .toString ();

                Boolean checkinsertdata = db.insertstudentdata(idtext,nametext,adddtext);
                if (checkinsertdata==true)
                    Toast.makeText (MainActivity.this, "New Data was Inserted", Toast.LENGTH_SHORT).show ();
                else
                    Toast.makeText (MainActivity.this, "New Data was not Inserted", Toast.LENGTH_LONG).show ();
            }
        });

       buttonup.setOnClickListener (new View.OnClickListener () {
           @Override
           public void onClick(View v) {
               String idtext = enternum.getText () .toString ();
               String nametext = entername.getText () .toString ();
               String adddtext = enteradd.getText () .toString ();


               Boolean checkupdatedata= db.insertupdatedata(idtext,nametext,adddtext);
               if (checkupdatedata==true)
                   Toast.makeText (MainActivity.this, "Entry was Updated", Toast.LENGTH_SHORT).show ();
               else
                   Toast.makeText (MainActivity.this, "Entry was Updated", Toast.LENGTH_SHORT).show ();

           }
       });
       buttondel.setOnClickListener (new View.OnClickListener () {
           @Override
           public void onClick(View v) {
               String idtext = enternum.getText () .toString ();

               Boolean checkdeletedata =db.insertdeletetdata (idtext);
               if (checkdeletedata==true)
                   Toast.makeText (MainActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show ();
               else
                   Toast.makeText (MainActivity.this, "Entry not Deleted", Toast.LENGTH_SHORT).show ();

           }
       });

       buttonview.setOnClickListener (new View.OnClickListener () {
           @Override
           public void onClick(View v) {
               Cursor view = db.getdata ();
               if (view.getCount () == 0) {
                   Toast.makeText (MainActivity.this, "Entry was Updated", Toast.LENGTH_SHORT).show ();
                   return;
               }

               StringBuffer buffer = new StringBuffer ();
               while (view.moveToNext ()) {
                   buffer.append ("Student ID :" + view.getString (0) + "\n");
                   buffer.append ("Name :" + view.getString (1) + "\n");
                   buffer.append ("Address :" + view.getString (2) + "\n\n");
               }
               AlertDialog.Builder builder = new AlertDialog.Builder (MainActivity.this);
               builder.setCancelable (true);
               builder.setTitle ("Student Information");
               builder.setMessage (buffer.toString ());
               builder.show ();
           }
       });
    }
}
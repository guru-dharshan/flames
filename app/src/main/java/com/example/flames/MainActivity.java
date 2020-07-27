package com.example.flames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String a, b;
    EditText name1;
    EditText name2;
    ArrayList<String> flames = new ArrayList<String>();
    ImageView img;
    TextView ans;
    String[] strArray;
    String[] strArray1;

    public void flames(View view) {
        int counts = name1.length() + name2.length();
        int count = 0;
        a = name1.getText().toString();
        b = name2.getText().toString();
        strArray = a.split("");
        strArray1 = b.split("");
        for (String x : strArray) {
            for (int i = 0; i < strArray1.length; i++) {
                if (x.compareTo(strArray1[i]) == 0) {
                    count++;
                    strArray1[i] = "0";
                    break;

                }
            }


        }

        count = count - 1;
        count = count * 2;
        int f = counts - count;
        Log.i("value", Integer.toString(f));
        int c=f;
        String flames = "flames";
        StringBuilder sb3 = new StringBuilder(flames);

        char flameResult = '0';

        while(sb3.length()!=1)
        {
            //int y = c%sb3.length(); ipo run panni pakava? okkkkkk ommala tappu waiiit athu enna thuuuu terlyeee ama call
            int y = f%sb3.length();
            String temp;

            if(y!=0)
            {
                temp = sb3.substring(y)+sb3.substring(0, y-1); // taking substring (counting purpose)

            }
            else
            {
                temp = sb3.substring(0, sb3.length()-1); // taking substring (counting purpose)

            }
            sb3 = new StringBuilder(temp);
            flameResult = sb3.charAt(0);

        }
        switch(flameResult)
        {
            case 'f':
                Log.i("value","f");
                ans.setText("FRIENDS");
                img.setImageResource(R.drawable.friend1);

                break;
            case 'l':
                Log.i("value","l");
                ans.setText("LOVE");
                img.setImageResource(R.drawable.love1);
                break;
            case 'a':
                Log.i("value","a");
                ans.setText("AFFECTION");
                img.setImageResource(R.drawable.affection1);

                break;
            case 'm':
                Log.i("value","m");
                ans.setText("MARRIAGE");
                img.setImageResource(R.drawable.marriage2);
                break;
            case 'e':
                Log.i("value","e");
                ans.setText("ENEMY");
                img.setImageResource(R.drawable.enemy1);
                break;
            case 's':
                Log.i("value","s");
                ans.setText("SISTER");
                img.setImageResource(R.drawable.sister1);
                break;

        }







            }
        public void reset(View view){


            name1.setText("");
            name2.setText("");
            img.setImageResource(R.drawable.flames);
        }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            name1 = (EditText) findViewById(R.id.editText);
            name2 = (EditText) findViewById(R.id.editText2);
            flames.add("f");
            flames.add("l");
            flames.add("a");
            flames.add("m");
            flames.add("e");
            flames.add("s");
            ans= (TextView)findViewById(R.id.textView);
            img = (ImageView)findViewById(R.id.imageView);
        }
    }

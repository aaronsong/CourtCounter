package com.example.sdsa.courtcounter;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private TextView point1;
    private TextView point2;
    private Button button1_3;
    private Button button1_2;
    private Button button1_1;
    private Button button2_3;
    private Button button2_2;
    private Button button2_1;
    private Button resetBtn;

    private int pt1;
    private int pt2;
    private static final String SCORES = "POINT1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pt1 = 0;
        pt2 = 0;

        point1 = (TextView) findViewById(R.id.point1);
        point2 = (TextView) findViewById(R.id.point2);

        button1_3 = (Button) findViewById(R.id.button1_3_Id);
        button1_2 = (Button) findViewById(R.id.button1_2_Id);
        button1_1 = (Button) findViewById(R.id.button1_1_Id);

        button2_3 = (Button) findViewById(R.id.button2_3_Id);
        button2_2 = (Button) findViewById(R.id.button2_2_Id);
        button2_1 = (Button) findViewById(R.id.button2_1_Id);

        resetBtn = (Button) findViewById(R.id.resetId);

        button1_3.setOnClickListener(this);
        button1_2.setOnClickListener(this);
        button1_1.setOnClickListener(this);

        button2_3.setOnClickListener(this);
        button2_2.setOnClickListener(this);
        button2_1.setOnClickListener(this);

        resetBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1_3_Id:
                pt1 += 3;
                point1.setText(Integer.toString(pt1));
                break;

            case R.id.button1_2_Id:
                pt1 += 2;
                point1.setText(Integer.toString(pt1));
                break;

            case R.id.button1_1_Id:
                pt1 += 1;
                point1.setText(Integer.toString(pt1));
                break;

            case R.id.button2_3_Id:
                pt2 += 3;
                point2.setText(Integer.toString(pt2));
                break;

            case R.id.button2_2_Id:
                pt2 += 2;
                point2.setText(Integer.toString(pt2));
                break;

            case R.id.button2_1_Id:
                pt2 += 1;
                point2.setText(Integer.toString(pt2));
                break;

            case R.id.resetId:
                pt1 = 0;
                pt2 = 0;
                point1.setText(Integer.toString(pt1));
                point2.setText(Integer.toString(pt2));
                break;
        }

    }
}

package com.kalkulatorsederhana;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText input1, input2;
	TextView hasil;
	Button bagi,tambah,kurang,kali;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=(EditText)findViewById(R.id.input1);
        input2=(EditText)findViewById(R.id.input2);
        bagi=(Button)findViewById(R.id.bagi);
        tambah=(Button)findViewById(R.id.tambah);
        kurang=(Button)findViewById(R.id.kurang);
        kali=(Button)findViewById(R.id.kali);
        hasil=(TextView)findViewById(R.id.hasil);
        
        bagi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				hasil.setText("");
				int hasilnya = Integer.parseInt(input1.getText().toString());
				int hasilnya2 = Integer.parseInt(input2.getText().toString());
				int hasilnya3 = hasilnya / hasilnya2;
				hasil.setText("hasilnya adalah = " +hasilnya+ " / " +hasilnya2+ " = " +hasilnya3);
				
			}
		});
        
        tambah.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				hasil.setText("");
				int hasilnya = Integer.parseInt(input1.getText().toString());
				int hasilnya2 = Integer.parseInt(input2.getText().toString());
				int hasilnya3 = hasilnya + hasilnya2;
				hasil.setText("hasilnya adalah = " +hasilnya+ " + " +hasilnya2+ " = " +hasilnya3);
			}
		});

        kurang.setOnClickListener(new View.OnClickListener() {
	
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		hasil.setText("");
				int hasilnya = Integer.parseInt(input1.getText().toString());
				int hasilnya2 = Integer.parseInt(input2.getText().toString());
				int hasilnya3 = hasilnya - hasilnya2;
				hasil.setText("hasilnya adalah = " +hasilnya+ " - " +hasilnya2+ " = " +hasilnya3);
		
        	}
        });

        kali.setOnClickListener(new View.OnClickListener() {
	
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		hasil.setText("");
				int hasilnya = Integer.parseInt(input1.getText().toString());
				int hasilnya2 = Integer.parseInt(input2.getText().toString());
				int hasilnya3 = hasilnya * hasilnya2;
				hasil.setText("hasilnya adalah = " +hasilnya+ " X " +hasilnya2+ " = " +hasilnya3);
        	}
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

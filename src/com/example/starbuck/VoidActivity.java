package com.example.starbuck;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VoidActivity extends Activity {
	
	private EditText refNo, amountVoid;
	private Button btnVoid;

	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.void_layout);
		
		refNo = (EditText) findViewById(R.id.RefNo);
		amountVoid = (EditText) findViewById(R.id.AmountVoid);
		btnVoid = (Button) findViewById(R.id.btnVoid);
		btnVoid.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	@Override
	public void onResume() {
		
	}
}

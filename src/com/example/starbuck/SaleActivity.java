package com.example.starbuck;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SaleActivity extends Activity {

	private EditText amount, billNo;
	private Button btnSale;
	
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sale);
		
		amount = (EditText) findViewById(R.id.amount);
		billNo = (EditText) findViewById(R.id.BillNo);
		btnSale = (Button) findViewById(R.id.btnSale);
		btnSale.setOnClickListener(new View.OnClickListener() {
			
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

package com.example.starbuck;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {
	
	private Button btnSale, btnTopUp, btnCardAct, btnVoid, btnSettlement, btnActivity, btnLogOut;

	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
				
		btnSale = (Button) findViewById(R.id.btnSale);
		btnSale.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnTopUp = (Button) findViewById(R.id.btnTopUp);
		btnTopUp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnCardAct = (Button) findViewById(R.id.btnCardAct);
		btnCardAct.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnVoid = (Button) findViewById(R.id.btnVoid);
		btnVoid.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		btnSettlement = (Button) findViewById(R.id.btnSettlement);
		btnSettlement.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnActivity = (Button) findViewById(R.id.btnActivity);
		btnActivity.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnLogOut = (Button) findViewById(R.id.btnLogOut);
		btnLogOut.setOnClickListener(new View.OnClickListener() {
			
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

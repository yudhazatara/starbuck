package com.example.starbuck;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class activitylist {
	public static ListView listView;
	public static String outstanding = "0";
	public static ArrayList<HashMap<String, String>> data;
	public static HashMap<String, String> kirim = new HashMap<String, String>();
	public static ArrayList totalAmountTrx;
	public static ArrayList instalment;
	public static String coordsah;
	Button btnHistory;
	TextView tvAvailable, tvOutstanding;
	int count = 0;
	String available = "0";
	ArrayList customerName;
	ArrayList trxDate;
	ProgressDialog dialog;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.activity, container, false);
		listView = (ListView) view.findViewById(R.id.listActivity);
		totalAmountTrx = new ArrayList();
		instalment = new ArrayList();
		customerName = new ArrayList();
		trxDate = new ArrayList();
		data = new ArrayList<HashMap<String, String>>();

		listView.setAdapter(null);
		listView.setOnItemClickListener((OnItemClickListener) this);

		return view;
	}

	public class MyPerformanceArrayAdapter extends ArrayAdapter<String> {
		private final Activity context;
		private final ArrayList RefNo;
		private final ArrayList CardNo;
		private final ArrayList amountTrx;
		private final ArrayList trxDate;

		public MyPerformanceArrayAdapter(Activity context, ArrayList trxDate,
				ArrayList refNo, ArrayList cardNo, ArrayList instalment) {
			super(context, R.layout.content_activity, cardNo);

			this.trxDate = trxDate;
			this.context = context;
			this.RefNo = refNo;
			this.CardNo = cardNo;
			this.amountTrx = instalment;

		}

		@SuppressLint("ResourceAsColor")
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View rowView = convertView;
			// reuse views
			if (rowView == null) {
				LayoutInflater inflater = context.getLayoutInflater();
				rowView = inflater.inflate(R.layout.content_activity, null);
				// configure view holder
				ViewHolder viewHolder = new ViewHolder();
				viewHolder.transDate = (TextView) rowView
						.findViewById(R.id.trxDate);
				viewHolder.refNumber = (TextView) rowView
						.findViewById(R.id.RefNo);
				viewHolder.cardNumber = (TextView) rowView
						.findViewById(R.id.CardNo);
				viewHolder.totAmount = (TextView) rowView
						.findViewById(R.id.amount);
				rowView.setTag(viewHolder);
			}
			return rowView;
		}
	}

	class ViewHolder {
		public TextView transDate, refNumber, cardNumber, totAmount;
	}
}

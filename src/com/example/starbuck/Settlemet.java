package com.example.starbuck;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

public class Settlemet {
	public String trxDate;
	Button btnSettlement;
	TextView tvDate, tvTotalTransaction, tvTotalSettlement;
	private static final String tag = "Siera Prepaid";
	ArrayList<HashMap<String, String>> settlementList;
	private ListView listdata1;
	private NumberFormat rupiahFormat = new DecimalFormat("'Rp '#,###");
	ArrayList<String> dataCheckboxName = new ArrayList<String>();
	ArrayList<String> dataAmountCheckbox = new ArrayList<String>();

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View mView = inflater.inflate(R.layout.settlement, container, false);

		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = df.format(c.getTime());

		btnSettlement = (Button) mView.findViewById(R.id.btnSettlement);
		tvDate = (TextView) mView.findViewById(R.id.tvDate);
		tvTotalTransaction = (TextView) mView
				.findViewById(R.id.tvTotalTrancation);
		tvTotalSettlement = (TextView) mView.findViewById(R.id.tvTotalSettlement);
		listdata1 = (ListView) mView.findViewById(R.id.listsettlement);

		return mView;
	}

	public class SettlementCheckboxAdapter extends ArrayAdapter<String> {
		private final Activity context;
		ViewHolder viewHolder, holder;
		ArrayList<String> refNo = new ArrayList<String>();
		ArrayList<String> amount = new ArrayList<String>();

		public SettlementCheckboxAdapter(Activity context,
				ArrayList<String> refno, ArrayList<String> amount) {
			super(context, R.layout.content_settlement);
			this.refNo = refno;
			this.amount = amount;
			this.context = context;

		}

		@SuppressLint("ResourceAsColor")
		public View getView(final int position, View convertView,
				ViewGroup parent) {
			View rowView = convertView;
			// reuse views
			if (rowView == null) {
				LayoutInflater inflater = context.getLayoutInflater();
				rowView = inflater.inflate(R.layout.content_settlement, null);
				// configure view holder
				viewHolder = new ViewHolder();
				viewHolder.checkBox = (CheckBox) rowView
						.findViewById(R.id.checkbox1);
				viewHolder.refno = (TextView) rowView.findViewById(R.id.refNo);
				viewHolder.amount = (TextView) rowView
						.findViewById(R.id.amount);
				rowView.setTag(viewHolder);
			}

			// fill data
			holder = (ViewHolder) rowView.getTag();
			HashMap<String, String> getHm = settlementList.get(position);
			holder.refno.setText((String) refNo.get(position));
			holder.amount.setText((String) amount.get(position));
			holder.checkBox.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					try {
						HashMap<String, String> tes = settlementList
								.get(position);
						CheckBox cb = (CheckBox) v;
						if (!cb.isChecked()) {
							tes.put("status", "false");
						} else {
							tes.put("status", "true");
						}
					} catch (Exception e) {
						e.printStackTrace();
						Log.d(tag, e.toString());
					}

				}
			});

			return rowView;
		}

		public int getCount() {
			return settlementList.size();
		}

		class ViewHolder {
			public TextView refno, amount;
			public CheckBox checkBox;
		}
	}
}

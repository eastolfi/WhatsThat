package es.edu.android.whatsthat.adapter;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.util.IConstants;

public class ListViewAdapter extends BaseAdapter {

	Activity activity;
	public ArrayList<HashMap<String, Object>> list;
	
	public ListViewAdapter(Activity activity, ArrayList<HashMap<String, Object>> list) {
		super();
		this.activity = activity;
		this.list = list;
	}
	
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int pos) {
		return list.get(pos);
	}

	@Override
	public long getItemId(int pos) {
		return 0;
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		ViewHolder holder;
		
		LayoutInflater inflater = activity.getLayoutInflater();
		
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.listview_row, null);
			holder = new ViewHolder();
			holder.setTxtEntry((TextView) convertView.findViewById(R.id.entryText));
			holder.setImgEntry((ImageView) convertView.findViewById(R.id.entryImage));
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		HashMap<String, Object> map = list.get(pos);
		holder.getTxtEntry().setText((CharSequence) map.get(IConstants.TEXT_COLUMN));
		holder.getImgEntry().setImageResource((Integer) map.get(IConstants.IMAGE_COLUMN));
		holder.getTxtDetail().setText((CharSequence) map.get(IConstants.TEXT_DETAIL_COLUMN));
		holder.getImgDetail().setImageResource((Integer) map.get(IConstants.IMAGE_DETAIL_COLUMN));
		holder.setIrCode((String) map.get(IConstants.CODE_COLUMN));
		
		return convertView;
	}
	
	public class ViewHolder {
		private TextView txtEntry;
		private ImageView imgEntry;
		private TextView txtDetail;
		private ImageView imgDetail;
		private String irCode;
		
		public TextView getTxtEntry() {
			return txtEntry;
		}
		public void setTxtEntry(TextView txtEntry) {
			this.txtEntry = txtEntry;
		}
		public ImageView getImgEntry() {
			return imgEntry;
		}
		public void setImgEntry(ImageView imgEntry) {
			this.imgEntry = imgEntry;
		}
		public TextView getTxtDetail() {
			return txtDetail;
		}
		public void setTxtDetail(TextView txtDetail) {
			this.txtDetail = txtDetail;
		}
		public ImageView getImgDetail() {
			return imgDetail;
		}
		public void setImgDetail(ImageView imgDetail) {
			this.imgDetail = imgDetail;
		}
		public String getIrCode() {
			return irCode;
		}
		public void setIrCode(String irCode) {
			this.irCode = irCode;
		}
	}

}

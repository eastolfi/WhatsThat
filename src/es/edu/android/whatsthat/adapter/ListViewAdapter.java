package es.edu.android.whatsthat.adapter;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.handler.ListElementHandler;
import es.edu.android.whatsthat.helper.InfraredHelper;
import es.edu.android.whatsthat.util.ConstantsCommon;
import es.edu.android.whatsthat.util.IConstants;

@SuppressLint("InflateParams")
@SuppressWarnings("rawtypes")
public class ListViewAdapter extends BaseAdapter {

	Activity activity;
	public ArrayList<ListElementHandler> list;
	InfraredHelper irHelper;
	
	public ListViewAdapter(Activity activity, ArrayList<ListElementHandler> list) {
		super();
		this.activity = activity;
		this.list = list;
		irHelper = new InfraredHelper(activity);
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
			holder.setTxtDetail((TextView) convertView.findViewById(R.id.detailText));
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		ListElementHandler element = list.get(pos);
		holder.getTxtEntry().setText(element.getTextoColumna());
		holder.getTxtDetail().setText(element.getTextoDetalle());
		holder.getImgEntry().setImageResource(element.getImageSource());
		
		holder.setActionType(element.getActionHandler().getActionType());
		holder.setActionData(element.getActionHandler().getActionData());
		if (element.getActionHandler().getBrandName() != null && 
				!element.getActionHandler().getBrandName().isEmpty()) {
			holder.setBrandFlag(element.getActionHandler().getBrandName());
		}
		
		convertView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (irHelper != null) {
					ViewHolder holder = (ViewHolder) v.getTag();
					
					if (holder.getActionType().equals(IConstants.ACTION_SEND_IR)) {
						if (holder.getActionData().equals(IConstants.POWER_ALL)) {
							irHelper.emitAll(IConstants.POWER_LIST);
						} else {
							irHelper.emit(holder.getActionData().toString());
						}
					} else if (holder.getActionType().equals(IConstants.ACTION_START_ACTIVITY)) {
						Context ctx = activity.getApplicationContext();
						
						Intent i = new Intent(ctx, (Class) holder.getActionData());
						i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
						
						if (holder.getBrandFlag() != null && !holder.getBrandFlag().isEmpty()) {
							i.putExtra(ConstantsCommon.FLAG_BRAND, holder.getBrandFlag());
						}
						
						ctx.startActivity(i);
					}
				}
			}
		});
		
		return convertView;
	}
	
	public class ViewHolder {
		private TextView txtEntry;
		private ImageView imgEntry;
		private TextView txtDetail;
		private String actionType;
		private Object actionData;
		private String brandFlag;
		
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
		public String getActionType() {
			return actionType;
		}
		public void setActionType(String actionType) {
			this.actionType = actionType;
		}
		public Object getActionData() {
			return actionData;
		}
		public void setActionData(Object actionData) {
			this.actionData = actionData;
		}
		public String getBrandFlag() {
			return brandFlag;
		}
		public void setBrandFlag(String brandFlag) {
			this.brandFlag = brandFlag;
		}
	}

}

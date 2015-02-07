package es.edu.android.whatsthat.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.helper.InfraredHelper;
import es.edu.android.whatsthat.util.IConstants;

public class RemoteFullActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_remote_full);
		
		final InfraredHelper irHelper = new InfraredHelper(this);
		
		findViewById(R.id.btnRemotePower).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.POWER_SAMSUNG);
			}
		});
		findViewById(R.id.btnRemote0).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_0);
			}
		});
		findViewById(R.id.btnRemote1).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_1);
			}
		});
		findViewById(R.id.btnRemote2).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_2);
			}
		});
		findViewById(R.id.btnRemote3).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_3);
			}
		});
		findViewById(R.id.btnRemote4).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_4);
			}
		});
		findViewById(R.id.btnRemote5).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_5);
			}
		});
		findViewById(R.id.btnRemote6).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_6);
			}
		});
		findViewById(R.id.btnRemote7).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_7);
			}
		});
		findViewById(R.id.btnRemote8).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_8);
			}
		});
		findViewById(R.id.btnRemote9).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_9);
			}
		});
		findViewById(R.id.btnRemoteChanelUp).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_ChanelUp);
			}
		});
		findViewById(R.id.btnRemoteChanelDown).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_ChanelDown);
			}
		});
		findViewById(R.id.btnRemoteVolUp).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_VolumenUP);
			}
		});
		findViewById(R.id.btnRemoteVolDown).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_VolumenDown);
			}
		});
		findViewById(R.id.btnRemoteInfo).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Info);
			}
		});
		findViewById(R.id.btnRemoteGuide).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Guide);
			}
		});
		findViewById(R.id.btnRemoteUp).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Up);
			}
		});
		findViewById(R.id.btnRemoteDown).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Down);
			}
		});
		findViewById(R.id.btnRemoteLeft).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Left);
			}
		});
		findViewById(R.id.btnRemoteRight).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Right);
			}
		});
		findViewById(R.id.btnRemoteEnter).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Enter);
			}
		});
		findViewById(R.id.btnRemoteMenu).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Menu);
			}
		});
		findViewById(R.id.btnRemoteMute).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				irHelper.emit(IConstants.SAMSUNG_Mute);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.remote_full, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

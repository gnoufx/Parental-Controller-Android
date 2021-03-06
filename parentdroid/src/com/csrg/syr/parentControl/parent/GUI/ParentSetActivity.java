package com.csrg.syr.parentControl.parent.GUI;

import parentalcontroller.parent.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ParentSetActivity extends Activity {
	private Button btMain;
	private Button btMSG;
	private Button btMap;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		/*
		 * show the mail default botton
		 */
		btMain = (Button) findViewById(R.id.buttonMain);
		btMain.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Toast.makeText(getBaseContext(),
						"Show the List of Options to get Information",
						Toast.LENGTH_LONG).show();
				Intent l = new Intent(ParentSetActivity.this,
						ActionActivity.class);
				startActivity(l);
				
			}
		});
		/*
		 * send the msg to parentset
		 */
		this.btMSG = (Button) findViewById(R.id.showmsgbutton1);
		this.btMSG.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Toast.makeText(getBaseContext(),
						"Show the messages received by Parent",
						Toast.LENGTH_LONG).show();
				
				Intent intent = new Intent(ParentSetActivity.this, SMSReceiveActivity.class);
				startService(intent);
			}
		});
	}
}
package com.example.project.lichamduong;

import android.app.Application;
import android.util.Log;

import com.example.project.lichamduong.helper.AppConfig;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.ParseUser;
import com.parse.SaveCallback;

public class TodoListApplication extends Application {
	
	public static final String TODO_GROUP_NAME = "ALL_TODOS";
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		// add Todo subclass
		ParseObject.registerSubclass(Todo.class);
		// enable the Local Datastore
		Parse.enableLocalDatastore(getApplicationContext());
		Parse.initialize(this, AppConfig.PARSE_APPLICATION_ID, AppConfig.PARSE_CLIENT_KEY);
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
		ParseACL.setDefaultACL(defaultACL, true);
		ParseInstallation.getCurrentInstallation().saveInBackground();
		ParsePush.subscribeInBackground(AppConfig.PARSE_CHANNEL, new SaveCallback() {
			@Override
			public void done(ParseException e) {
				Log.e("Parse", "Successfully subscribed to Parse!");
			}
		});

	}
	
	

}

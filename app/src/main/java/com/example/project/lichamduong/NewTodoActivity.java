package com.example.project.lichamduong;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;

public class NewTodoActivity extends Activity {

	private Button saveButton;
	private Button deleteButton;
	private Button choseDate;
	private EditText todoText;
	private Spinner repeatedSpinner, dateKindSpinner, notifySpinner;
	private Todo todo;
	private String todoId = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_todo);

		// Fetch the todoId from the Extra data
		if (getIntent().hasExtra("ID")) {
			todoId = getIntent().getExtras().getString("ID");
		}
		ArrayAdapter<String> repeatedAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, new String[]{"Lap o moi name",
				"Chi lap lai o nam nay"});
		ArrayAdapter<String> dateKindAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, new String[]{"Theo Am Lich",
				"Theo Duong Lich"});
		ArrayAdapter<String> notifyAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, new String[]{"Nhac truoc 3 ngay",
				"Nhac truoc 2 ngay", "Nhac truoc 1 ngay", "Nhac trong ngay"});
		repeatedAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
		dateKindAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
		notifyAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
		todoText = (EditText) findViewById(R.id.todo_text);
		repeatedSpinner = (Spinner) findViewById(R.id.is_repeat);
		repeatedSpinner.setAdapter(repeatedAdapter);
		dateKindSpinner = (Spinner) findViewById(R.id.kind_of_date);
		dateKindSpinner.setAdapter(dateKindAdapter);
		notifySpinner = (Spinner) findViewById(R.id.notify_chooser);
		notifySpinner.setAdapter(notifyAdapter);
		choseDate = (Button) findViewById(R.id.calender_button);
		saveButton = (Button) findViewById(R.id.saveButton);
		deleteButton = (Button) findViewById(R.id.deleteButton);

		final Bundle state = savedInstanceState;
//        showDialogButton.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // Setup caldroid to use as dialog
//                dialogCaldroidFragment = new CaldroidFragment();
//                dialogCaldroidFragment.setCaldroidListener(listener);
//
//                // If activity is recovered from rotation
//                final String dialogTag = "CALDROID_DIALOG_FRAGMENT";
//                if (state != null) {
//                    dialogCaldroidFragment.restoreDialogStatesFromKey(
//                            getSupportFragmentManager(), state,
//                            "DIALOG_CALDROID_SAVED_STATE", dialogTag);
//                    Bundle args = dialogCaldroidFragment.getArguments();
//                    if (args == null) {
//                        args = new Bundle();
//                        dialogCaldroidFragment.setArguments(args);
//                    }
//                } else {
//                    // Setup arguments
//                    Bundle bundle = new Bundle();
//                    // Setup dialogTitle
//                    dialogCaldroidFragment.setArguments(bundle);
//                }
//
//                dialogCaldroidFragment.show(getSupportFragmentManager(),
//                        dialogTag);
//            }
//        });
		if (todoId == null) {
			todo = new Todo();
			todo.setUuidString();
		} else {
			ParseQuery<Todo> query = Todo.getQuery();
			query.fromLocalDatastore();
			query.whereEqualTo("uuid", todoId);
			query.getFirstInBackground(new GetCallback<Todo>() {

				@Override
				public void done(Todo object, ParseException e) {
					if (!isFinishing()) {
						todo = object;
						todoText.setText(todo.getTitle());
						deleteButton.setVisibility(View.VISIBLE);
					}
				}

			});

		}

		saveButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				todo.setTitle(todoText.getText().toString());
				todo.setDraft(true);
				todo.setAuthor(ParseUser.getCurrentUser());
				todo.pinInBackground(TodoListApplication.TODO_GROUP_NAME,
						new SaveCallback() {

							@Override
							public void done(ParseException e) {
								if (isFinishing()) {
									return;
								}
								if (e == null) {
									setResult(Activity.RESULT_OK);
									finish();
								} else {
									Toast.makeText(getApplicationContext(),
											"Error saving: " + e.getMessage(),
											Toast.LENGTH_LONG).show();
								}
							}

						});
			}

		});

		deleteButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// The todo will be deleted eventually but will
				// immediately be excluded from query results.
				todo.deleteEventually();
				setResult(Activity.RESULT_OK);
				finish();
			}

		});

	}

}

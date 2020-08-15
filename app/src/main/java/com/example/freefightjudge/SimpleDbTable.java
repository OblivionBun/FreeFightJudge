package com.example.freefightjudge;

import android.graphics.Color;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.freefightjudge.data.UserInfoDbHelper;

public class SimpleDbTable extends AppCompatActivity {

    private UserInfoDbHelper userInfoDbHelper;

    private TableLayout rootTableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_db_table);

        rootTableLayout = (TableLayout) findViewById(R.id.simple_db_table_tbl_lout_db_info);

        userInfoDbHelper = new UserInfoDbHelper(getApplicationContext());
        String[][] data = userInfoDbHelper.getAllUsersData(getApplicationContext());

        if (data != null) {

            TextView[][] textViews = new TextView[data.length][data[0].length];

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    textViews[i][j] = new TextView(this);
                }
            }

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    textViews[i][j].setText(data[i][j]);
                }
            }

            TableRow[] tableRows = new TableRow[data[0].length];
            CheckBox[] checkBox = new CheckBox[data[0].length];

            for (int i = 0; i < data[0].length; i++) {
                tableRows[i] = new TableRow(this);
                checkBox[i] = new CheckBox(this);
                checkBox[i].setId(i);
            }

            for (int i = 0; i < data[0].length; i++) { ;
                tableRows[i].addView(checkBox[i]);
                for (int j = 0; j < data.length; j++) {
                    tableRows[i].addView(textViews[j][i]);
                }

                if ((i % 2) == 0) {
                    tableRows[i].setBackgroundColor(Color.rgb(220, 220, 220));
                }
                rootTableLayout.addView(tableRows[i]);
            }
            //TODO возможность редактирования
        } else {
            System.out.println("data is NULL");
        }
    }
}

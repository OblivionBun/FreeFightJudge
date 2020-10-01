package com.example.freefightjudge;

import android.graphics.Color;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.freefightjudge.data.DatabaseWrapper;
import com.example.freefightjudge.data.UserInfoDbHelper;

import java.time.Duration;

public class SimpleDbTable extends AppCompatActivity {
  public static final int COLUMN_ID = 0;

  public static final int COLUMN_FIRST_NAME = 1;

  public static final int COLUMN_LAST_NAME = 2;

  public static final int COLUMN_DATE_REGISTER = 3;

  public static final int COLUMN_SCORE = 4;

  public static final int COLUMN_RANK = 5;

  private DatabaseWrapper databaseWrapper;

  private TableLayout rootTableLayout;

  /**
   * Метод, вызываемый при создании активити. Выводит на экран информацию о пользователях из базы данных.
   * @param savedInstanceState
   */
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple_db_table);

    rootTableLayout = (TableLayout) findViewById(R.id.simple_db_table_tbl_lout_db_info);

    databaseWrapper = new DatabaseWrapper();
    String[][] data = databaseWrapper.getAllUsers();

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

      for (int i = 0; i < data[0].length; i++) {
        ;
        tableRows[i].addView(checkBox[i]);
        for (int j = 0; j < data.length; j++) {
          tableRows[i].addView(textViews[j][i]);
        }

        if ((i % 2) == 0) {
          tableRows[i].setBackgroundColor(Color.rgb(220, 220, 220));
        }
        rootTableLayout.addView(tableRows[i]);
      }
      // TODO: Возможность редактирования и добавления новых бойцов
    } else {
      Toast.makeText(getApplicationContext(), "Возможно, вы не добавили ни одного пользователя.", Toast.LENGTH_SHORT).show();
    }
  }
}

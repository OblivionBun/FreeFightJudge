package com.example.freefightjudge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

public class FightActivity extends AppCompatActivity {
  /*private Toolbar toolbar;
  
  private TabLayout tabLayout;

  private ViewPager viewPager;
  
  private FightTabAdapter fightTabAdapter;

  private FightFragment pageFragment;*/
  
  private TextView txtRemainScoreFirst;
  
  private TextView txtRemainScoreSecond;
  
  private TextView txtNameFirst;
  
  private TextView txtNameSecond;
  
  private TextView txtSummaryScore;
  
  private ImageButton imgbtnWarningFirst;
  
  private ImageButton imgbtnWarningSecond;
  
  private ImageButton imgbtnPlusOneFirst;
  
  private ImageButton imgbtnPlusTwoFirst;
  
  private ImageButton imgbtnPlusThreeFirst;
  
  private ImageButton imgbtnPlusOneSecond;
  
  private ImageButton imgbtnPlusTwoSecond;
  
  private ImageButton imgbtnPlusThreeSecond;
  
  private TextView txtPlusOneMainText;
  
  private TextView txtPlusOneSubText;
  
  private TextView txtPlusTwoMainText;
  
  private TextView txtPlusTwoSubText;
  
  private TextView txtPlusThreeMainText;
  
  private TextView txtPlusThreeSubText;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fight);

    /*toolbar = (Toolbar) findViewById(R.id.fight_tbar);
    toolbar.setTitle(R.string.txt_fight);
  
    tabLayout = findViewById(R.id.fight_tablout);
    viewPager = findViewById(R.id.fight_vpager);
    viewPager.setAdapter(new FightTabAdapter(getSupportFragmentManager()));
    tabLayout.setupWithViewPager(viewPager);*/
    
    txtRemainScoreFirst = (TextView) findViewById(R.id.fight_txt_remain_score_first);
    txtRemainScoreSecond = (TextView) findViewById(R.id.fight_txt_remain_score_second);
    
    txtNameFirst = (TextView) findViewById(R.id.fight_txt_name_first);
    txtNameSecond = (TextView) findViewById(R.id.fight_txt_name_second);
    
    txtSummaryScore = (TextView) findViewById(R.id.fight_txt_summary_score);
    
    imgbtnWarningFirst = (ImageButton) findViewById(R.id.fight_imgbtn_warning_first);
    imgbtnWarningSecond = (ImageButton) findViewById(R.id.fight_imgbtn_warning_second);
    
    imgbtnPlusOneFirst = (ImageButton) findViewById(R.id.fight_imgbtn_button_plus_1_first);
    imgbtnPlusTwoFirst = (ImageButton) findViewById(R.id.fight_imgbtn_button_plus_2_first);
    imgbtnPlusThreeFirst = (ImageButton) findViewById(R.id.fight_imgbtn_button_plus_3_first);
    imgbtnPlusOneSecond = (ImageButton) findViewById(R.id.fight_imgbtn_button_plus_1_second);
    imgbtnPlusTwoSecond = (ImageButton) findViewById(R.id.fight_imgbtn_button_plus_2_second);
    imgbtnPlusThreeSecond = (ImageButton) findViewById(R.id.fight_imgbtn_button_plus_3_second);
    
    txtPlusOneMainText = (TextView) findViewById(R.id.fight_txt_name_button_1);
    txtPlusTwoMainText = (TextView) findViewById(R.id.fight_txt_name_button_2);
    txtPlusThreeMainText = (TextView) findViewById(R.id.fight_txt_name_button_3);
    
    txtPlusOneSubText = (TextView) findViewById(R.id.fight_txt_description_button_1);
    txtPlusTwoSubText = (TextView) findViewById(R.id.fight_txt_description_button_2);
    txtPlusThreeSubText = (TextView) findViewById(R.id.fight_txt_description_button_3);
  }
  
  
  
  
}


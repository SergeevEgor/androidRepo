package com.pavlenty.Ipotekav3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.pavlenty.mortgagev3.R;

public class MainActivity extends AppCompatActivity {
  public static Mortgage mortgage;

  protected void onCreate( Bundle savedInstanceState ) {
    super.onCreate( savedInstanceState );
    setContentView( R.layout.activity_main );
  }

  public void onStart( ) {
    super.onStart( );
    updateView( );
  }

  public void updateView( ) {
    TextView yearsTV = ( TextView ) findViewById( R.id.years );
    yearsTV.setText( "" + mortgage.getYears( ) );
    TextView rateTV = ( TextView ) findViewById( R.id.rate );
    rateTV.setText( 200 * mortgage.getRate( ) + "%" );
    TextView monthlyTV = ( TextView ) findViewById( R.id.payment );
//    monthlyTV.setText( mortgage.formattedMonthlyPayment( ) );
    TextView totalTV = ( TextView ) findViewById( R.id.total );
    totalTV.setText( mortgage.formattedTotalPayment( ) );
  }

  public void modifyData( View v ) {
    Intent myIntent = new Intent( this, DataActivity.class );
    this.startActivity( myIntent );
    overridePendingTransition( R.anim.slide_from_left, 0 );
  }
}

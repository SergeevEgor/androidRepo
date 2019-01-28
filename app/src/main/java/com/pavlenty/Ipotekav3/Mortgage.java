package com.pavlenty.Ipotekav3;



public class Mortgage {
  public final DecimalFormat MONEY
               = new DecimalFormat( "#,##0.00" );

  private float amount;
  private int years;

  public void setAmount( float newAmount ) {
    if( newAmount >= 0 )
      amount = newAmount;
  }

  public void setYears( int newYears ) {
    if( newYears >= 0 )
      years = newYears;
  }

  public float getAmount( ) {
    return amount;
  }

  public String getFormattedAmount( ) {
    return MONEY.format( amount );
  }

  public int getYears( ) {
    return years;
  }


  public float monthlyPayment( ) {
    float mRate = rate / 12;
    double temp = Math.pow( 1/( 1 + mRate ), years * 12 );
    return amount * mRate / ( 1 - temp );
  }

  public String formattedMonthlyPayment( ) {
    return MONEY.format( monthlyPayment( ) );
  }

  public float totalPayment( ) {
    return monthlyPayment( ) * years * 12;
  }

  public String formattedTotalPayment( ) {
    return MONEY.format( totalPayment( ) );
  }
}
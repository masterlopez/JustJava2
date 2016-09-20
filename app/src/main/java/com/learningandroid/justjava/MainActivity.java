package com.learningandroid.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 2;

    /**
     * Method to increment the number of cups
     * @param view
     */
    public void increment(View view)
    {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * Method to decrease the number of cups
     * @param view
     */
    public void decrement(View view)
    {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }


    /**
     * This method is called when the order button is clicked
     */
    public void submitOrder(View v)
    {
        //displayPrice(quantity * 5);
        int price = calculatePrice();
        String priceMessage = "The price for " + quantity + " cup(s) is $" + price;
        priceMessage = priceMessage + ".\nThank you!";
        displayMessage(priceMessage);

        //calculatePrice();
    }

    /**
     * This method displays the given quantity value on the screen
     */
    private void displayQuantity(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price value on the screen.
     */
//    private void displayPrice(int number)
//    {
//        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
//    }



    /**
     * This method displays the given text on the screen.
     * @param message
     */
    private void displayMessage(String message)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * Calculates the price of the order.
     *
     * @ quantity is the number of cups of coffee ordered
     */
    private int calculatePrice()
    {
       int price = quantity * 5;
        return price;
    }
}

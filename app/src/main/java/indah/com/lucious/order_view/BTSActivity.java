package indah.com.lucious.order_view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import indah.com.lucious.R;

public class BTSActivity extends AppCompatActivity {

    TextView mTextHarga,mTextQty, albumbts;
    Button mButtonOrder,mButtonPlus,mButtonMin;
    int harga = 0;
    int qty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bts);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        albumbts = (TextView) findViewById(R.id.albumbts);
        mTextHarga = (TextView) findViewById(R.id.mTextHarga);
        mButtonOrder = (Button) findViewById(R.id.mButtonOrder);
        mTextQty = (TextView) findViewById(R.id.mTextQty);
        mButtonPlus = (Button) findViewById(R.id.mButtonPlus);
        mButtonMin = (Button) findViewById(R.id.mButtonMin);
    }

    public void onClickOrder(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"indahriz@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_TEXT,
                "Saya pesan " + albumbts + " sebanyak "
                        + mTextQty.getText()
                        + " seharga "
                        + mTextHarga.getText());
        try {
            startActivity(Intent.createChooser(emailIntent, "send mail.."));
            finish();
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(this, "There is no email client installd,", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickPlus(View view){
        harga = harga + 270000;
        qty = qty + 1;
        mTextQty.setText(qty+"");
        mTextHarga.setText("Rp"+harga);
    }

    public void onClickMin(View view){
        if(harga != 0) {
            harga = harga - 270000;
            qty = qty - 1;
            mTextQty.setText(qty+"");
            mTextHarga.setText("Rp"+harga);
        }
        else {
            harga = 0;
            qty = 0;
            mTextQty.setText(qty+"");
            mTextHarga.setText("Rp"+harga);
        }
    }

    public void onClickReset(View v){
        harga = 0;
        qty = 0;
        mTextHarga.setText("Rp"+harga);
        mTextQty.setText(qty+"");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}

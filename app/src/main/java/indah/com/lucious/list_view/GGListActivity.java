package indah.com.lucious.list_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import indah.com.lucious.R;
import indah.com.lucious.order_view.GSDActivity;
import indah.com.lucious.order_view.RVActivity;
import indah.com.lucious.order_view.SNSDActivity;

public class GGListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gglist);
    }

    public void onClickRV(View view){
        Intent i = new Intent(this, RVActivity.class);
        startActivity(i);
    }

    public void onClickSNSD(View view){
        Intent i = new Intent(this, SNSDActivity.class);
        startActivity(i);
    }

    public void onClickGSD(View view){
        Intent i = new Intent(this, GSDActivity.class);
        startActivity(i);
    }
}

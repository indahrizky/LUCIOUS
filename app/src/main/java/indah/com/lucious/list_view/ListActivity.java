package indah.com.lucious.list_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import indah.com.lucious.R;
import indah.com.lucious.order_view.BTSActivity;
import indah.com.lucious.order_view.EXOActivity;
import indah.com.lucious.order_view.GOT7Activity;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void onClickBTS(View view){
        Intent i = new Intent(this, BTSActivity.class);
        startActivity(i);
    }

    public void onClickEXO(View view){
        Intent i = new Intent(this, EXOActivity.class);
        startActivity(i);
    }

    public void onClickGOT7(View view){
        Intent i = new Intent(this, GOT7Activity.class);
        startActivity(i);
    }

}

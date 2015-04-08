package com.json.benzibama.android.customlistexample;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends Activity {
    String[] names={"Apple","grapes","Orange","Pear","Strawberry","Watermelon"};
    Integer[] imgid={R.drawable.apple,R.drawable.grapes,R.drawable.orange,
            R.drawable.pear,R.drawable.strawberry,R.drawable.watermelon};
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomListAdapter adapter=new CustomListAdapter(this, names, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
    }
}

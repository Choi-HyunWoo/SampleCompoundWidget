package com.hw.corcow.samplecompoundwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ItemView itemView1, itemView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemData data;

        itemView1 = (ItemView) findViewById(R.id.item_my);
        data = new ItemData();
        data.icon = getResources().getDrawable(R.drawable.aa13940032);
        data.title = "연승익";
        data.desc = "강사님";
        itemView1.setItemData(data);

        itemView1.setOnImageClickListener(new ItemView.OnImageClickListener() {
            @Override
            public void onImageClick(ItemView view, ItemData data) {
                Toast.makeText(MainActivity.this, "title : " + data.title, Toast.LENGTH_SHORT).show();
            }
        });

        itemView2 = (ItemView) findViewById(R.id.item_my2);
        data = new ItemData();
        data.icon = getResources().getDrawable(R.drawable.bb6938292);
        data.title = "최현우";
        data.desc = "학생";
        itemView2.setItemData(data);
    }
}

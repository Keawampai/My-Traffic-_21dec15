package thailand.keawampai.pakpoom.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindwidget();
        buttonController();
        ListViewController();
    }

    private void ListViewController() {
        //#1
        final int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20,};
        //#2
        final String[] strtitle = new String[20];
        strtitle[0] = "หัวข้อที่ 1";
        strtitle[1] = "หัวข้อที่ 2";
        strtitle[3] = "หัวข้อที่ 3";
        strtitle[4] = "หัวข้อที่ 4";
        strtitle[5] = "หัวข้อที่ 5";
        strtitle[6] = "หัวข้อที่ 6";
        strtitle[7] = "หัวข้อที่ 7";
        strtitle[8] = "หัวข้อที่ 8";
        strtitle[9] = "หัวข้อที่ 9";
        strtitle[10] = "หัวข้อที่ 10";
        strtitle[11] = "หัวข้อที่ 11";
        strtitle[12] = "หัวข้อที่ 12";
        strtitle[13] = "หัวข้อที่ 13";
        strtitle[14] = "หัวข้อที่ 14";
        strtitle[15] = "หัวข้อที่ 15";
        strtitle[16] = "หัวข้อที่ 16";
        strtitle[17] = "หัวข้อที่ 7";
        strtitle[18] = "หัวข้อที่ 18";
        strtitle[19] = "หัวข้อที่ 19";
        strtitle[20] = "หัวข้อที่ 20";

        //#3
        String[] strDetail = getResources().getStringArray(R.array.detail_short);
        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, strtitle, strDetail, intIcon);
        trafficListView.setAdapter(objMyAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent objIntent = new Intent(MainActivity.this,detail_Activity.class);
                objIntent.putExtra("Title", strtitle[position]);
                objIntent.putExtra("Image", intIcon[position]);
                objIntent.putExtra("Index", position);
                startActivity(objIntent);


            }//event
        });

    }//ListViewController

    private void buttonController() {
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.h1);
                buttonMediaPlayer.start();

                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://www.youtube.com/watch?v=mMKwM_FYBOo"));
                startActivity(objIntent);

            }
        });

    }


    private void bindwidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById((R.id.button));
    }

}

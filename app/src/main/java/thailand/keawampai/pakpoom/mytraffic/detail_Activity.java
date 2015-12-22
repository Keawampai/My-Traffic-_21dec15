package thailand.keawampai.pakpoom.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class detail_Activity extends AppCompatActivity {
    private TextView titleTextView,detailTextView;
    private ImageView titleImageView,detailImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);
        bindWidget();

        //show view
        showView();

    }//main method

    private void showView() {
        //show title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);
        //show Image
        int intIcon = getIntent().getIntExtra("Image",R.drawable.traffic_01);
        titleImageView.setImageResource(intIcon);
        //show detail
        String[] strDetail = getResources().getStringArray(R.array.detail_long);
        int intIndex = getIntent().getIntExtra("Index", 0);
        detailTextView.setText(strDetail[intIndex]);

    }//show view

    private void bindWidget(){
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        titleImageView = (ImageView) findViewById(R.id.imageView2);

    }
} //main class

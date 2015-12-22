package thailand.keawampai.pakpoom.mytraffic;

import android.content.Context;
import android.media.Image;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import thailand.keawampai.pakpoom.mytraffic.R;

/**
 * Created by PAKPOOM_K on 22/12/2558.
 */
public class MyAdapter extends BaseAdapter{
    //ประกาศตัวแปร
    private Context objContex;
    private String[] titleStrings, detailString;
    private int[] iconInts;

    public MyAdapter(Context objContex, String[] titleStrings, String[] detailString, int[] iconInts) {
        this.objContex = objContex;
        this.titleStrings = titleStrings;
        this.detailString = detailString;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {

        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContex.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView = objLayoutInflater.inflate(R.layout.my_listview, parent, false); 
        //for title
        TextView titleTextView = (TextView) objView.findViewById((R.id.textView2));
        titleTextView.setText(titleStrings[position]);
        //for detail
        TextView detailTextView = (TextView) objView.findViewById(R.id.textView3);
        detailTextView.setText(detailString[position]);
        //for icon
        ImageView IconImageView = (ImageView) objView.findViewById(R.id.imageView);
        IconImageView.setImageResource(iconInts[position]);
        return objView;
    }
}//main class

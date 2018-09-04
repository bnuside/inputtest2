package yuside.cn.numbersonly;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

//        Button testButton = (Button)findViewById(R.id.testButton);
//        testButton.setOnClickListener(mBtnListener);

//        setTitle(BuildConfig.FLAVOR);
        setFade();

    }

    public void setFade() {
        LinearLayout layout = (LinearLayout)findViewById(R.id.lists);
        final int sdk = Build.VERSION.SDK_INT;
        for (int i = 0; i < layout.getChildCount(); i++) {
            View v = layout.getChildAt(i);
            if (v instanceof EditText) {
                if (sdk < Build.VERSION_CODES.JELLY_BEAN) {
                    v.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.color_stroke));
                } else {
                    v.setBackground(ContextCompat.getDrawable(this, R.drawable.color_stroke));
                }

                ((EditText) v).setHintTextColor(getResources().getColor(R.color.colorFadeText));
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



//    private View.OnClickListener mBtnListener = new View.OnClickListener(){
//        public void onClick(View v){
//            switch (v.getId()) {
//                case R.id.testButton:
//                    EditText ip = (EditText)findViewById(R.id.inputEdit);
//                    ip.setText("Hello, World!");
//                    break;
//                default:
//                    Log.d("SIDE", "test");
//            }
//        }
//
//    };
}

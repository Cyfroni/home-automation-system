package orangepi.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import static orangepi.client.MainActivity.connection;

public class ChooseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_choose);
    }

    public void select(View view) {
        Intent intent;
        switch(view.getId())
        {
            case R.id.balconyButtons_b:
                intent = new Intent(this, BalconyButtonsActivity.class);
                break;
            case R.id.balconyArea_b:
                intent = new Intent(this, BalconyAreaActivity.class);
                break;
            default:
                return;
        }

        startActivity(intent);
    }
}

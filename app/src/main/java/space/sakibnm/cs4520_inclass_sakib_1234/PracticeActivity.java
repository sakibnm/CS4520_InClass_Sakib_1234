package space.sakibnm.cs4520_inclass_sakib_1234;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PracticeActivity extends AppCompatActivity {

    private Button button_logcat, button_toast;
    private String TAG = "demo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        button_logcat =
                findViewById(R.id.button_practice_logcat);
        button_toast =
                findViewById(R.id.button_practice_toast);

        button_logcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Practice!Practice!!Practice!!!");
            }
        });

        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PracticeActivity.this, "Nice work!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package studio.stijl.tsl_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        final Button mActivitie1 = findViewById(R.id.activitie1Button);
        mActivitie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Activitie1.class);
                startActivity(i);
            }
        });
        final Button mActivitie2 = findViewById(R.id.activitie2Button);
        mActivitie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Activitie2.class);
                startActivity(i);
            }
        });
        final Button mActivitie3 = findViewById(R.id.activitie3Button);
        mActivitie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Activitie3.class);
                startActivity(i);
            }
        });
        final Button mButton = findViewById(R.id.button4);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(),Activitie2.class);
                //startActivity(i);
                throw new RuntimeException("This is a crash2");
            }
        });
    }

    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }

}

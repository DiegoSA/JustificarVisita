package multipel.justificarvisita.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import multipel.justificarvisita.R;

public class OptionsScreen extends AppCompatActivity {

    private Button JustifyVisit;
    private Button ReportActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JustifyVisit = (Button) findViewById(R.id.buttonJustify);
        ReportActivity = (Button) findViewById(R.id.buttonReport);

        JustifyVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), JustifyScreen.class);
                startActivity(i);
            }
        });

        ReportActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), ReportScreen.class);
                startActivity(i);
            }
        });
    }
}

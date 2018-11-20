package multipel.justificarvisita.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import multipel.justificarvisita.R;

public class JustifyScreen extends AppCompatActivity {

    private Button newClient;
    private Button saveJustify;
    private SimpleDateFormat sd;
    private Date date;
    private TextView textViewToday;
    private TextView textViewRcaName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justify_screen);

        newClient = (Button) findViewById(R.id.buttonNewClient);
        saveJustify = (Button) findViewById(R.id.buttonSave);
        textViewToday = (TextView) findViewById(R.id.textViewToday);
        textViewRcaName = (TextView) findViewById(R.id.textViewRcaName);
        sd = new SimpleDateFormat("dd-MM-yyyy");
        date = new Date();
        String today = sd.format(date);
        textViewToday.setText(today);
        textViewRcaName.setText("Diego");

        newClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

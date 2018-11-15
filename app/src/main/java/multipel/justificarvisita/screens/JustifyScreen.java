package multipel.justificarvisita.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import multipel.justificarvisita.R;

public class JustifyScreen extends AppCompatActivity {

    private Button newClient;
    private Button saveJustify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justify_screen);

        newClient = (Button) findViewById(R.id.buttonNewClient);
        saveJustify = (Button) findViewById(R.id.buttonSave);

        newClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

package multipel.justificarvisita.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import auxiliar.Justificativa;
import multipel.justificarvisita.R;

public class JustifyScreen extends AppCompatActivity {

    private Button newClient;
    private Button saveJustify;
    private SimpleDateFormat sd;
    private Date date;
    private TextView textViewToday;
    private TextView textViewRcaName;
    private RadioGroup radioGroupStatus;
    private RadioButton radioButtonStatus;
    private EditText editTextMotivo;
    private Justificativa justificativa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justify_screen);

        newClient = (Button) findViewById(R.id.buttonNewClient);
        saveJustify = (Button) findViewById(R.id.buttonSave);
        textViewToday = (TextView) findViewById(R.id.textViewToday);
        textViewRcaName = (TextView) findViewById(R.id.textViewRcaName);

        //radioButtonStatus = (RadioButton) findViewById(R.id.ra)
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

        saveJustify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addListenerOnRadioGroup();
            }
        });
    }

    public void addListenerOnRadioGroup(){
        radioGroupStatus = (RadioGroup) findViewById(R.id.radioGroupStatus);
        Integer selectedId = radioGroupStatus.getCheckedRadioButtonId();

        if(selectedId.equals(null)){
            Toast.makeText(getBaseContext(),"Preencha o status da Justificativa!!!", Toast.LENGTH_LONG).show();
            return;
        }else{
            justificativa = new Justificativa();

            justificativa.setVendedor(textViewRcaName.getText().toString());
            justificativa.setData(textViewToday.getText().toString());

            radioButtonStatus = (RadioButton) findViewById(selectedId);
            editTextMotivo = (EditText) findViewById(R.id.editTextMotivo);

            justificativa.setMotivo(editTextMotivo.getText().toString());
            justificativa.setStatus(radioButtonStatus.getText().toString());

        }
    }
}

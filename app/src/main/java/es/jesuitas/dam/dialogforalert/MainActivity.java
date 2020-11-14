package es.jesuitas.dam.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        // Set the dialog title and message.
        myAlertBuilder.setTitle(R.string.pick_color);
        myAlertBuilder.setItems(R.array.bands_array, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String band;
                band = getResources().getStringArray(R.array.bands_array)[i];
                Toast.makeText(getApplicationContext(), band,
                        Toast.LENGTH_SHORT).show();
            }
        });
        // Create and show the AlertDialog.
        myAlertBuilder.show();
    }
}
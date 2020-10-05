package Android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editName, editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.et_name);
        editAge = findViewById(R.id.et_age);
    }

    public void onClickBtnShow(View v){
        String message = "Olá " + editName.getText() + ", você tem " + editAge.getText() + " anos.";

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }

    public void onClickBtnClear(View v){
        editName.setText("");
        editAge.setText("");
    }
}

package Android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editName, editAge;
//    private Button show, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.et_name);
        editAge = findViewById(R.id.et_age);
//        Button show = (Button) findViewById(R.id.btnShow);
//        Button clear = (Button) findViewById(R.id.btnClear);
    }

    public void onClickBtnShow(View v){
//        EditText editName = findViewById(R.id.et_name);
//        EditText editAge = findViewById(R.id.et_age);

//        String text1 = editName.getText().toString();
//        String text2 = editAge.getText().toString();
//        String message = "Olá " + text1 + ", você tem " + text2 + " anos.";
        String message = "Olá " + editName.getText() + ", você tem " + editAge.getText() + " anos.";

//        Toast.makeText(MainActivity.this, (editName).getText(), Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }

    public void onClickBtnClear(View v){
        editName.setText("");
        editAge.setText("");
    }
}
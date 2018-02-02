package practice.pre.misao_btnclickchangetxt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView,textView2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        editText = findViewById( R.id.et1 );
        textView = findViewById( R.id.tv1 );
        textView2 = findViewById( R.id.tv2 );
        button = findViewById( R.id.btn1 );
    }

    public void changeTxt(View view)
    {
        int a = Integer.parseInt( editText.getText().toString() );
        textView.setText( "Hello Masa, How are You ?" );

        textView2.setText( String.valueOf(  a) );
    }
}

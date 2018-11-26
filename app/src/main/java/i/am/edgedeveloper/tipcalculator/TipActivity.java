package i.am.edgedeveloper.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class TipActivity extends AppCompatActivity implements EditText.OnEditorActionListener {

    EditText bill;
    TextView tip,totalField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);

        bill = (EditText) findViewById(R.id.billEditText);
        tip = (TextView) findViewById(R.id.tip);
        totalField = (TextView) findViewById(R.id.totalField);
        bill.setOnEditorActionListener(this);
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

        if (i == EditorInfo.IME_ACTION_DONE||i == EditorInfo.IME_ACTION_UNSPECIFIED){
                tip.setText("$10.00");
                totalField.setText("$110.00");
        }
        return false;
    }
}

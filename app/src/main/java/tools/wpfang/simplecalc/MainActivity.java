package tools.wpfang.simplecalc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView tv;
    int computeresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.editText);
        ed2=findViewById(R.id.editText2);
        tv=findViewById(R.id.textView2);
    }

    public void doAdd(View view) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if(ed1.getText().toString().matches("") || ed2.getText().toString().matches(""))
        {
            Toast.makeText(this,"empty input",Toast.LENGTH_SHORT).show();
        }
        else {
            int num1 = Integer.parseInt(ed1.getText().toString());
            int num2 = Integer.parseInt(ed2.getText().toString());
            computeresult = doAddition(num1, num2);
            tv.setText(String.valueOf(computeresult));
        }
    }

    public void doSub(View view) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if(ed1.getText().toString().matches("") || ed2.getText().toString().matches(""))
        {
            Toast.makeText(this,"empty input",Toast.LENGTH_SHORT).show();
        }
        else {
            int num1 = Integer.parseInt(ed1.getText().toString());
            int num2 = Integer.parseInt(ed2.getText().toString());
            computeresult = doSubtraction(num1, num2);
            tv.setText(String.valueOf(computeresult));
        }
    }
    public void doMul(View view) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if(ed1.getText().toString().matches("") || ed2.getText().toString().matches(""))
        {
            Toast.makeText(this,"empty input",Toast.LENGTH_SHORT).show();
        }
        else {
            int num1 = Integer.parseInt(ed1.getText().toString());
            int num2 = Integer.parseInt(ed2.getText().toString());
            computeresult = doMultiple(num1, num2);
            tv.setText(String.valueOf(computeresult));
        }
    }
    public void doDiv(View view) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if(ed1.getText().toString().matches("") || ed2.getText().toString().matches(""))
        {
            Toast.makeText(this,"empty input",Toast.LENGTH_SHORT).show();
        }
        else {
            int num1 = Integer.parseInt(ed1.getText().toString());
            int num2 = Integer.parseInt(ed2.getText().toString());
            computeresult = doDivision(num1, num2);
            tv.setText(String.valueOf(computeresult));
        }
    }
    public int doAddition(int n1,int n2)
    {
        return n1+n2;
    }
    public int doSubtraction(int n1,int n2)
    {
        return n1-n2;
    }

    public int doMultiple(int n1,int n2)
    {
        return n1*n2;
    }
    public int doDivision(int n1,int n2)
    {
        return n1/n2;
    }
}

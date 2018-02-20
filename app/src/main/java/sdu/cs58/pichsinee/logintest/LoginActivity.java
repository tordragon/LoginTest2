package sdu.cs58.pichsinee.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //1. Explicit ประกาศตัวแปรยน java
    EditText nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString, userString, pasaString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2. Initial view ผูกตัวแปรบน java ให้รู้จักกับ element บน xml
        nameEditText = findViewById(R.id.txtName);
        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);

        //สั่งให้ปุ่มหลักว่า user คลิกที่ปุ่ม  Login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ดึงข้อมูลที่ user ป้อนในหน้า UI มาเก็บในตัวแประชิต
                nameString = nameEditText.getText().toString().trim();
                userString = usernameEditText.getText().toString().trim();
                pasaString = passwordEditText.getText().toString().trim();

                //ตรวดสอบการ Login
                if ((userString.equals("admin")) && (pasaString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(), "LoginSuccess", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "LoginFai!!!", Toast.LENGTH_SHORT).show();
                    //Toast.makeText(getApplicationContext(),"Hello " + nameString,Toast.LENGTH_SHORT).show();
                }
            }
        });

    } //end method onCreate
} //end class

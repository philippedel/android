package com.example.drphil.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Login extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private TextView Forgot;
    private TextView Register;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = (EditText)findViewById(R.id.etEmail);
        Password = (EditText)findViewById(R.id.etPassword);
        Forgot = (TextView)findViewById(R.id.txtForgotPassword);
        Register = (TextView)findViewById(R.id.txtRegister);
        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               Validate(Email.getText().toString(), Password.getText().toString());
            }
        });
    }
    //Login validation for email and password
    private void Validate(String UserEmail, String UserPassword) {
        if ((UserEmail.equals("admin")) && (UserPassword.equals("admin"))) {
            Intent intent = new Intent(Login.this, SecondActivity.class);
                                                            //Instead of SecondActivity put the page with map page....
            startActivity(intent);
        }
    }

    public void ForgotPassword_action(View v)
    {
//        TextView tv= (TextView) findViewById(R.id.text_view);
        Forgot = (TextView)findViewById(R.id.txtForgotPassword);
        Intent to_forgot_password = new Intent(Login.this, ForgotPasswordPage.class);
                                                                    //Instead of ForgotPasswordPage put the page with forgot password....
        startActivity(to_forgot_password);

    }
    public void Register_action(View v)
    {
        Register = (TextView)findViewById(R.id.txtRegister);
        Intent to_register = new Intent(Login.this, Register.class);
                                                                //Instead of Register put the page with sign up....
        startActivity(to_register);

    }


}

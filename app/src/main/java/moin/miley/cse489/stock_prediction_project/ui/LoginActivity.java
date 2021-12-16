package moin.miley.cse489.stock_prediction_project.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import moin.miley.cse489.stock_prediction_project.MainActivity;
import moin.miley.cse489.stock_prediction_project.R;
import moin.miley.cse489.stock_prediction_project.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private CheckBox rememberUserId, rememberLogin;
    private boolean isUserExist = false;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor prefEditor;
    private String existingUserId = "";
    private boolean wasOpened = false;
    public static final String DEFAULT = "N/A";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.fragment_login);
        sharedPreferences = getSharedPreferences("LoginSharedPrefs", MODE_PRIVATE);
        isUserExist = sharedPreferences.contains("RM_LOGIN");

        boolean isUserIdRemembered = false;
        if(isUserExist){
            if(sharedPreferences.getBoolean("RM_LOGIN", false)){
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                return;
            }
            isUserIdRemembered = sharedPreferences.getBoolean("RM_USER_ID", false);
            if(isUserIdRemembered){
                existingUserId = sharedPreferences.getString("USERNAME", "");
            }
        }

        etUsername = findViewById(R.id.etUsername);
        etUsername.setText(existingUserId);
        etPassword = findViewById(R.id.etPassword);
        rememberUserId = findViewById(R.id.RememberUser);
        rememberLogin = findViewById(R.id.RememberLogin);
        rememberUserId.setChecked(isUserIdRemembered);

        findViewById(R.id.LoginBtn).setOnClickListener(r -> {
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();
            boolean isUserRemembered = rememberUserId.isChecked();
            boolean isLoginRemembered = rememberLogin.isChecked();

            StringBuilder strb = new StringBuilder();
            if(TextUtils.isEmpty(username) || username.length() < 4 || username.length() > 30){
                strb.append("Invalid Username");
            }
            if(TextUtils.isEmpty(password) || password.length() < 4 || password.length() > 10){
                strb.append("Invalid Password");
            }
            if(isUserExist){
                String existingPassword = sharedPreferences.getString("PASSWORD1", "");
                if (!password.equals(existingPassword)) {
                    strb.append("Incorrect Password");
                }
                if (strb.toString().length() != 0) {
                    ((TextView) findViewById(R.id.ErrorMessage)).setText(strb.toString());
                    return;
                }
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            } else{
                prefEditor = sharedPreferences.edit();
                prefEditor.putBoolean("RM_USER_ID", isUserRemembered);
                prefEditor.putBoolean("RM_LOGIN", isLoginRemembered);
                prefEditor.apply();

                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }

        });

        findViewById(R.id.registerText).setOnClickListener(r->{
            Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(i);
        });
    }
    /*@Override
    public void onPause() {
        super.onPause();
        wasOpened=true;
    }

    @Override
    public void onStart() {
        super.onStart();
        if(wasOpened){
            finish();
        }
    }*/
}

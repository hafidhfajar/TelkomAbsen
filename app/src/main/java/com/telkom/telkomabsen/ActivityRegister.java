package com.telkom.telkomabsen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText nip = (EditText)findViewById(R.id.txt_input_nip);
        final EditText nama = (EditText)findViewById(R.id.txt_input_nama);
        final EditText username = (EditText)findViewById(R.id.txt_input_register_username);
        final EditText password = (EditText)findViewById(R.id.txt_input_register_password);
        final EditText confirm = (EditText)findViewById(R.id.txt_input_register_confirm_password);
        final EditText telepon = (EditText)findViewById(R.id.txt_input_number);
        final Button register = (Button)findViewById(R.id.btn_execute_register);
        final CheckBox cek = (CheckBox)findViewById(R.id.checkBox);

         register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(nip.getText().toString().length() == 0){
                     nip.setError("NIP Harus Diisi !!");
                 }
                 else if(nama.getText().toString().length() == 0){
                     nama.setError("Nama Harus Diisi !!");
                 }else if(username.getText().toString().length() == 0){
                     username.setError("Username Harus Diisi !!");
                 }else if(password.getText().toString().length() == 0){
                     password.setError("Password Harus Diisi !!");
                 }else if(confirm.getText().toString().equals(password.getText().toString())){
                     confirm.setError("Password Harus Sama !!");
                 }else if(telepon.getText().toString().length() == 0) {
                     telepon.setError("Nomor HP Harus Diisi !!");
                 }else if(!cek.isChecked()){
                     Toast.makeText(getApplicationContext(), "You Must Agree with the terms and conditions",
                             Toast.LENGTH_LONG).show();
                 }else{
                     //masuk ke database


                     //sukses balik ke login
                     Toast.makeText(getApplicationContext(), "Registrasi Berhasil !!",
                             Toast.LENGTH_LONG).show();
                     Intent i = new Intent(ActivityRegister.this, ActivityLogin.class);
                     startActivity(i);
                 }

             }
         });

    }
}
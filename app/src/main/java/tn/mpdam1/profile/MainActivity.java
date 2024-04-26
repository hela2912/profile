package tn.mpdam1.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button editButton = findViewById(R.id.editButton);
        LinearLayout newLayout = findViewById(R.id.newLayout);
        Button submitButton = findViewById(R.id.submitButton);

        editButton.setOnClickListener(new View.OnClickListener() {
            boolean isNewLayoutVisible = false;

            @Override
            public void onClick(View v) {
                if (!isNewLayoutVisible) {
                    newLayout.setVisibility(View.VISIBLE);
                    submitButton.setVisibility(View.VISIBLE);
                    editButton.setText("Submit");
                    isNewLayoutVisible = true;
                } else {
                    newLayout.setVisibility(View.GONE);
                    submitButton.setVisibility(View.GONE);
                    editButton.setText("Edit Profile");
                    isNewLayoutVisible = false;
                }
            }
        });

    }
}
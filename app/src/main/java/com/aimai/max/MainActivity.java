package com.aimai.max;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(28, 28, 28, 28);
        layout.setBackgroundColor(Color.rgb(12, 16, 32));

        TextView title = new TextView(this);
        title.setText("AimAi Max");
        title.setTextSize(30);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Carrom Assistant");
        subtitle.setTextSize(17);
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        String[] features = {
            "Drawings",
            "Visible Search",
            "Automation",
            "Fast / Human Mode",
            "Auto Queue"
        };

        for (String feature : features) {
            Button button = new Button(this);
            button.setText(feature);
            layout.addView(button);
        }

        setContentView(layout);
    }
}

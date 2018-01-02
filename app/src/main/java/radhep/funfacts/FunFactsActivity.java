package radhep.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout layout;

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        layout = findViewById(R.id.layout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = factBook.getFact();
                //Updates the screen with the new fact
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                layout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}

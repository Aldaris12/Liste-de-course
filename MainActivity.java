package course.listedecourse;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String applicationname = getResources().getString(R.string.app_name);
        TextView text = new TextView(this);

        applicationname = applicationname.replace("ListeDeCourse", "Liste de course");
        text.setText(applicationname);
        setContentView(text);

    }
}

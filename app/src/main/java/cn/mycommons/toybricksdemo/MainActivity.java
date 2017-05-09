package cn.mycommons.toybricksdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import cn.mycommons.lib1.IText;
import com.github.snowdream.toybricks.ToyBricks;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IText iText = ToyBricks.getImplementation(IText.class);
        Log.i("MainActivity",iText.getText());
    }
}
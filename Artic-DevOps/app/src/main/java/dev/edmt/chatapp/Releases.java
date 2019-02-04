package dev.edmt.chatapp;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Releases extends Activity {

    ArrayList<String> StringArray = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_release);

        ArrayValueAddFunction();

        LinearLayout LinearLayoutView = new LinearLayout(this);
        TextView DisplayStringArray = new TextView(this);
        DisplayStringArray.setTextSize(17);
        LinearLayoutView.addView(DisplayStringArray);
        for (int i=0; i<StringArray.size();i++){
            DisplayStringArray.append(StringArray.get(i));
            DisplayStringArray.append("\n");
        }
        setContentView(LinearLayoutView);
    }

    private void ArrayValueAddFunction() {
        StringArray.add("V1.0.0 - Release management for Pilot testing.");
        StringArray.add("V1.0.1 - Build upgrade");
        StringArray.add("       - Gradle development");
        StringArray.add("       - Updated dependencies");
        StringArray.add("V2.0.0 - Stable release");
        StringArray.add("       - UI update");
        StringArray.add("       - Released tracker");
        StringArray.add("       - Inbuilt integration of releases to MA");
        StringArray.add("       - Optimized firebase interaction with activities");
        StringArray.add("       - Auto-login enabled for users");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");
        StringArray.add("");


    }
}

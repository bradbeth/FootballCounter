package android.example.footballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int huskerScore = 0;
    int hawkeyeScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHuskers(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        // }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Nebraska by 6 point for touchdown.
     */
    public void addSixForHuskers(View v) {
        huskerScore = (huskerScore + 6);
        displayForHuskers(huskerScore);
    }

    /**
     * Increase the score for Nebraska by 3 points for field goals.
     */
    public void addThreeForHuskers(View v) {
        huskerScore = (huskerScore + 3);
        displayForHuskers(huskerScore);
    }

    /**
     * Increase the score for Nebraska by 1 point for extra point after touchdown.
     */
    public void addOneForHuskers(View v) {
        huskerScore = (huskerScore + 1);
        displayForHuskers(huskerScore);
    }

    /**
     * Increase the score for Nebraska by 2 points for safety.
     */
    public void addTwoForHuskers(View v) {
        huskerScore = (huskerScore + 2);
        displayForHuskers(huskerScore);
    }

    /**
     * Increase the score for Iowa by 6 point for touchdown.
     */
    public void addSixForHawkeyes(View v) {
        hawkeyeScore = (hawkeyeScore + 6);
        displayForHawkeyes(hawkeyeScore);
    }

    /**
     * Increase the score for Iowa by 3 points for field goals.
     */
    public void addThreeForHawkeyes(View v) {
        hawkeyeScore = (hawkeyeScore + 3);
        displayForHawkeyes(hawkeyeScore);
    }

    /**
     * Increase the score for Iowa by 1 point for extra point after touchdown.
     */
    public void addOneForHawkeyes(View v) {
        hawkeyeScore = (hawkeyeScore + 1);
        displayForHawkeyes(hawkeyeScore);
    }

    /**
     * Increase the score for NIowa by 2 points for safety.
     */
    public void addTwoForHawkeyes(View v) {
        hawkeyeScore = (hawkeyeScore + 2);
        displayForHawkeyes(hawkeyeScore);
    }



    /**
     * Displays the given score for Nebraska.
     */
    public void displayForHuskers(int score) {
        TextView scoreView = findViewById(R.id.huskerScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Nebraska.
     */
    public void displayForHawkeyes(int score) {
        TextView scoreView = findViewById(R.id.hawkeyeScore);
        scoreView.setText(String.valueOf(score));
    }

    /**This resets team score
     */

    public void resetScores(View v) {
        huskerScore = 0;
        hawkeyeScore = 0;
        displayForHuskers(huskerScore);
        displayForHawkeyes(hawkeyeScore);
    }
}

package ee.ut.cs.coapserveblediscoverying;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by weiding on 28/03/15.
 */
public class CoapServerMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // create server
        Intent intent = new Intent(this,CoapBackgroundService.class);
        startService(intent);

    }
}

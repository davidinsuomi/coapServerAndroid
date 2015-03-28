package ee.ut.cs.coapserveblediscoverying;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import coap.*;
import endpoint.Endpoint;
import endpoint.LocalEndpoint;
import java.net.SocketException;

/**
 * Created by weiding on 28/03/15.
 */
public class CoapServerMainActivity extends Activity {
    public final String TAG = "CoapServerMainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // create server
        try {

            Endpoint server = new CoapServer();

            Log.e(TAG, "SampleServer listening at port %d." + server.port());

        } catch (SocketException e) {

            Log.e(TAG, "Failed to create SampleServer: %s" + e.getMessage());
            return;
        }

    }
}

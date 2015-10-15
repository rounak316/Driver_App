package app.driver.com.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import app.driver.com.driverapp.DataStructures.Driver;
import app.driver.com.driverapp.retroFitRequests.Requests.Customer;
import app.driver.com.driverapp.retroFitRequests.Requests.Member;
import app.driver.com.driverapp.retroFitRequests.Requests.tmp;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint("http://driverapp.in").build();


        Customer git = restAdapter.create(Customer.class);

        git.getCurators("29", new Callback<Driver>() {
            @Override
            public void success(Driver driver, Response response) {
                Log.d("retrived" ,"" +  driver.firstName);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("retrived" ,"error " + error);
            }
        });
    }



}

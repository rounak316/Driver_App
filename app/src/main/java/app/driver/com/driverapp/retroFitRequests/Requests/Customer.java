package app.driver.com.driverapp.retroFitRequests.Requests;

import app.driver.com.driverapp.DataStructures.Driver;
import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by Prakhar on 9/3/2015.
 */

    public interface Customer {
        @GET("/api/customer/{entityId}")
        void getCurators(
                @Path("entityId") String entityId , retrofit.Callback<Driver> callback


        );

    @DELETE("/api/customer/")
    Driver deleteCustomer(
            @Field("entityId") String entityId


    );

    @PUT("/api/customer/")
    Driver putCustomer(
            @Field("entityId") String entityId


    );

    }





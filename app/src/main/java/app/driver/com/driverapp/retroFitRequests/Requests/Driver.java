package app.driver.com.driverapp.retroFitRequests.Requests;

import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.GET;
import retrofit.http.PUT;

/**
 * Created by Prakhar on 9/3/2015.
 */

    public interface Driver {
        @GET("/api/driver/")
        app.driver.com.driverapp.DataStructures.Driver getCurators(
                @Field("entityId") String entityId


        );

    @DELETE("/api/driver/")
    app.driver.com.driverapp.DataStructures.Driver deleteCustomer(
            @Field("entityId") String entityId


    );

    @PUT("/api/driver/")
    app.driver.com.driverapp.DataStructures.Driver putCustomer(
            @Field("entityId") String entityId


    );

    }





package app.driver.com.driverapp.retroFitRequests.Requests;

import app.driver.com.driverapp.DataStructures.Driver;
import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by Prakhar on 9/3/2015.
 */
public interface Member {

        @POST("/api/member/changePassword")
        Driver changePassword(
                @Field("userName") String userName
                ,
                @Field("oldPassword") String oldPassword
                ,
                @Field("newPassword") String newPassword


        );
        @FormUrlEncoded
        @POST("/api/member/login")
        void login(
                @Field("userName") String userName
                ,
                @Field("password") String oldPassword
,
                Callback<Driver> callback


        );

        @POST("/api/member/registerCustomer")
        Driver registerCustomer(
                @Field("userName") String userName,

                @Field("firstName") String firstName,
                @Field("lastName") String lastName,
                @Field("password") String password,
                @Field("mobileNumber") String mobileNumber

        );


        @POST("/api/member/registerDriver")
        Driver registerDriver(
                @Field("firstName") String firstName ,
                @Field("lastName") String lastName ,
                @Field("password") String password ,
                @Field("mobileNumber") String mobileNumber

        );


        @GET("/api/member/")
        Driver userName(
                @Field("userName") String userName



        );


}

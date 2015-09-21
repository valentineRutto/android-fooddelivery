package com.valentine.yama;


import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by valentine on 9/3/15.
 */
public class MyApp extends android.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Getterandsetter.class);
        // Add your initialization code here
        Parse.initialize(this, "eX4tyHBF7yjbN5tPqmbugnu6l9nonJIKLvvMXeI6", "hhfIkPjG0XjiqSktL3WskGnASiPRsxFnuZqWM8Tx");
        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

}
}

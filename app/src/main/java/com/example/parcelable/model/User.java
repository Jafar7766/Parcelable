package com.example.parcelable.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {


    private String name;
    private String email;
//    private int age;

    public static final Creator<User> CREATOR = new Creator<User>() {


        @Override
        public User createFromParcel(Parcel source) {
            String name = source.readString();
            String email = source.readString();
//            int age = source.readInt();
            return new User(name, email);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User(String name, String email){
        this.name = name;
        this.email = email;
//        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompany() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(email);
//        dest.writeInt(age);
    }
}

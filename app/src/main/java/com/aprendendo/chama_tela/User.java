package com.aprendendo.chama_tela;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private final String name;
    private final String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    protected User(Parcel in) {
        name = in.readString();
        email = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(email);
    }
}

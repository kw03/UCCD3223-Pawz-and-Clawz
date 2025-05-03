//imgur upload image user profile , pet profile
package com.example.newmyapp;

public interface OnImgurUploadComplete {
    void onUploadSuccess(String imageUrl);
    void onUploadFailed();
}

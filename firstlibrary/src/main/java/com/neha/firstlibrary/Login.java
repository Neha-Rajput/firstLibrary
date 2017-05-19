package com.neha.firstlibrary;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.net.URL;

/**
 * Created by neha on 19/5/17.
 */

public class Login {
    Bitmap image;
    String strUrl = "https://www.google.co.in/search?q=wallpaper+image&client=ubuntu&hs=iJ2&channel=fs&tbm=isch&imgil=Aks9J4GyyS928M%253A%253BxxICvHBo98JDBM%253Bhttp%25253A%25252F%25252Fwallpaper-gallery.net%25252Fwallpapers%25252Fimage-wallpaper.html&source=iu&pf=m&fir=Aks9J4GyyS928M%253A%252CxxICvHBo98JDBM%252C_&usg=__TjI3gScRVPDJX0JBUKRYP344qUA%3D&biw=1855&bih=983&ved=0ahUKEwjy7KyE3_vTAhVLuY8KHQ3MBEQQyjcIPg&ei=FcgeWbKOI8vyvgSNmJOgBA#imgrc=5ybxWnnvyJemBM:";
    private Context context;

    public Login(Context context) {

        this.context = context;
    }

    public void show(Context mainActivity) {

        System.out.println("Enter Number");

        try {
            URL url = new URL(strUrl);
            Bitmap image = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            mainActivity.setWallpaper(image);
        } catch (IOException e) {
            System.out.println(e);
        }

    }



}

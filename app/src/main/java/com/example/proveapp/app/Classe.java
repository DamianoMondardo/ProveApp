package com.example.proveapp.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class Classe {
    public static void telefono(Activity activity, String numero){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + numero));

        activity.startActivity(intent);
    }

    public static void browser(Activity activity){
        String url = "http://www.hdblog.it";

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));

        activity.startActivity(intent);
    }

    public static void chiamata(Activity activity, String numero){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + numero));

        activity.startActivity(intent);
    }

    public static void messaggio(Activity activity){
        String numero = "3342656833";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:" + numero));

        activity.startActivity(intent);
    }

    public static void maps(Activity activity){
        String partenza = "Trento";
        String destinazione = "Bolzano";

        String uri = "http://maps.google.com/maps?saddr=" + partenza + "&daddr=" + destinazione;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        activity.startActivity(intent);
    }

    public static void comandoVocale(Activity activity){
        Intent intent = new Intent(Intent.ACTION_VOICE_COMMAND);
        activity.startActivity(intent);
    }
}
package com.claudylab.smartdialogbox;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SmartDialogBox {

    public static void showSuccessDialog(Context context, String message, String closing_text){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        View dialogView = LayoutInflater.from(context).inflate(R.layout.success, null, false);
        TextView textView = dialogView.findViewById(R.id.message);
        textView.setText(message);
        Button button = dialogView.findViewById(R.id.btn_close);
        button.setText(closing_text);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alertDialog.isShowing())
                    alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }

    public static void showErrorDialog(Context context, String message, String closing_text){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        View dialogView = LayoutInflater.from(context).inflate(R.layout.error, null, false);
        TextView textView = dialogView.findViewById(R.id.message);
        textView.setText(message);
        Button button = dialogView.findViewById(R.id.btn_close);
        button.setText(closing_text);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alertDialog.isShowing())
                    alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }
    public static void showInfoDialog(Context context, String message, String closing_text){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        View dialogView = LayoutInflater.from(context).inflate(R.layout.info, null, false);
        TextView textView = dialogView.findViewById(R.id.message);
        textView.setText(message);
        Button button = dialogView.findViewById(R.id.btn_close);
        button.setText(closing_text);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alertDialog.isShowing())
                    alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }
    public static void showSearchDialog(Context context, String message, String closing_text){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        View dialogView = LayoutInflater.from(context).inflate(R.layout.search, null, false);
        TextView textView = dialogView.findViewById(R.id.message);
        textView.setText(message);
        Button button = dialogView.findViewById(R.id.btn_close);
        button.setText(closing_text);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alertDialog.isShowing())
                    alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }
    public static void showInternetDialog(Context context, String message, String closing_text){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        View dialogView = LayoutInflater.from(context).inflate(R.layout.internet, null, false);
        TextView textView = dialogView.findViewById(R.id.message);
        textView.setText(message);
        Button button = dialogView.findViewById(R.id.btn_close);
        button.setText(closing_text);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alertDialog.isShowing())
                    alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }

}
